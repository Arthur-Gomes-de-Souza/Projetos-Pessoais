import java.util.Scanner;

public class reservaCompaniaAerea {
    private static boolean[] assentos = new boolean[10];
    public static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        int escolha;


        do {
            System.out.println("1- Ver todos os assentos.");
            System.out.println("2- Reservar assento.");
            System.out.println("3- Sair.");
            System.out.println("Escolha uma opcao: ");
            escolha = tec.nextInt();

            switch (escolha) {
                case 1 -> verAssentos();
                case 2 -> reservarAssento();
                case 3 -> System.out.println("PROGRAMA ENCERRADO.");
                default -> {
                    System.out.println("ESCOLHA INVALIDA. TENTE NOVAMENTE.");
                    System.out.println("------------------------------------------------");
                    System.out.println();
                }
            }
        } while (escolha != 3);
    }
    private static void verAssentos() {
        for (int aux = 0; aux < assentos.length; aux++) {
            System.out.print("Assento " + (aux+1) + ": ");
            if (assentos[aux] == true)
                System.out.println("Reservado.");
            else
                System.out.println("Disponivel.");
        }
        System.out.println("------------------------------------------------");
        System.out.println();
    }
    private static void reservarAssento() {
        int numeroAssento;
        System.out.println("Insira o numero do assento: ");
        numeroAssento = tec.nextInt();
        if (assentos[numeroAssento - 1] == false) {
            assentos[numeroAssento - 1] = true;
            System.out.println("ASSENTO RESERVADO. OBRIGADO!");
            System.out.println("------------------------------------------------");
            System.out.println();
        } else {
            System.out.println("DESCULPA, ESSE ASSENTO JA ESTA RESERVADO!");
            System.out.println("------------------------------------------------");
            System.out.println();
        }
    }
}
