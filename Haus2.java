import greenfoot.*;  

public class Haus2 extends Haeuser
{
    public Haus2()
    {
        Fussmatte fussmatte = new Fussmatte();
        addObject(fussmatte, 300, 383);
        Tisch tisch = new Tisch();
        addObject(tisch, 306, 214);
        for (int i = 0; i<5; i++)
        {
            addObject(new Unsichtbar(), (252+(25*i)), 177);
            addObject(new Unsichtbar(), (252+(25*i)), 225);
            addObject(new InsZentrumElshin(), (300+(7*i)), 380);
        }
    }
}
