import greenfoot.*;  



public class Lebensleiste extends Actor
{
    int leben = 100;
    int ursprungLeben = 100;
    int lebensleisteBreite = 120;
    int lebensleisteHoehe = 15;
    double pixelProLebenspunkt = (double)lebensleisteBreite/(double)ursprungLeben;
    boolean vonMob = false;
    
    public void setVonMob(boolean istMob) {
        vonMob = istMob;
    }
    public boolean istMobLeiste() {
        return vonMob;
    }
    
    public Lebensleiste()
    {
        update();
    }
    
    public Lebensleiste(int lebenspunkte) {
        leben = lebenspunkte;
        ursprungLeben = lebenspunkte;
    }
    
    public int getLeben() {
        return leben;
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
        myImage.fillRect(1, 1, (int)(leben*pixelProLebenspunkt), lebensleisteHoehe);
    }
    
    public void lebenVerlieren()
    {
        leben--;
    }
    
    public void schaden(int s) {
        leben = leben - s;
    }
}
