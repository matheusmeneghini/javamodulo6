import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int qtdias;
        int qtalunos;
        int dataCorrente;
        int alunoCorrente;
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Diário de Classe =====");
        System.out.print("Informe a quantidade de dias: ");
        qtdias = scanner.nextInt();
        System.out.print("Informe a quantidade de alunos: ");
        qtalunos = scanner.nextInt();
        System.out.println("");
        System.out.println("");

        String[][] matriz = new String[qtdias][qtalunos];
        for (int idias = 0; idias < qtdias; idias++) {
            dataCorrente = idias + 1;
            System.out.println("----- Diário da data " + dataCorrente + " -----");
            for (int ialunos = 0; ialunos < qtalunos; ialunos++) {
                alunoCorrente = ialunos + 1;
                System.out.println("Aluno " + alunoCorrente + "  está presente ou ausente?");
                Scanner scanner2 = new Scanner(System.in);
                String tempResposta = scanner2.nextLine();
                if(tempResposta.length() == 7) {
                    tempResposta = tempResposta + " ";
                }
                matriz[idias][ialunos] = tempResposta;
            }
        }
        System.out.println("------------------- Relatório -------------------");
        System.out.print("\t\t");
        for (int i = 0; i < qtdias; i++) {
            dataCorrente = i + 1;
            System.out.print("Data " + dataCorrente + "\t\t");
        }
        System.out.println("");
        for (int ialunos = 0; ialunos < qtalunos; ialunos++) {
            alunoCorrente = ialunos + 1;
            System.out.print("Aluno " + alunoCorrente + "\t");
            for (int idias = 0; idias < qtdias; idias++) {
                System.out.print(matriz[idias][ialunos] + "\t");
            }
            System.out.println("");
        }
    }
}
