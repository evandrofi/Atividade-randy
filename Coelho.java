package Organismo;

import java.util.Random;

public class Coelho extends Organismo {
    public Coelho() {
        super("Coelho");
    }

    @Override
    public void crescer() {
        idade++;
        System.out.println(nome + " cresceu. Idade: " + idade);
    }

    @Override
    public void reproduzir() {
        if (idade >= 2 && new Random().nextBoolean()) {
            System.out.println(nome + " reproduziu.");
        }
    }

    @Override
    public void mover() {
        System.out.println(nome + " saltou na floresta.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " comeu grama.");
    }
}
