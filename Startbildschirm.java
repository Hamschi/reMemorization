import greenfoot.*;  

public class Startbildschirm extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Start.mp3");
    
    public Startbildschirm()
    {    
        super(600, 400, 1); 
        prepare();
        //backgroundMusic.playLoop();
    }
    
    private void prepare()
    {
        TitelBuchstaben titelBuchstaben = new TitelBuchstaben();
        addObject(titelBuchstaben, 300, 200);
    }
    
    public void act()
    {
    if(Greenfoot.isKeyDown("enter"))
    Greenfoot.setWorld(new Wald1());
    
    }
}
