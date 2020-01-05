import greenfoot.*;  


public class Zimmer extends Haeuser
{

    public Zimmer()
    {
        Fussmatte fussmatte = new Fussmatte();
        addObject(fussmatte, 300, 383);
        Hocker hocker1 = new Hocker();
        addObject(hocker1, 311, 168);
        Hocker hocker2 = new Hocker();
        addObject(hocker2, 311, 261);
        Hocker hocker3 = new Hocker();
        addObject(hocker3, 223, 216);
        Hocker hocker4 = new Hocker();
        addObject(hocker4, 388, 216);
        Tisch tisch = new Tisch();
        addObject(tisch, 306, 214);

        for (int i = 0; i<4; i++)
        {
            addObject(new BettGruen(), 106+(130*i), 57);
        }
        for (int i = 0; i<3; i++)
        {
            addObject(new Kleiderschrank(), 172+(130*i), 39);
        }
        for (int i = 0; i<5; i++)
        {
            addObject(new Unsichtbar(), (252+(25*i)), 177);
            addObject(new Unsichtbar(), (252+(25*i)), 225);
            addObject(new InDieTaverne(), (300+(7*i)), 380);
        }
    }
}
