import greenfoot.*;  

public class Gedanken extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Gedankending.mp3");
    private GreenfootImage holzboden = new GreenfootImage("Himmel.png");
    
    public Gedanken()
    {    
        super(600, 400, 1); 
        setBackground(holzboden);
        prepare();
    }
    
    public void prepare()
    {
        Emrael emrael = new Emrael();
        emrael.setBewegungBlockiert(true);
        addObject(emrael, 300, 245);
    }
}
