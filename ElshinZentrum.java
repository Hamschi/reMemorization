import greenfoot.*;  
    
public class ElshinZentrum extends Elshin
{
    public ElshinZentrum()
    {
        prepare();
    }
    
    private void prepare()
    {
        Haus haus1 = new Haus();
        addObject(haus1, 127, 103);
        InHaus1 inHaus1 = new InHaus1();
        addObject(inHaus1, 128, 141);
        Haus haus2 = new Haus();
        addObject(haus2, 470, 103);
        Tawerner tawerner = new Tawerner();
        addObject(tawerner, 310, 248);
        InDieTaverne inDieTaverne = new InDieTaverne();
        addObject (inDieTaverne, 281, 293);
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
            addObject(new Unsichtbar(), (322+(8*i)), 294);
            addObject(new Unsichtbar(), (218+(23*i)), 271);   
        }
        
        for (int i = 0; i<3; i++)
        {
            addObject(new Unsichtbar(), (70+(10*i)), 158);
            addObject(new Unsichtbar(), (160+(10*i)), 158); 
            addObject(new Unsichtbar(), (413+(10*i)), 158);
            addObject(new Unsichtbar(), (504+(10*i)), 158);
            addObject(new Unsichtbar(), (70+(58*i)), 131);
            addObject(new Unsichtbar(), (413+(58*i)), 131);
            addObject(new Unsichtbar(), (225+(10*i)), 310);
            addObject(new InsBanditenteil(), 595, 294+(25*i));
        }
        
        for (int i = 0; i<15; i++)
        {
            addObject(new Mauer(), (14), 40+(26*i));
        } 
      
        for (int i = 0; i<10; i++)
        {
            addObject(new NachWald4(), (234+(20*i)), 5);
            addObject(new Mauer(), (586), 40+(26*i));
        }
        
    }
   
}
