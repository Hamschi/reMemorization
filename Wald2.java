import greenfoot.*;  

public class Wald2 extends Wald
{
    Emrael emrael;
    Wald1 wald1;
    private boolean Wald2TutorialVorbei = false;
    private boolean Wald2BeerenVorbei = false;
    Textbox textbox;
    
    public Wald2(Emrael em, Wald1 w1)
    {   emrael = new Emrael(em);
        addObject(emrael, em.getXNachPortal(), em.getYNachPortal());
        emrael.addLebensleiste();
        wald1 = w1;
        prepare();
    }
    
    public Wald2() {
        emrael = new Emrael();
        addObject(emrael, 80, 200);
        emrael.addLebensleiste();
        emrael.setBewegungBlockiert(false);
        wald1 = new Wald1();
        prepare();
    }
    
    private void prepare()
    {
        for (int i = 0; i<4; i++)
        {
            addObject(new Baum(), (390+(61*i)), 488);
            addObject(new Baum(), (390+(61*i)), 30);
            addObject(new Baum(), (30+(61*i)), 488);
            addObject(new Baum(), (30+(61*i)), 30);
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Baum(), (570), 101+(71*i));
        } 
        
        for (int i = 0; i<20; i++)
        {
            addObject(new NachWald1(this, wald1), (30), 30+(20*i));
        }
        Wald4 wald4 = new Wald4(emrael, this);
        Wald3 wald3 = new Wald3(emrael, this);
        for (int i = 0; i<7; i++)
        {
            addObject(new Portale(this, wald3), 240+(20*i), 30);// nach oben
            Portale nw4 = new Portale(this, wald4);
            nw4.setPortalFix(100,80);
            addObject(nw4, 240+(20*i), 450); // nach unten
        }
        addObject(new Drache(), 350, 100);
        addObject(new Drache(), 350, 300);
        addObject(new Drache(), 200, 200);
        
        if (Wald2TutorialVorbei == false) {
            skriptWald2Tutorial(emrael);
        }
        if (Wald2BeerenVorbei == false) {
            skriptWald2Beeren(emrael);
        }
    }
    private void skriptWald2Tutorial(Emrael emrael) {
        Textbox textbox = new Wald2Tutorial(emrael);
        addObject(textbox, 300,350);
    }
    private void skriptWald2Beeren(Emrael emrael) {
        Textbox textbox = new Wald2Beeren(emrael);
        addObject(textbox, 300,350);
    }

}
