import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Taverne extends Haeuser
{
    public Taverne()
    {
        Tisch tisch = new Tisch();
        addObject(tisch, 500, 150);
        Tisch tisch2 = new Tisch();
        addObject(tisch2, 100, 150);
        Tisch tisch3 = new Tisch();
        addObject(tisch3, 500, 300);
        Tisch tisch4 = new Tisch();
        addObject(tisch4, 100, 300);
        Theke theke = new Theke();
        addObject(theke, 312, 44);
        Hocker hocker = new Hocker();
        addObject(hocker, 425, 30);
        Fussmatte fussmatte = new Fussmatte();
        addObject(fussmatte, 300, 383);
        Barkeeper barkeeper = new Barkeeper();
        addObject(barkeeper, 289, 16);
        addObject(new Unsichtbar(), 388, 16); 
        for (int i = 0; i<3; i++)
        {
            addObject(new Hocker(), 240+(50*i), 104);
        } 
        
        for (int i = 0; i<2; i++)
        {
            addObject(new Hocker(), 471+(70*i), 359);
            addObject(new Hocker(), 471+(70*i), 203);
            addObject(new Hocker(), 65+(70*i), 359);
            addObject(new Hocker(), 65+(70*i), 203);
        }
        
        for (int i = 0; i<5; i++)
        {
            addObject(new InsZentrumElshin(), (300+(7*i)), 380);
            addObject(new Unsichtbar(), (48+(25*i)), 116);
            addObject(new Unsichtbar(), (48+(25*i)), 164);
            addObject(new Unsichtbar(), (447+(25*i)), 116);
            addObject(new Unsichtbar(), (447+(25*i)), 164);
            addObject(new Unsichtbar(), (48+(25*i)), 266);
            addObject(new Unsichtbar(), (447+(25*i)), 266);
            addObject(new Unsichtbar(), (48+(25*i)), 314);
            addObject(new Unsichtbar(), (447+(25*i)), 314);
            addObject(new Unsichtbar(), (228+(40*i)), 76);
            addObject(new Unsichtbar(), (228+(40*i)), 44);       
        }
    }
}
