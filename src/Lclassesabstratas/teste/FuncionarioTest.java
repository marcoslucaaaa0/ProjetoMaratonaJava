package Lclassesabstratas.teste;

import Lclassesabstratas.classes.Funcionario;
import Lclassesabstratas.classes.Gerente;
import Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v= new Vendedor("Marcos", "66780-6",1500,2000);
        Gerente g = new Gerente("Julia", "85567-6", 4000);
        g.calcularSalario();
        v.calcularSalario();
        System.out.println(v);
        System.out.println("---------------------------------------------------------");
        System.out.println(g);
        }

    }
