import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Haus2 extends Haeuser
{
    public Haus2()
    {
        Fussmatte fussmatte = new Fussmatte();
        addObject(fussmatte, 300, 383);
        
        for (int i = 0; i<5; i++)
        {
            addObject(new InsZentrumElshin(), (300+(7*i)), 380);
        }
    }
}
