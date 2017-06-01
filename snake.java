import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor{
    
    
    private GreenfootImage subir1 = new GreenfootImage("snake7.png");
    private GreenfootImage subir2 = new GreenfootImage("snake8.png");
    private GreenfootImage subir3 = new GreenfootImage("snake9.png");
    private GreenfootImage dir1 = new GreenfootImage("snake1.png");
    private GreenfootImage dir2 = new GreenfootImage("snake2.png");
    private GreenfootImage dir3 = new GreenfootImage("snake3.png");
    private GreenfootImage esq1 = new GreenfootImage("snake6.png");
    private GreenfootImage esq2 = new GreenfootImage("snake5.png");
    private GreenfootImage esq3 = new GreenfootImage("snake4.png");
    private GreenfootImage descer1 = new GreenfootImage("snake10.png");
    private GreenfootImage descer2 = new GreenfootImage("snake11.png");
    private GreenfootImage descer3 = new GreenfootImage("snake12.png");
    private int frame = 1;
    private int speed = 2;
    boolean isDead = false;
    
    public void act() {
        if(isDead == false){
            moverSubir();
            moverEsquerda();
            moverDireita();
            moverDescer();
            foiPego(); 
        }
    }
    
    public void moverSubir(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-2);
            animacaoSubir();
        }
    }
    
    public void animacaoSubir(){
        if(frame == 1){
            setImage(subir1);
        } 
        else if(frame == 5){
            setImage(subir2);
        }
        else if(frame == 10){
            setImage(subir3);
            frame = 1;
            return;
        }
        
        frame++;
    }
    
    public void moverEsquerda(){
        if(Greenfoot.isKeyDown("left")){
            move(-2);
            animacaoEsquerda();
        }
    }
    
    public void animacaoEsquerda(){
        if(frame == 1){
            setImage(esq1);
        } 
        else if(frame == 5){
            setImage(esq2);
        }
        else if(frame == 10){
            setImage(esq3);
            frame = 1;
            return;
        }
        
        frame++;
    }
    
    public void moverDireita(){
        if(Greenfoot.isKeyDown("right")){
            move(2);
            animacaoDireita();
        }
    }
    
    public void animacaoDireita(){
        if(frame == 1){
            setImage(dir1);
        } 
        else if(frame == 5){
            setImage(dir2);
        }
        else if(frame == 10){
            setImage(dir3);
            frame = 1;
            return;
        }
        
        frame++;
    }
    
    public void moverDescer(){
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+2);
            animacaoDescer();
        }
    }
    
    public void animacaoDescer(){
        if(frame == 1){
            setImage(descer1);
        } 
        else if(frame == 5){
            setImage(descer2);
        }
        else if(frame == 10){
            setImage(descer3);
            frame = 1;
            return;
        }
        
        frame++;
    }
    
     public void foiPego(){
        if(isTouching(Inimigo.class))
        {
            ((LocalMissao) getWorld()).Preso();
        }
    }
    
    /*public void act() 
    {
        if (isDead == false){
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX() , getY() -2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX() , getY() +2);
        }
        if(Greenfoot.isKeyDown("a"))
        {
           Snake_bullet  novabullet = new Snake_bullet();
            GreenfootImage image = novabullet.getImage();
            image.scale(image.getWidth() / 5, image.getHeight() / 5);
            this.getWorld().addObject(novabullet, getX(), getY() - 1) ;
        }
    }
        foiPego();    
    }*/

}