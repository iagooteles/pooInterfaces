package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

public class NomeValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        if (usuarioDTO.nome().equals("")) {
            throw new DadosUsuarioInvalidosException("O Usuário(a) deve ter um nome e sobrenome.");
        } else {
            System.out.println("Nome e sobrenome validados.");
        }


    }

}
