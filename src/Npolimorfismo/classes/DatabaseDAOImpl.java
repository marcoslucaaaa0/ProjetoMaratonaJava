package Npolimorfismo.classes;

public class DatabaseDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no Banco de Dados");
    }
}
