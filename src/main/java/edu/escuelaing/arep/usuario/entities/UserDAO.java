package edu.escuelaing.arep.usuario.entities;

import java.util.HashMap;
import java.util.Map;

public class UserDAO implements IPersistenceDAOUser {
    private Map<String,String> usuarios;
    //deivid123:8cd5db18bc56594a9b051e6530068fab60e007ebb84832d5f29b5dc1c664f3ef
    //eduardo123:5cc3d2d23a43b3acc067dc57ebeb3432ffdaeff2bb9a7f4ff3647a1ae4f052fb
    //jonathan123:aaf1edd812c13f5e052acd31e18ce8248ecd7869375d7b074d87465b19ff6cae
    public UserDAO(){
        usuarios = new HashMap<>();
        usuarios.put("deivid","8cd5db18bc56594a9b051e6530068fab60e007ebb84832d5f29b5dc1c664f3ef");
        usuarios.put("eduardo","5cc3d2d23a43b3acc067dc57ebeb3432ffdaeff2bb9a7f4ff3647a1ae4f052fb");
        usuarios.put("jonathan","aaf1edd812c13f5e052acd31e18ce8248ecd7869375d7b074d87465b19ff6cae");
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
