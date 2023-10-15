package Ecossistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Organismo.Coelho;
import Organismo.Lobo;
import Organismo.Organismo;

public class Terreno {
    private List<Organismo> organismos;

    public Terreno() {
        organismos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (new Random().nextBoolean()) {
                organismos.add(new Lobo());
            } else {
                organismos.add(new Coelho());
            }
        }
    }

    public void realizarAcoes() {
        List<Organismo> organismosARemover = new ArrayList<>();

        for (Organismo organismo : organismos) {
            organismo.crescer();
            organismo.reproduzir();
            organismo.mover();
            organismo.comer();
            
            if (organismo instanceof Lobo) {
                Lobo lobo = (Lobo) organismo;
                for (Organismo outro : organismos) {
                    if (outro instanceof Coelho) {
                        Coelho coelho = (Coelho) outro;
                        lobo.comerCoelho(coelho);
                        organismosARemover.add(outro);
                        break; 
                    }
                }
            }
        }

        organismos.removeAll(organismosARemover);
    }

    public static void add(Terreno terreno) {
    }
}
