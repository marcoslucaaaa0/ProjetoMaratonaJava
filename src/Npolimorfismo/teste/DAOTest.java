package Npolimorfismo.teste;

import Npolimorfismo.classes.ArquivoDAOImpl;
import Npolimorfismo.classes.DatabaseDAOImpl;
import Npolimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAOImpl();
        arquivoDAO.save();
        List<String>lista=new ArrayList<>();
        lista.add("nome 1");
        lista.add("nome 2");
        lista.add("nome 3");
        lista.add("nome 4");
       for (String nome : lista){
           System.out.println(nome);
       }
    }
}

