import greenfoot.*;  


public class Zimmer extends Haeuser
{
    Taverne taverne;
    Emrael emrael;
    public Zimmer(Taverne tavern)
    {
        taverne = tavern;
        prepare();
    }
    
    private void prepare()
    {
        emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 299, 343);
        Deko fussmatte = new Deko("Fußmatte.png");
        addObject(fussmatte, 300, 383);
        Deko hocker1 = new Deko("Hocker.PNG");
        addObject(hocker1, 311, 168);
        Deko hocker2 = new Deko("Hocker.PNG");
        addObject(hocker2, 311, 261);
        Deko hocker3 = new Deko("Hocker.PNG");
        addObject(hocker3, 223, 216);
        Deko hocker4 = new Deko("Hocker.PNG");
        addObject(hocker4, 388, 216);
        Deko tisch = new Deko("Tisch.png");
        addObject(tisch, 306, 214);

        for (int i = 0; i<4; i++)
        {
            addObject(new Bett("BettGruen.png"), 106+(130*i), 57);
        }
        for (int i = 0; i<3; i++)
        {
            addObject(new Hindernis("Kleiderschrank.png"), 172+(130*i), 39);
        }
        for (int i = 0; i<5; i++)
        {
            addObject(new Hindernis(), (252+(25*i)), 177);
            addObject(new Hindernis(), (252+(25*i)), 225);
            Portale p = new Portale(this, taverne);
            p.setPortalFix(520, 70);
            addObject(p, (300+(7*i)), 380);
        }
    }
    
    public void zimmerSkript()
    {
        switch(emrael.phase)
        {
            case EmraelAusgeruht:
                if((emrael.istInNaeheVonBett() == true) && (Greenfoot.isKeyDown("space")))
                {
                    skriptEmraelAusgeruht(emrael);
                }
        }
    }
    
    public void skriptEmraelAusgeruht(Emrael emrael) {
            Textbox textbox = new EmraelAusgeruht(emrael);
            addObject(textbox, 300,350);
    }
}
