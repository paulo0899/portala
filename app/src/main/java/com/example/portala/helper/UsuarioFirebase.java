package com.example.portala.helper;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class UsuarioFirebase {

    public static String getIdUsuario(){
        FirebaseAuth auth = ConfiguracaoFirebase.getFirebaseAutenticacao();
        return auth.getCurrentUser().getUid();
    }

    public static FirebaseUser getUsuarioAtual(){
        FirebaseAuth user = ConfiguracaoFirebase.getFirebaseAutenticacao();
        return user.getCurrentUser();
    }

    public static boolean atualizarTipoUsuario(String tipo){
        try {
            FirebaseUser user = getUsuarioAtual();
            UserProfileChangeRequest profile = new UserProfileChangeRequest.Builder()
                    .setDisplayName(tipo)
                    .build();
            user.updateProfile(profile);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return true;
        }
    }

}
