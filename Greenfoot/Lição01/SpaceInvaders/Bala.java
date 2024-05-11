import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a Bala no jogo.
 * 
 * @author (Gustavo Vieira) 
 * @version (2024-04-27)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()-5);
        removerAlien();
        if(isAtEdge()){
            //getWorld().removeObject(this);
            ((SpaceInvadersWorld) getWorld()).removerBala();
        }
        //se atingiu o alien, rmeovemos e criamos um novo alien
        
        
    }
    /**
     * Método que verifica se a bala atinge o alien e remove-0 se atingido.
     */
    public void removerAlien(){
        if(isTouching(Alien.class)){
            removeTouching(Alien.class);
            //criando um novo alien
            getWorld().addObject(new Alien(), Greenfoot.getRandomNumber(getWorld().getWidth()),50);
        }
    }
}
