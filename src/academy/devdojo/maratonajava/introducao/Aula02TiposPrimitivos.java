package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 1000000000;
        double salarioDouble = 2000.31;
        float salarioFloat = 3000.0F;
        byte idadeByte = 10;
        short idadeShort = 3300;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 67;

        String nome = "Vinicius";
        var nome2 = "Goku";

        System.out.println("A idade é " + idade);
        System.out.println(false);
        System.out.println(caractere);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println("Ola meu nome é " + nome);
    }
}
