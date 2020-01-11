import greenfoot.*;  

public class Unterwasser extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Wasser.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    private int time = 0;
    
    public Unterwasser()
    {    
        super(600, 400, 1);
        //backgroundMusic.playLoop();
        Greenfoot.setSpeed(50);
        prepare();
    }
    
    public Lebensleiste getLebensleiste()
    {
        return lebensleiste;
    }
 
    private void prepare()
    {
        time = 7406;
        //adding objects here
        Emrael emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 250, 150);
    }
 
    public void act()
    {
        time--;
        if (time == 0)
        {
            // removeObjects(getObjects(null));
            Greenfoot.setWorld(new Unterwasser());
    }
}

}
