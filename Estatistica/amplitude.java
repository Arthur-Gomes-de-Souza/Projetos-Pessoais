package Estatistica;

import java.util.ArrayList;

public class amplitude {
    public static double amplitudeTotal(ArrayList<Double> numeros) {
        double amplitudeTotal = numeros.get(numeros.size() - 1) - numeros.get(0);
        System.out.println("Amplitude Total: " + amplitudeTotal);
        return amplitudeTotal;
    }
    public static void amplitudeClasse(double amplitudeTotal, double k) {
        double a;
        a = amplitudeTotal / k;

    }
}
