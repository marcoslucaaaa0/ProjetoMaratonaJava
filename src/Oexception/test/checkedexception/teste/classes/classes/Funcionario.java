package Oexception.test.checkedexception.teste.classes.classes;

import Oexception.test.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        super.salvar();
    }
}
