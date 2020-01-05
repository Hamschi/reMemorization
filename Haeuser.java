import greenfoot.*;  

public class Haeuser extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Schmiede.mp3");
    private GreenfootImage holzboden = new GreenfootImage("Holzboden.png");
    
    public Haeuser()
    {    
        super(600, 400, 1); 
        setBackground(holzboden);
        prepare();
    }
    
    public void prepare()
    {
        Emrael emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 299, 343);
    }
}
