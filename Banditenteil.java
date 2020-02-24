import greenfoot.*;  

public class Banditenteil extends Elshin
{
    Emrael emrael;
    Textbox textbox;
    ElshinZentrum elshinZentrum;
    
    public Banditenteil(ElshinZentrum ez)
    {
        prepare(ez);
    }
    
    public Banditenteil()
    {
        ElshinZentrum ez = new ElshinZentrum();
        prepare(ez);
    }
    
    private void prepare(ElshinZentrum ez)
    {
        emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 250, 150);
        emrael.addLebensleiste();
        
        Kugel kugel = new Kugel("Kugel.png");
        addObject(kugel, 500, 196);
        for (int i = 0; i<14; i++)
        {   
            Hindernis hindernis = new Hindernis("Mauer.png");
            hindernis.mauerSkalieren();
            addObject(hindernis, 586, 40+(26*i));
        } 
        
        for (int i = 0; i<23; i++)
        {
            Hindernis hindernis = new Hindernis("Mauer.png");
            hindernis.mauerSkalieren();
            addObject(hindernis, 14+(26*i), 14);
            Hindernis hindernis2 = new Hindernis("Mauer.png");
            hindernis2.mauerSkalieren();
            addObject(hindernis2, (14+(26*i)), 389);
        }
        
        for (int i = 0; i<5; i++)
        {
            Hindernis hindernis = new Hindernis("Mauer.png");
            hindernis.mauerSkalieren();
            addObject(hindernis, 405, 40+(26*i));  
            Hindernis hindernis2 = new Hindernis("Mauer.png");
            hindernis2.mauerSkalieren();
            addObject(hindernis2, 405, 274+(26*i));
        }

        for (int i = 0; i<11; i++)
        {
            Portale p = new Portale(this, ez);
            p.setPortalFix(530, 320);
            addObject(p, (10), 49+(30*i));
        } 
        
        addObject(new Mob(300, 1000, 80, 10, 500, "Bandit_hl.png"), 252, 356);
        addObject(new Mob(300, 1000, 80, 10, 500, "Bandit_vl.png"), 252, 44);
    }
    
    public void banditenteilSkript()
    {
        switch(emrael.phase)
        {
            case HinweisBanditen:
                skriptHinweisBanditen(emrael);
                break;
            case BradleyKonflikt:
                if((emrael.istInNaeheVonKugel() == true) && Greenfoot.isKeyDown("space"))
                {
                    skriptBradleyKonflikt(emrael);
                    break;
                }
            case BradleyBesiegt:
                    int anzahlMobs = getObjects(Mob.class).size();
                    if((anzahlMobs == 0) && emrael.phase == Emrael.Phase.BradleyBesiegt)
                    {
                        skriptBradleyBesiegt(emrael);
                        break;
                    }
            case Gedankending:
                if((emrael.istInNaeheVonKugel() == true) && (Greenfoot.isKeyDown("space")) && (emrael.phase == Emrael.Phase.Gedankending))
                {
                    skriptGedankending(emrael);
                    emrael.phase = Emrael.Phase.KriegserklaerungBarbar;
                    break;
                }
            case KriegserklaerungBarbar:
                if(emrael.phase == Emrael.Phase.KriegserklaerungBarbar)
                {
                    skriptKriegserklaerungBarbar(emrael);
                    break;
                }
        }
    }
    
    public void yadrinHinzufuegen()
    {
        addObject(new Yadrin("Yadrin_vl.png"), 497, 142);
    }
    public void bradleyHinzufuegen()
    {
        addObject(new Mob(300, 1000, 80, 10, 600, "Bradley_rege.png"), 339, 202);
    }
    public void skriptHinweisBanditen(Emrael emrael) {
            Textbox textbox = new HinweisBanditen(emrael);
            addObject(textbox, 300,350);
    }
    public void skriptBradleyKonflikt(Emrael emrael) {
            Textbox textbox = new BradleyKonflikt(emrael, this);
            addObject(textbox, 300,350);
    }
    public void skriptBradleyBesiegt(Emrael emrael) {
            Textbox textbox = new BradleyBesiegt(emrael);
            addObject(textbox, 300,350);
    }
    public void skriptGedankending(Emrael emrael) {
            Textbox textbox = new Gedankending(emrael);
            addObject(textbox, 300,350);
    }
    public void skriptKriegserklaerungBarbar(Emrael emrael) {
            Textbox textbox = new KriegserklaerungBarbar(emrael);
            addObject(textbox, 300,350);
    }
}
