import greenfoot.*;  

public class Banditenteil extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Abteil.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    
    public Banditenteil()
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
