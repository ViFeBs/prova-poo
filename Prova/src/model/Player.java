package model;

import util.ExceptionParameter;

public class Player extends GameObject{
    private int direction;
    private int life;
    private boolean isInvencivel;

    public Player() {}
    
    
    public Player(int direction) {
        this.direction = direction;
    }


    public Player(int posicaoX, int posicaoY, int direction) {
        super(posicaoX, posicaoY);
        this.direction = direction;
    }


    public int getDirection() {
        return direction;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }
    public boolean isInvencivel() {
        return isInvencivel;
    }
    public void setInvencivel(boolean isInvencivel) {
        this.isInvencivel = isInvencivel;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        if(life < 0)
            throw new ExceptionParameter("Valor da vida não é valido");
        this.life = life;
    }
    
    public void movePrayer(int direction){
        if(canMove(direction)){
            switch (direction){
                case 0:
                    this.setPosicaoY(this.getPosicaoY() -10);
                break;
                case 180:
                    this.setPosicaoY(this.getPosicaoY() +10);
                break;
                case 270:
                    this.setPosicaoX(this.getPosicaoX() -20);
                case 90:
                    this.setPosicaoX(this.getPosicaoX() +10);
            }   
        }
    }

    private boolean canMove(int direction){
        if(direction <= this.getScreenSize())
            return true;
        return false;
    }
}
