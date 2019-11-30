import greenfoot.*;  



public class Lebensleiste extends Actor
{
    int leben = 10;
    int lebensleisteBreite = 120;
    int lebensleisteHoehe = 15;
    int pixelProLebenspunkt = (int) lebensleisteBreite/leben;
    
    public Lebensleiste()
    {
        update();
    }

    public void act() 
    {
        update();
    }    
    
    public void update()
    {
        setImage(new GreenfootImage(lebensleisteBreite + 2, lebensleisteHoehe + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, lebensleisteBreite + 1, lebensleisteHoehe +1);
        myImage.setColor(Color.GREEN);
        myImage.fillRect(1, 1, leben*pixelProLebenspunkt, lebensleisteHoehe);
    }
    
    public void lebenVerlieren()
    {
        leben--;
    }
}
