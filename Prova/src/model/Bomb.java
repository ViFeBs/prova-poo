package model;

public class Bomb extends Item{

    public Bomb() {
    }

    public Bomb(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }
    
    public void takeLife(Player p){
        p.setLife(p.getLife() - 1);
    }
}
