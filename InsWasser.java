import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InsWasser extends Portale
{
    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new UnterwasserEingang());
    }
}
