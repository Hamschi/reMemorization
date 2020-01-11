import greenfoot.*;  
    
public class ElshinZentrum extends Elshin
{
    Wald4 wald4;
    public ElshinZentrum(Emrael em, Wald4 wald)
    {
        wald4 = wald;
        prepare();
    }
    
    private void prepare()
    {
        Haus haus1 = new Haus();
        addObject(haus1, 127, 103);
        Bewohner1 bewohner1 = new Bewohner1();
        addObject(bewohner1, 222, 44);
        
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
        Tawerner tawerner = new Tawerner();
        addObject(tawerner, 310, 248);
        Taverne taverne = new Taverne(this);
        Portale inDieTaverne = new Portale(this, taverne);
        inDieTaverne.setPortalFix(300,320);
        addObject(inDieTaverne, 281, 293);
        
        for (int i = 0; i<9; i++)
        {
            addObject(new Mauer(), (14+(26*i)), 389);
            addObject(new Mauer(), (14+(26*i)), 14);
            addObject(new Mauer(), (378+(26*i)), 14);
        } 
        
        for (int i = 0; i<23; i++)
        {
            addObject(new Mauer(), (14+(26*i)), 389);
        }
        
        for (int i = 0; i<8; i++)
        {
            addObject(new Unsichtbar(), (322+(15*i)), 310);
            addObject(new Unsichtbar(), (218+(23*i)), 271);   
        }
        Banditenteil banditenteil = new Banditenteil(this);
        for (int i = 0; i<3; i++)
        {
            addObject(new Unsichtbar(), (70+(10*i)), 158);
            addObject(new Unsichtbar(), (160+(10*i)), 158); 
            addObject(new Unsichtbar(), (413+(10*i)), 158);
            addObject(new Unsichtbar(), (504+(10*i)), 158);
            addObject(new Unsichtbar(), (70+(58*i)), 131);
            addObject(new Unsichtbar(), (413+(58*i)), 131);
            addObject(new Unsichtbar(), (225+(10*i)), 310);
            addObject(new Portale(this, banditenteil), 595, 294+(25*i));
        }
        
        for (int i = 0; i<15; i++)
        {
            addObject(new Mauer(), (14), 40+(26*i));
        } 
      
        for (int i = 0; i<10; i++)
        {
            Portale nachWald4 = new Portale(this, wald4);
            nachWald4.setPortalFix(100, 320);
            addObject(nachWald4, (234+(20*i)), 5);
            addObject(new Mauer(), (586), 40+(26*i));
        }
        
    }
   
}
