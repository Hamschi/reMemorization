import greenfoot.*;  
    
public class ElshinZentrum extends Elshin
{
    Wald4 wald4;
    Emrael emrael;
    Hindernis wache1;
    Hindernis wache2;
    
    public ElshinZentrum(Emrael em, Wald4 wald)
    {
        wald4 = wald;
        prepare();
    }
    
    public ElshinZentrum()
    {
        prepare();
    }
    
    private void prepare()
    {
        emrael = new Emrael();
        emrael.setBewegungBlockiert(false);
        addObject(emrael, 250, 150);
        emrael.addLebensleiste();
        
        Haus haus1 = new Haus();
        addObject(haus1, 127, 103);
        Bewohner bewohner = new Bewohner("ImpBew_vl.png");
        addObject(bewohner,222, 44);
        
        Haus1 h1 = new Haus1(this);
        Portale inHaus1 = new Portale(this, h1);
        inHaus1.setPortalFix(300,320);
        addObject(inHaus1, 128, 141);
        
        Haus haus2 = new Haus();
        addObject(haus2, 470, 103);
        Haus2 h2 = new Haus2(this);
        Portale inHaus2 = new Portale(this, h2);
        inHaus2.setPortalFix(300,320);
        addObject(inHaus2, 472, 141);
        Deko taverni = new Deko("Taverne.png");
        addObject(taverni, 310, 248);
        Taverne taverne = new Taverne(this);
        Portale inDieTaverne = new Portale(this, taverne);
        inDieTaverne.setPortalFix(300,320);
        addObject(inDieTaverne, 281, 293);
        
        for (int i = 0; i<9; i++)
        {
            Hindernis hindernis = new Hindernis("Mauer.png");
            hindernis.mauerSkalieren();
            addObject(hindernis, (14+(26*i)), 389);
            Hindernis hindernis2 = new Hindernis("Mauer.png");
            hindernis2.mauerSkalieren();
            addObject(hindernis2, (14+(26*i)), 14);
            Hindernis hindernis3 = new Hindernis("Mauer.png");
            hindernis3.mauerSkalieren();
            addObject(hindernis3, (378+(26*i)), 14);
        } 
        
        for (int i = 0; i<23; i++)
        {
            Hindernis hindernis = new Hindernis("Mauer.png");
            hindernis.mauerSkalieren();
            addObject(hindernis, (14+(26*i)), 389);
        }
        
        for (int i = 0; i<8; i++)
        {
            addObject(new Hindernis(), (322+(15*i)), 310);
            addObject(new Hindernis(), (218+(23*i)), 271);   
        }
        Banditenteil banditenteil = new Banditenteil(this);
        for (int i = 0; i<3; i++)
        {
            addObject(new Hindernis(), (70+(10*i)), 158);
            addObject(new Hindernis(), (160+(10*i)), 158); 
            addObject(new Hindernis(), (413+(10*i)), 158);
            addObject(new Hindernis(), (504+(10*i)), 158);
            addObject(new Hindernis(), (70+(58*i)), 131);
            addObject(new Hindernis(), (413+(58*i)), 131);
            addObject(new Hindernis(), (225+(10*i)), 310);
            addObject(new Portale(this, banditenteil), 595, 294+(25*i));
        }
        
        for (int i = 0; i<15; i++)
        {
            Hindernis hindernis = new Hindernis("Mauer.png");
            hindernis.mauerSkalieren();
            addObject(hindernis, (14), 40+(26*i));
        } 
      
        for (int i = 0; i<10; i++)
        {
            Portale nachWald4 = new Portale(this, wald4);
            nachWald4.setPortalFix(100, 320);
            addObject(nachWald4, (234+(20*i)), 5);
            Hindernis hindernis = new Hindernis("Mauer.png");
            hindernis.mauerSkalieren();
            addObject(hindernis, (586), 40+(26*i));
        }
        
        wache1 = new Hindernis("Bandit_liste.png");
        addObject(wache1, 586, 307);
        wache2 = new Hindernis("Bandit_liste.png");
        addObject(wache2, 586, 349);
    }
   
   public void elshinZentrumSkript()
    {
        switch(emrael.phase)
        {
            case AnkunftElshin:
                skriptAnkunftElshin(emrael);
        }
    }
    
    public void skriptAnkunftElshin(Emrael emrael) {
            Textbox textbox = new AnkunftElshin(emrael);
            addObject(textbox, 300,350);
    }
}
