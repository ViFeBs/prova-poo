package model;

public class Item extends GameObject{
    private boolean isVizivel;

    public boolean isVizivel() {
        return isVizivel;
    }

    public void setVizivel(boolean isVizivel) {
        this.isVizivel = isVizivel;
    }

    public Item() {
    }

    public Item(int posicaoX, int posicaoY, boolean isVizivel) {
        super(posicaoX, posicaoY);
        this.isVizivel = isVizivel;
    }

    
}
