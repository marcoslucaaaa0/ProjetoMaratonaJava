package Oexception.test.teste;

import Oexception.test.customexception.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();

        }
    }

    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "GoKu";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "GoKu";
        String senhaDigitada = "123";
        if (!usuarioBancoDeDados.equals(usuarioDigitado) ||!senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado");
        }
    }
}

