import greenfoot.*;  

public class UnterwasserBoss extends Unterwasser
{
    
    public UnterwasserBoss()
    {    
        // super(600, 400, 1);
        // //backgroundMusic.playLoop();
        prepare();
    }
    
    private void prepare()
    {
        Hydreix hydreix = new Hydreix();
        addObject(hydreix, 490, 178);
        
        for (int i = 0; i<13; i++)
        {
            addObject(new Fels(), (21+(45*i)), 382);
            addObject(new Fels(), (21+(45*i)), 19);
        } 
        
        for (int i = 0; i<7; i++)
        {
            addObject(new Fels(), (561), 64+(45*i));
        } 

        // for (int i = 0; i<11; i++)
        // {
            // addObject(new InsWasser(), (10), 49+(30*i));
        // } 
        
    }
}
