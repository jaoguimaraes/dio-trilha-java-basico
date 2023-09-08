public class ResultadoEscolar {

    /*Modo mais robusto para trabalhar uma nota escolar.
    public static void main(String[] args) {
        int nota = 7;

        if(nota >= 7)
        System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)
        System.out.println("Prova de recuperação");

        else
        System.out.println("Reprovado");
    }*/

    /*Modo mais prático e simples de trabalhar uma nota escolar

    public static void main(String[] args) {
    int nota = 7;

    String resultado = nota >= 7 ? "Aprovado" : "Reprovado"; 

    System.out.println(resultado); 
    }*/

    public static void main(String[] args) {
        double nota =5.5;
        String resultado = nota >=7 ? "Aprovado" : nota >5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
}
}