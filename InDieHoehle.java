import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InDieHoehle extends Portale
{
    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new UnterwasserBoss());
    }
}
