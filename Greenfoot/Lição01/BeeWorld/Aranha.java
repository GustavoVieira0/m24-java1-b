import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Aranha para ser utilizada no jogo BeeWorld.
 * 
 * @author Gustavo Viea
 * @version 2024-04-20
 */
public class Aranha extends Inseto
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        // Verifica se o número aleátorio de 1 a 100 está menor ou igual a 10.
        if (Greenfoot.getRandomNumber(100)+1 <= 10){
            //Adiciona aleatóriamente de -45° a 45° para rotacionar.
            turn(Greenfoot.getRandomNumber(91)-45);
        }
        verificarCanto();
        acelerarAranha();
        capturaMosca();
        interceptarAbelha();
    }
    /**
     * Método que irá acelerar a aranha em determinada área do tabuleiro
     */
    public void acelerarAranha(){
        if(getX()>=200 && getX()<=600 && getY()>=100 && getY()<=500){
            move(2);
        }
    }
    /**
     * método que captura a mosca pela aranha
     */
    public void capturaMosca(){
        if(isTouching(Mosca.class)){
            //remove a mosca tocada
            removeTouching(Mosca.class); 
            //adicionando uma mosca nova no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(),pX,pY);
        }
    } 
    /**
     * Método que faz a aranha interceptar a abelha.
     */
    public void interceptarAbelha(){
                    //Cast de BeeWorld => força o mundo a ser do tipo BeeWorld.
        Abelha ab = ((BeeWorld) getWorld()).getAbelha();
        if(ab!=null){
            turnTowards(ab.getX(),ab.getY());
        }
    }
}
