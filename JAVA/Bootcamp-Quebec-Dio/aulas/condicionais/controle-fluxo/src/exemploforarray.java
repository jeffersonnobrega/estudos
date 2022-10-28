public class exemploforarray {
    public static void main(String[] args) {

        //em arrays o indice de elementos inicia no zero, indice no caso é alunos
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            // enquanto x for menor que o tamanho de alunos
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
