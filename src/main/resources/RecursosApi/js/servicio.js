var Servicios = (function () {
    function publicarComentario(idtextusuarios,idtextcomentario){
        if(idtextusuarios.length !== 0 && idtextcomentario.length !== 0){
            const comment={user:idtextusuarios,body:idtextcomentario} //Creando Formato JSon, El nombre tiene que ser igual que en el Usuario
            console.log(comment);
            axios.post("/publicarComentario",comment).then(res=>{ //Llamar la instancia Login para validar datos
                if(res.data==="No se pudo publicar el comentario") {
                    window.location.href = 'http://localhost:35000/RecursosApi/ServicioPost.html';
                }
            })
        }
        else {
            alert("Antes de Publicar un comentario debe llenar los campos.");
        }
    }
    function getComentarios(){
        axios.get("/obtnerComentarios").then(res=>{
            var i ;
            for (i = 0; i < res.data.length; i ++){
                var comentarioTitulo = "idComent"+i;
                document.getElementById(comentarioTitulo).innerHTML = JSON.stringify(res.data[i], null, ' ');
            }
            //document.getElementById("idComentarios").innerHTML = JSON.stringify(res.data, null, ' ');
        })
    }
    return {
        publicarComentario:publicarComentario,
        getComentarios:getComentarios
    };
})();
