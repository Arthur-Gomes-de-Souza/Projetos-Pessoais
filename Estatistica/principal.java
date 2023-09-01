package Estatistica;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        int n;

        System.out.println("Informe a quantidade de números: ");
        n = tec.nextInt();
        for (int i = 1; i<= n; i++) {
            System.out.println("Informe o " + i + "º número: ");
            numeros.add(tec.nextDouble());
        }

        rol.Rol(numeros);
        System.out.println();
        amplitude.amplitudeTotal(numeros);
        clase.Clase(n);
        System.out.println();
        tec.close();
    }
}
