package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;
import br.com.mtanuri.ada.t1172.poo2.aula2.utils.Utils;


public class CPFValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        Utils util = new Utils();
        boolean brasileiro = util.validarNacionalidade(usuarioDTO);

        if (brasileiro) {
            String cpf = usuarioDTO.documento();
            if (!validarCPF(cpf)) {
                throw new DadosUsuarioInvalidosException("O CPF é inválido.");
            }
        } else {
            return;
        }
    }

    private boolean validarCPF(String cpf) {
        return cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
    }

}
