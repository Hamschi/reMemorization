import greenfoot.*;  

public class Gedanken extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Gedankending.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    
    public Gedanken()
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
