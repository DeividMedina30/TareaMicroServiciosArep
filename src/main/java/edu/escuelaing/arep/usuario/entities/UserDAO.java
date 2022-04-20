package edu.escuelaing.arep.usuario.entities;

import java.util.HashMap;
import java.util.Map;

public class UserDAO implements IPersistenceDAOUser {
    private Map<String,String> usuarios;
    //holamundo123:96ef2b5190e7f1b7060d9b4c18a0348dda48c906911cd385bf237fd1c35c0c46
    public UserDAO(){
        usuarios = new HashMap<>();
        usuarios.put("correopruebas610@gmail.com","96ef2b5190e7f1b7060d9b4c18a0348dda48c906911cd385bf237fd1c35c0c46");
    }

    @Override
    public String LoadPassByUser(String user) {
        return usuarios.get(user);
    }

    @Override
    public Map<String, String> loadUsers() {
        return usuarios;
    }
}
