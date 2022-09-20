package model;

public class Bomb extends Item{

    public Bomb() {
    }

    public Bomb(int posicaoX, int posicaoY, boolean isVizivel) {
        super(posicaoX, posicaoY, isVizivel);
    }
    
    public void takeLife(Player p){
        p.setLife(p.getLife() - 1);
    }
}
