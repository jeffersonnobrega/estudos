public class gerador_Senha {
    public static void main(String[] args) {
        String[] letras = {
                "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, Y, Z"
        };

        String[] numeros = {
                "0, 1, 2, 3, 4, 5, 6, 7, 8, 9,"
        };

        String[] especiais = {
                "*, !, @, ?, -, %, $, #, &, <, >, /"
        };

        int umLength = letras.length;
        int doisLength = numeros.length;
        int tresLengtrh = especiais.length;

        int rand1 = (int) (Math.random() * umLength);
        int rand2 = (int) (Math.random() * doisLength);
        int rand3 = (int) (Math.random() * tresLength);

        String fraseSenha = letras[rand1] + " " +
        numeros[rand2]    + " " +  especiais[rand3];

        System.out.println("senha: " + fraseSenha);
    }
}
