package model;

public class Booster extends Item{

    private int timeBoost;

    public Booster() {
    }

    public Booster(int posicaoX, int posicaoY, boolean isVizivel, int timeBoost) {
        super(posicaoX, posicaoY, isVizivel);
        this.timeBoost = timeBoost;
    }

    public void playerBoosted(Player p){
        if(timeBoost > 0)
            p.setInvencivel(true);
        else
            p.setInvencivel(false);
    }

    public int getTimeBoost() {
        return timeBoost;
    }

    public void setTimeBoost(int timeBoost) {
        this.timeBoost = timeBoost;
    }
}
