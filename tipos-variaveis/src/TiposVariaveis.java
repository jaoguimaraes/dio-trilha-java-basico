public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "João Pedro";
        double salarioMinimo = 2500; //Estou dizendo que o salario mínimo é de 2500
        //double salario = 2.500 Estou dizendo que o salario é de 2.5

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI = 2.41; //nota-se que dessa forma não é possível alterar o valor de VALOR_DE_PI pois está declarado o "final" antes do tipo, exemplificando que é um valor fixo.
    }
}