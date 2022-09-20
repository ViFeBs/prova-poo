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
         int max = 3;
         int min = 0;
         int range = max - min + 1;
         int rand = (int)(Math.random() * range) + min;
         System.out.println(rand);
        if(canMove(rand)){
            if(rand == 0 ){
                this.setPosicaoY(this.getPosicaoY() -10); 
                this.setDirection(0);
            }
            if(rand == 1){
                this.setPosicaoY(this.getPosicaoY() +10); 
                this.setDirection(180);
            }
            if(rand == 2){
                this.setPosicaoX(this.getPosicaoX() -20);
                this.setDirection(270);
            } 
            if(rand == 3){
                this.setPosicaoX(this.getPosicaoX() +20); 
                this.setDirection(90);
            }
        }
    }

    private boolean canMove(int rand){  
        boolean ok = false;
        
        if(rand == 0)
            if(this.getPosicaoY() - 10 > 0)
                ok = true; 
        if(rand == 1)
            if(this.getPosicaoY() + 10 < this.getScreenSize())
                ok = true; 
        if(rand == 2)
            if(this.getPosicaoX() - 20 > 0)
                ok = true; 
        if(rand == 3)
            if(this.getPosicaoX() + 10 < this.getScreenSize())
                ok = true; 
        return ok;
    }
}
