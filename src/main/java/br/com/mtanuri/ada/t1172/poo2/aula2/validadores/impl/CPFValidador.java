package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.utils.PaisVerificador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPFValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        boolean isBrazil = PaisVerificador.isBrazil(usuarioDTO);
        if (isBrazil) {
            String cpf = usuarioDTO.documento();
            Matcher matcher = pattern.matcher(cpf);
            if (!matcher.matches()) {
                throw new DadosUsuarioInvalidosException("O CPF é inválido.");
            }
        }
    }
}
