import greenfoot.*;  

public class Haus2 extends Haeuser
{
    ElshinZentrum elshinZentrum;
    public Haus2(ElshinZentrum ez)
    {
        elshinZentrum = ez;
        Fussmatte fussmatte = new Fussmatte();
        addObject(fussmatte, 300, 383);
        Tisch tisch = new Tisch();
        addObject(tisch, 306, 214);
        for (int i = 0; i<5; i++)
        {
            addObject(new Unsichtbar(), (252+(25*i)), 177);
            addObject(new Unsichtbar(), (252+(25*i)), 225);
            Portale p = new Portale(this, ez);
            p.setPortalFix(480,190);
            addObject(p, (300+(7*i)), 380);
        }
    }
}
