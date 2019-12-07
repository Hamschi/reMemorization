import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NachWald3 extends Portale
{


    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald3());
    }


}
