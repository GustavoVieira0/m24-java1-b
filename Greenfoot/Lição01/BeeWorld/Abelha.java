import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Gustavo Vieira.
 * @version 2024-04-20.
 */
public class Abelha extends Actor
{
    //Constantes
    public static final int PONTOS = 100;
    //campos ou fields
    public int vidas = 0;
    public int score = 0;
    //Criando um campo do tipo conjunto de imagens.
    private GreenfootImage[] imagens;
    
    //Contructors
    public Abelha(){
        vidas = 3;
        score = 0;
        //Definir o tamanho do conjunto
        imagens = new GreenfootImage[4]; //Definindo o tamanho do conjunto de 4 elementos
        //Definir as imagens
        for(int i=0; i<4; i++){
            imagens[i] = new GreenfootImage("bee0"+(i+1)+".png");
        }
    }
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
        //verifica se foi capturada pela aranha
        capituradaPelaAranha();
        //mostrando quantas vidas tem a abelha
        mostrarVidas();
        // mostrando o score
        mostrarScore();
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
            //tocar Slarp
            //Greenfoot.playSound("slarp.wav");
            //Aumentar o Score
            score += PONTOS;
            //adicionando uma mosca nova no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(Greenfoot.getRandomNumber(5)+1,
            Greenfoot.getRandomNumber(360)),
            pX,pY);
        }
    }
    /**
     * Método que irá capturar a abelha pela aranha.
     */
    public void capituradaPelaAranha(){
        if(isTouching(Aranha.class)){
            //tocar ouch
            //Greenfoot.playSound("ouch,wav");
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(pX, pY);
            vidas--;
            if(vidas<1){
                Greenfoot.stop();
                getWorld().showText("GAVE OVER",400,300);
            }
        }
    }
    /**
     * Método para mostras as vidas da abelha
     */
    public void mostrarVidas(){
        getWorld().showText("Vidas"+ vidas, 60, 20);
    }
    /**
     * Método para mostrar Score de pontuação
     */
    public void mostrarScore(){
        getWorld().showText("Score"+ score, 700, 20);
    }
}


