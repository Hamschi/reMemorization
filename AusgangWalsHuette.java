import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AusgangWalsHuette extends Eingang
{


    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald());
    }


}
