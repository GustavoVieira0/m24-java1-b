import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a Nave do jogo.
 * 
 * @author (Gustavo Vieira) 
 * @version (2024-04-27)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //verificando se foi teclado para a esquerda, movemos para a esquerda
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        //verificando se foi teclado para a direita, movemos para a direita
        if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        //verificando se foi teclado a barra de espaços, criamos a bala
        if( Greenfoot.isKeyDown("space")){
            //getWorld().addObject(new Bala(),getX(),getY()-45);
            ((SpaceInvadersWorld) getWorld()).criarBala(getX(), getY()-45);
        }
    }
}
