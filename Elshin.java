import greenfoot.*;  
    
    public class Elshin extends World
    {
        private GreenfootSound musik = new GreenfootSound("Elshin.mp3");
        Lebensleiste lebensleiste = new Lebensleiste();
        
        public Elshin()
        {    
            super(600, 400, 1);
        }
        
        public Lebensleiste getLebensleiste()
        {
            return lebensleiste;
        }
        public void musikAbspielen()
        {
            musik.playLoop();
        }
        public void musikPausieren()
    {
        musik.pause();
    }
}
