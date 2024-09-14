package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;
import br.com.mtanuri.ada.t1172.poo2.aula2.utils.Utils;


public class CPFValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        Utils util = new Utils();

        boolean isBrazil = util.validarNacionalidade(usuarioDTO);

        if (isBrazil) {
            String cpf = usuarioDTO.documento();
            if (cpf == null || cpf.length() != 11) {
                throw new DadosUsuarioInvalidosException("O CPF é inválido.");
            }
        }
    }

}
