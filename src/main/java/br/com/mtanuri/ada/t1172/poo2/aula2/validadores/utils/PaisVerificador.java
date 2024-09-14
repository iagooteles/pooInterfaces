package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.utils;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;

public class PaisVerificador {
    public static boolean isBrazil(UsuarioDTO usuarioDTO) {
        String country = usuarioDTO.pais();
        return country.equals("Brasil");
    }
}
