import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Taverne extends Haeuser
{
    ElshinZentrum elshinZentrum;
    public Taverne(ElshinZentrum ez)
    {
        elshinZentrum = ez;
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
        Fussmatte fussmatte2 = new Fussmatte();
        addObject(fussmatte2, 514, 17);
        Barkeeper barkeeper = new Barkeeper();
        addObject(barkeeper, 289, 16);
        Unsichtbar unsichtbar = new Unsichtbar();
        addObject(unsichtbar, 389, 17);
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
        Zimmer zimmer = new Zimmer(this);
        for (int i = 0; i<5; i++)
        {
            Portale ezPortal = new Portale(this, elshinZentrum);
            ezPortal.setPortalFix(280,350);
            addObject(ezPortal, (300+(7*i)), 380);
            Portale zimmerPortal = new Portale(this, zimmer);
            zimmerPortal.setPortalFix(300,300);
            addObject(zimmerPortal, (479+(7*i)), 12);
            addObject(new Unsichtbar(), (48+(25*i)), 116);
            addObject(new Unsichtbar(), (48+(25*i)), 164);
            addObject(new Unsichtbar(), (447+(25*i)), 116);
            addObject(new Unsichtbar(), (447+(25*i)), 164);
            addObject(new Unsichtbar(), (48+(25*i)), 266);
            addObject(new Unsichtbar(), (447+(25*i)), 266);
            addObject(new Unsichtbar(), (48+(25*i)), 314);
            addObject(new Unsichtbar(), (447+(25*i)), 314);
            addObject(new Unsichtbar(), (229+(40*i)), 41);
            addObject(new Unsichtbar(), (229+(40*i)), 77);
        }
    }
}
