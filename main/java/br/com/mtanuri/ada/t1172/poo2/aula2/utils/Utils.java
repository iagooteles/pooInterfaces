package br.com.mtanuri.ada.t1172.poo2.aula2.utils;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;

public class Utils {

    public boolean validarNacionalidade(UsuarioDTO usuarioDTO) {

        if (usuarioDTO.pais().equalsIgnoreCase("Brasil")) {
            return true;
        } else {
            return false;
        }
    }
}
