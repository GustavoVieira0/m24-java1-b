import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer a parte do jogo BeeWorld
 * 
 * @author Gustavo Vieira
 * @version 2024-04-20
 */
public class Mosca extends Inseto
{
    //Campos e fields
    private int velocidade = 0;
    //Constructor padrão( não recebe parametros).
    public Mosca(){
        velocidade = 1;
    }
    //Contructor personalizado com sobrecarga de métodos
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang);//Colocando o angulo que eu passar.
    }
    /**
     * Método Act é executado sempre que apertamos o botão Act ou
     * ficará em execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();
    }
}
