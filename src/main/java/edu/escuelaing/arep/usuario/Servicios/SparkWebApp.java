package edu.escuelaing.arep.usuario.Servicios;

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

    public static void main( String[] args )
    {
        port(getPort());
        before("/RecursosApi/*",SparkWebApp::validarIngresoInvalido);
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
