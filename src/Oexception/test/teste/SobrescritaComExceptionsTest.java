package Oexception.test.teste;

import Oexception.test.checkedexception.teste.classes.classes.Funcionario;
import Oexception.test.checkedexception.teste.classes.classes.Pessoa;
import Oexception.test.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f=  new Funcionario();
        Pessoa p = new Pessoa();
        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
