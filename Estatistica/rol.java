package Estatistica;

import java.util.ArrayList;

public class rol {
    public static void Rol(ArrayList<Double> numeros) {

        for (int i = 0; i < numeros.size() - 1; i++) {
            for (int j = 0; j < numeros.size() - 1; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {
                    double temp = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temp);
                }
            }

        }
        System.out.println("Numeros em Rol: ");
        for (Double numero : numeros) {
            System.out.print(numero + " | ");
        }
    }
}
