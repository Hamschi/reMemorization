import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Huette extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Huette.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    
    public Huette()
    {    
        super(600, 400, 1);
        //backgroundMusic.playLoop();
        prepare();
    }
    
    public Lebensleiste getLebensleiste()
    {
        return lebensleiste;
    }
    
    private void prepare()
    {
    }
}
