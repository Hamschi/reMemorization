import greenfoot.*;  

public class Haus1 extends Haeuser
{
    ElshinZentrum elshinzentrum;
    Emrael emrael;
    
    public Haus1(ElshinZentrum ez)
    {
        elshinzentrum = ez;
        prepare(ez);
    }
    
    public Haus1()
    {
        ElshinZentrum ez = new ElshinZentrum();
        prepare(ez);
    }
    
    private void prepare(ElshinZentrum ez)
    {
        emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 299, 343);
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
