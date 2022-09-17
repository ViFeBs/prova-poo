package model;

public class Booster extends Item{

    private int timeBoost = 10;

    public Booster() {
    }

    public Booster(int posicaoX, int posicaoY, int timeBoost) {
        super(posicaoX, posicaoY);
        this.timeBoost = timeBoost;
    }

    public void playerBoosted(Player p){
        if(timeBoost > 0)
            p.setInvencivel(true);
    }

    public int getTimeBoost() {
        return timeBoost;
    }

    public void setTimeBoost(int timeBoost) {
        this.timeBoost = timeBoost;
    }
}
