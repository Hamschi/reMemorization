import greenfoot.*;  

public class UnterwasserBoss extends Unterwasser
{
    Emrael emrael;
    UnterwasserEingang unterwasserEingang;

    public UnterwasserBoss(UnterwasserEingang uwe)
    {   
        unterwasserEingang = uwe;
        // emrael = new Emrael();
        // addObject(emrael, 100, 100);
        // emrael.addLebensleiste();
        // emrael.setBewegungBlockiert(false);
        prepare(uwe);

    }
    
    public UnterwasserBoss()
    {
        UnterwasserEingang uwe = new UnterwasserEingang();
        prepare(uwe);
    }
    
    private void prepare(UnterwasserEingang uwe)
    {
        emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 250, 150);
        emrael.addLebensleiste();
        addObject(new Mob(300, 1000, 80, 10, 300), 453, 171);
        for (int i = 0; i<13; i++)
        {
            addObject(new Hindernis("Fels.png"), (21+(45*i)), 382);
            addObject(new Hindernis("Fels.png"), (21+(45*i)), 19);
        } 

        for (int i = 0; i<7; i++)
        {
            addObject(new Hindernis("Fels.png"), (561), 64+(45*i));
        } 

        for (int i = 0; i<20; i++)
        {
            Portale zumUnterwasserEingang = new Portale(this, uwe);
            zumUnterwasserEingang.setPortalFix(480, 236);
            addObject(zumUnterwasserEingang,(30), 30+(20*i));
        }
       
    }

    public void unterwasserBossSkript()
    {
        switch(emrael.phase)
        {
            case HydreixTreffen:
                skriptHydreixTreffen(emrael);
                break;
            case HydreixBesiegt:
                int mobs = getObjects(Mob.class).size();
                if(mobs ==0)
                {
                    skriptHydreixBesiegt(emrael);
                }
        }
    }

    public void skriptHydreixTreffen(Emrael emrael) {
        Textbox textbox = new HydreixTreffen(emrael);
        addObject(textbox, 300,350);
    }

    public void skriptHydreixBesiegt(Emrael emrael) {
            Textbox textbox = new HydreixBesiegt(emrael);
            addObject(textbox, 300,350);
    }
}
