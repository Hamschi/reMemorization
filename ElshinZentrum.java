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
        
        for (int i = 0; i<22; i++)
        {
            addObject(new Mauer(), (14+(26*i)), 389);
        }
        
        for (int i = 0; i<15; i++)
        {
            addObject(new Mauer(), (14), 40+(26*i));
            addObject(new Mauer(), (586), 40+(26*i));
        } 
      
        for (int i = 0; i<10; i++)
        {
            addObject(new NachWald4(), (234+(20*i)), 5);
        }
        
    }
   
}
