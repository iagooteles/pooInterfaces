package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

import java.time.LocalDate;

public class IdadeValidador implements ValidacaoUsuario {
    public static boolean isAdult(int idade) {
        return idade >= 18;
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        return hoje.getYear() - dataNascimento.getYear();
    }

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        if (!isAdult(calcularIdade(usuarioDTO.dataNascimento()))) {
            throw new DadosUsuarioInvalidosException("Usuário deve ter idade igual ou maior que 18 anos.");
        }
    }
}
