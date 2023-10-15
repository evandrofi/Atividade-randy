package Ecossistema;

import java.util.ArrayList;
import java.util.List;

public class Ecossistema {
    private List<Terreno> terrenos;
    private int numeroDeCiclos;

    public Ecossistema(int numeroDeTerrenos, int numeroDeCiclos) {
        this.numeroDeCiclos = numeroDeCiclos;
        terrenos = new ArrayList<>();
        for (int i = 0; i < numeroDeTerrenos; i++) {
            terrenos.add(new Terreno());
        }
    }

    public void simular() {
        for (int ciclo = 0; ciclo < numeroDeCiclos; ciclo++) {
            System.out.println("Ciclo " + (ciclo + 1) + ":\n");

            simularEventosNaturais();
            trazerNovosAnimais();

            for (Terreno terreno : terrenos) {
                terreno.realizarAcoes();
            }

            System.out.println("\n==============================\n");
        }
    }

    private void simularEventosNaturais() {
        System.out.println(" Mudança no clima.");
    }

    private void trazerNovosAnimais() {
        System.out.println("Chegada de novos animais ou plantas.");
    }
}
