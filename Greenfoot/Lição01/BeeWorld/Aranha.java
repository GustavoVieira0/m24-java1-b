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
    }
}
