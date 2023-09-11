public class ExemploForArray {
    /*public static void main(String[] args) {

        //em arrays o indice de elemetentos inicia em 0.
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }*/

    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}
