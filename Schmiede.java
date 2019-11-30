import greenfoot.*;  

public class Schmiede extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Schmiede.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    
    public Schmiede()
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
