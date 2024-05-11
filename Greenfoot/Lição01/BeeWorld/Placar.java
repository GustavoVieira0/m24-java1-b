import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Está classe vai representar um placar no jogo BeeWorld
 * 
 * @author Gustavo Vieira 
 * @version 2024-05-11
 */
public class Placar extends Actor
{
    //fields ou Campos ou Variaveis de instâncias
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    
    //constructor
    public Placar(){
        texto = "Score = 0";
        tamanhoTexto = 32;
        corFonte = Color.BLUE;
        //corFonte = new Color(0,0,255,50);
        atualizarImagem();
    }
    //Getters (acessadores dos campos)e Settera (modificadores dos campos);
    
    public String getTexto(){
        return texto;
    }
    
    public void setTexto(String value){
        texto = value;
        atualizarImagem();
    }
    
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void atualizarImagem(){
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(),tamanhoTexto);
        img.setColor(corFonte);
        //                Nomefonte, bold, italico, tamanho
        img.setFont(new Font("Arial",true,false,tamanhoTexto));
        img.drawString(texto,0,tamanhoTexto);
        setImage(img);
    }
    
}
