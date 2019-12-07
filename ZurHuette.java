import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class ZurHuette extends Portale
{


    public void act() {
        if (isTouching(Emrael.class)) {
            List<Emrael> emreals = getWorld().getObjects(Emrael.class);
            Greenfoot.setWorld(new Huette(emreals.get(0)));
        }
            
    }


}
