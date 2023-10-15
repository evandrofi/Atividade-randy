package Organismo;

import java.util.Random;

public class Lobo extends Organismo {
    public Lobo() {
        super("Lobo");
    }

    @Override
    public void crescer() {
        idade++;
        System.out.println(nome + " cresceu. Idade: " + idade);
    }

    @Override
    public void reproduzir() {
        if (idade >= 3 && new Random().nextBoolean()) {
            System.out.println(nome + " reproduziu.");
        }
    }

    @Override
    public void mover() {
        System.out.println(nome + " moveu-se na floresta.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " caçou uma presa.");
    }

    public void comerCoelho(Coelho coelho) {
        System.out.println(nome + " caçou e comeu um coelho.");
    }
}
