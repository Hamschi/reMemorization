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
        
        Hindernis kugel = new Hindernis("Kugel.png");
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
    }

}
