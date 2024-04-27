import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Gustavo Vieira.
 * @version 2024-04-20.
 */
public class Abelha extends Actor
{
    /**
     * Método que será executado quando apertado o botão Act ou Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        // Se teclar para a esquerda, gira -10°.
        if (Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        // Se teclar para a direita, gira 10°.
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
        //verificando se está nos cantos
        verificarPosicao();
        //verifica se toca em uma mosca
        capturaMosca();
    }
    /**
     * Método que verifica se está na direita do mundo
     */
    public boolean isNaDireita(){
        if(getX() > getWorld().getWidth()-10){
            return true;
        }
        return false;
    }

    /**
     * Método que verifica se está na esquerda do mundo
     */
    public boolean isNaEsquerda(){
        return(getX() < 10);
    }
    
    /**
     * Método que verifica se está na base do mundo
     */
    public boolean IsNaBase(){
        return( getY() >getWorld().getHeight()-10 );
    }
    
    /**
     * Método que verifica se está no topo do mundo
     */
    public boolean IsNoTopo(){
        return( getY() < 10 );
    }
    /**
     * Método que verifica se a Abelha está nos cantos e reposiciona ela
     */
    public void verificarPosicao(){
        //verifica se está na direita
        if(isNaDireita()){
            setLocation(10,getY());
        }
        //verifica se está na esquerda
        if(isNaEsquerda()){
            setLocation(getWorld().getWidth()-10,getY());
        }
        //verifica se está no topo do mundo
        if(IsNoTopo()){
            setLocation(getX(),getWorld().getHeight()-10);
        }
        //verifica se está na base do mundo
        if(IsNaBase()){
            setLocation(getX(), 10);
        }
    }
    /**
     * Método de captura a mosca
     */
    public void capturaMosca(){
        if( isTouching(Mosca.class)){
            //remove a mosca tocada
            removeTouching(Mosca.class);
            //adicionando uma mosca nova no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(),pX,pY);
        }
    }
}


