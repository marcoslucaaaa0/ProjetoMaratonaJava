package ZZBclassesinternas;

public class ClassesInternasTeste {
    private  String nome = "Marcos Lu";

    class Interna{
        public  void verClasseExterna(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTeste.this);
        }
    }

    public static void main(String[] args) {
        ClassesInternasTeste externa = new ClassesInternasTeste();
        ClassesInternasTeste.Interna in = externa.new Interna();
        ClassesInternasTeste.Interna in2 = new ClassesInternasTeste().new Interna();
        in2.verClasseExterna();
    }
}
////class Externa{
////    private  String nome ="Julinha";
////
////    class Interna{
////        public void verClasseExterna(){
////            System.out.println(nome);
////
////        }
////    }
//}