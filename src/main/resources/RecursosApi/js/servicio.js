var Servicios = (function () {
    function publicarComentario(idtextusuarios,idtextcomentario){
        if(idtextusuarios.length !== 0 && idtextcomentario.length !== 0){
            const url = 'http://ec2-54-90-158-62.compute-1.amazonaws.com:34000/postT?'+'user='+idtextusuarios+'&body='+idtextcomentario
            axios.get(url).then(res=>{ //Llamar la instancia Login para validar datos
            })
            .catch(error=>console.log(error))
        }
        else {
            alert("Antes de Publicar un comentario debe llenar los campos.");
        }
    }
    function getComentarios(){
        const url = 'http://ec2-54-164-24-197.compute-1.amazonaws.com:7654/Feed'
        axios.get(url)
        .then(res=>{
            var i ;
            for (i = 0; i < res.data.length; i ++){
                var comentarioTitulo = "idComent"+i;
                document.getElementById(comentarioTitulo).innerHTML = JSON.stringify(res.data[i], null, ' ');
            }
        })
        .catch(error=>console.log(error))
    }
    return {
        publicarComentario:publicarComentario,
        getComentarios:getComentarios
    };
})();
