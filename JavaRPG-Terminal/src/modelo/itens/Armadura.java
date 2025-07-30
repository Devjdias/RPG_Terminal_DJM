package modelo.itens;

import java.io.Serializable;
import modelo.personagens.Personagem;

public abstract class Armadura extends Item implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int defesa;

    public Armadura(String nome, int defesa) {
        super(nome);
        this.defesa = defesa;
    }

    public abstract void usar(Personagem personagem);
}
