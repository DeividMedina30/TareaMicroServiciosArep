package edu.escuelaing.arep.usuario.Servicios;

import edu.escuelaing.arep.usuario.entities.Comment;
import edu.escuelaing.arep.usuario.entities.User;
import edu.escuelaing.arep.usuario.entities.UserDAO;
import spark.Request;
import spark.Response;
import spark.Session;
import spark.staticfiles.StaticFilesConfiguration;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import static spark.Spark.*;
import com.google.gson.Gson;


public class SparkWebApp
{
    private static UserDAO usuarios = new UserDAO();
    private static User usuario;
    private static Comment comentario;

    public static void main( String[] args )
    {
        port(getPort());
        //before("/RecursosApi/*",SparkWebApp::validarIngresoInvalido);
        //before("/index.html", SparkWebApp::validarIngresoLogin);
        StaticFilesConfiguration staticHandler = new StaticFilesConfiguration();
        staticHandler.configure("/");
        before((request, response) -> staticHandler.consume(request.raw(), response.raw()));
        get("/RecursosApi",SparkWebApp::CargarPaginaServicios);
        post("/publicarComentario",SparkWebApp::postComentario);
        get("/obtnerComentarios",SparkWebApp::getComentarios);
    }

    private static Object getComentarios(Request request, Response response) throws IOException {
        return  UrlReader.getService();
    }

    private static Object CargarPaginaServicios(Request request, Response response) {
        response.redirect("RecursosApi/ServicioPost.html");
        return null;
    }

    private static Object postComentario(Request request, Response response) throws IOException {
        System.out.println("Entro a Servicio cargar Comentario");
        Gson gson = new Gson();
        comentario = gson.fromJson(request.body(),Comment.class);
        UrlReader.postServicio(comentario.getUser(),comentario.getBody());
        return null;
    }

    private static Object manipularLogin(Request request, Response response) {
        request.session(true); //Creamos la session
        Gson gson = new Gson();      //Creamos el gson
        usuario = gson.fromJson(request.body(),User.class); //Pasamos de tipo GSON a Objet tipo User
        if(usuario.getPassword().equals(usuarios.LoadPassByUser(usuario.getCorreo()))){
            request.session().attribute("usr",usuario.getCorreo());
            request.session().attribute("AUTHORIZED",true);
            response.redirect("LoginVerificado/UsuarioLogin.html");
        }
        else{
            return " ";
        }
        return " ";
    }

    private static void validarIngresoLogin(Request request, Response response) {
        request.session(true);
        if (request.session().isNew()) {
            request.session().attribute("AUTHORIZED", false);
        }
        boolean auth = request.session().attribute("AUTHORIZED");
        if (auth) {
            response.redirect("/RecursosApi/ServicioPost.html");
        }
    }

    private static void validarIngresoInvalido(Request request, Response response) {
        request.session(true);
        Session session = request.session();
        boolean newSession = session.isNew();
        if(newSession){
            request.session().attribute("AUTHORIZED",false);
        }else{
            boolean auth=request.session().attribute("AUTHORIZED");
            if(!auth) {
                halt(401, "<h1> 401 No esta autorizado para solicitar este recurso. </h1>");
            }
        };
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }
}
