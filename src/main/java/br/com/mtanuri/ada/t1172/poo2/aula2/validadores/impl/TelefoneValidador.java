package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.utils.PaisVerificador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelefoneValidador implements ValidacaoUsuario {
    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        Pattern pattern = Pattern.compile("^\\+55 \\d{2} \\d{5}-\\d{4}$");
        boolean isBrazil = PaisVerificador.isBrazil(usuarioDTO);
        if (isBrazil) {
            String telefone = usuarioDTO.telefone();
            Matcher matcher = pattern.matcher(telefone);
            if (!matcher.matches()) {
                throw new DadosUsuarioInvalidosException("Telefone é inválido.");
            }
        }
    }
}
