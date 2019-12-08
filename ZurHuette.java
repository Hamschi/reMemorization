import greenfoot.*; 
import java.util.List;

public class ZurHuette extends Portale
{

    public void act() 
    {
        if (isTouching(Emrael.class))
        {
            List<Emrael> emraels = getWorld().getObjects(Emrael.class);
            Greenfoot.setWorld(new Huette(emraels.get(0)));
        }        
    }


}
