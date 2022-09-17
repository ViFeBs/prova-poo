package model;

import util.ExceptionParameter;

public class GameObject {
    private int posicaoX;
    private int posicaoY;
    private int screensize;

    public GameObject() {}
    
    public GameObject(int posicaoX, int posicaoY) {
        if(posicaoX < 0 || posicaoY < 0)
            throw new ExceptionParameter("Valores das posições não são validos");
        
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }


    public int getPosicaoX() {
        return posicaoX;
    }
    public void setPosicaoX(int posicaoX) {
        if(posicaoX < 0)
            throw new ExceptionParameter("Valor da Posição x não é valida");
        this.posicaoX = posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }
    public void setPosicaoY(int posicaoY) {
        if(posicaoY < 0)
            throw new ExceptionParameter("Valor da Posição y não é valida");
        this.posicaoY = posicaoY;
    }

    public int getScreenSize() {
        return screensize;
    }

    public void setScreenSize(int screensize) {
        if(screensize <= 0)
            throw new ExceptionParameter("Tamanho da Tela não é valida");
        this.screensize = screensize;
    }
    
    
    
}
