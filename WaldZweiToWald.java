import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WaldZweiToWald extends Eingang
{


    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald());
    }


}
