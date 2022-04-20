var Servicios = (function () {
    function login(usermameid,userPasswordid){
        const user={usuario:usermameid,password:userPasswordid} //Creando Formato JSon, El nombre tiene que ser igual que en el Usuario
        axios.post("/login",user).then(res=>{ //Llamar la instancia Login para validar datos
            if(res.data !== ' '){
                window.location.href= 'LoginVerificado/UsuarioLogin.html';
            }
            else {
                alert("El usuario i/o la clave esta incorrecto, vuelva a intentar");
            }
        })
    }
    return {
        login:login
    };
})();