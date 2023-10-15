package Organismo;

public abstract class Organismo {
    protected String nome;
    protected int idade;

    public Organismo(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    public abstract void crescer();

    public abstract void reproduzir();

    public abstract void mover();

    public abstract void comer();
}
