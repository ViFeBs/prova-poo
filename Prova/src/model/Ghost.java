package model;

public class Ghost extends GameObject{
    private int direction;

    public Ghost() {
    }

    

    public Ghost(int direction) {
        this.direction = direction;
    }



    public Ghost(int posicaoX, int posicaoY, int direction) {
        super(posicaoX, posicaoY);
        this.direction = direction;
    }



    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    public void moveGhost(){
         // define the range
         int max = 270;
         int min = 0;
         int range = max - min + 1;
         int rand = (int)(Math.random() * range) + min;
        if(canMove()){
            if(rand >= 0 && rand <= 90)
                this.setPosicaoY(this.getPosicaoY() -10); 
            if(rand >= 90 && rand <= 180)
                this.setPosicaoY(this.getPosicaoY() +10); 
            if(rand >= 180 && rand <= 200)
                this.setPosicaoX(this.getPosicaoX() -20); 
            if(rand >= 200)
                this.setPosicaoX(this.getPosicaoX() +10); 
        }
    }

    private boolean canMove(){  
        boolean ok = false;
        
        if(this.getPosicaoY() - 10 > 0)
            ok = true;
        if(this.getPosicaoY() + 10 > this.getScreenSize())
            ok = true;
        if(this.getPosicaoX() - 20 > 0)
            ok = true;
        if(this.getPosicaoX() + 10 > this.getScreenSize())
            ok = true;
        System.out.println(ok);
        return ok;
    }
}
