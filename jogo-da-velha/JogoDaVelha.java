import java.util.Scanner;

public class JogoDaVelha {

    private static char[][] tabuleiro = new char[4][4];
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        iniciarJogo();

        while (!verificarFimJogo()) {
            imprimirTabuleiro();
            fazerJogada();
            mudarJogador();
        }

        imprimirTabuleiro();
        determinarVencedor();
    }

    private static void iniciarJogo() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private static void imprimirTabuleiro() {
        System.out.println("-------------");
        for (int i = 1; i < 4; i++) {
            System.out.print("| ");
            for (int j = 1; j < 4; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void fazerJogada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jogador " + jogadorAtual + ", faça sua jogada (linha e coluna): ");
        int linha = scanner.nextInt();
        int coluna = scanner.nextInt();

        if (linha < 1 || linha >= 4 || coluna < 1 || coluna >= 4 || tabuleiro[linha][coluna] != '-') {
            System.out.println("Jogada inválida. Tente novamente.");
            fazerJogada();
        } else {
            tabuleiro[linha][coluna] = jogadorAtual;
        }
    }

    private static boolean verificarFimJogo() {
        return verificarVitoria() || verificarEmpate();
    }

    private static boolean verificarVitoria() {
        for (int i = 1; i < 4; i++) {
            if (tabuleiro[i][1] != '-' && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][2] == tabuleiro[i][3]) {
                return true;
            }
            if (tabuleiro[1][i] != '-' && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[2][i] == tabuleiro[3][i]) {
                return true;
            }
        }
        if (tabuleiro[1][1] != '-' && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[2][2] == tabuleiro[3][3]) {
            return true;
        }
        return tabuleiro[1][3] != '-' && tabuleiro[1][3] == tabuleiro[2][2] && tabuleiro[2][2] == tabuleiro[3][1];
    }

    private static boolean verificarEmpate() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void determinarVencedor() {
        if (verificarVitoria()) {
            System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
        } else {
            System.out.println("Empate! O jogo acabou sem vencedor.");
        }
    }

    private static void mudarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }
}

