import greenfoot.*;  

public class Haus2 extends Haeuser
{
    ElshinZentrum elshinZentrum;
    Emrael emrael;
    
    public Haus2(ElshinZentrum ez)
    {
        elshinZentrum = ez;
        prepare(ez);
    }
    public Haus2()
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
            p.setPortalFix(480,190);
            addObject(p, (300+(7*i)), 380);
        }
    }
}
