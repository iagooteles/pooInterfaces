package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.utils.Utils;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

public class TelefoneValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        Utils util = new Utils();
        boolean brasileiro = util.validarNacionalidade(usuarioDTO);

        if (brasileiro) {
            String telefone = usuarioDTO.telefone();
            if (!telefone.matches("\\+55 \\d{2} \\d{5}-\\d{4}")) {
                throw new DadosUsuarioInvalidosException("Telefone é inválido.");
            }
        }
    }
}
