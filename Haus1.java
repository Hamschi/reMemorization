import greenfoot.*;  

public class Haus1 extends Haeuser
{
    ElshinZentrum elshinzentrum;
    public Haus1(ElshinZentrum ez)
    {
        elshinzentrum = ez;
        Deko fussmatte = new Deko("Fußmatte.png");
        addObject(fussmatte, 300, 383);
        Deko tisch = new Deko("Tisch.png");
        addObject(tisch, 306, 214);
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis(), (252+(25*i)), 177);
            addObject(new Hindernis(), (252+(25*i)), 225);
            Portale p = new Portale(this, ez);
            p.setPortalFix(130, 190);
            addObject(p, (300+(7*i)), 380);
        }
        
        for (int i = 0; i<4; i++)
        {
            addObject(new Deko("BettLila.png"), 106+(130*i), 57);
        }
    }
}
