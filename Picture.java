/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Anthony Morales
 * @version 2025.1/26/25
 */
public class Picture
{

    private Circle planet1;
    private Circle planet2;
    private Circle planet3;
    private Circle planet4;
    private Circle planet5;
    private Person astro;
    private Square body1;
    private Square body2;
    private Triangle thrust;
    private Triangle top;
    private Circle star;
    private Circle celina;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        planet1 = new Circle();
        planet2 = new Circle();
        planet3 = new Circle();
        planet4 = new Circle();
        astro = new Person();
        body1 = new Square();
        body2 = new Square();
        thrust = new Triangle();
        top = new Triangle();
        star = new Circle();
        celina = new Circle();
        planet5 = new Circle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
    
            planet1.changeColor("yellow");
            planet1.moveHorizontal(150);
            planet1.moveVertical(75);
            planet1.changeSize(400);
            planet1.makeVisible();
            
            planet2.changeColor("magenta");
            planet2.moveHorizontal(-400);
            planet2.moveVertical(60);
            planet2.changeSize(350);
            planet2.makeVisible();
            
            planet3.changeColor("red");
            planet3.moveHorizontal(90);
            planet3.moveVertical(-20);
            planet3.changeSize(80);
            planet3.makeVisible();
            
            planet4.changeColor("blue");
            planet4.moveHorizontal(-120);
            planet4.moveVertical(-50);
            planet4.changeSize(30);
            planet4.makeVisible();
            
            planet5.changeColor("yellow");
            planet5.moveHorizontal(10);
            planet5.moveVertical(-10);
            planet5.changeSize(10);
            planet5.makeVisible();
            
            astro.changeColor("white");
            astro.moveHorizontal(50);
            astro.moveVertical(50);
            astro.makeVisible();
            
            body1.changeColor("white");
            body1.moveHorizontal(-60);
            body1.moveVertical(80);
            body1.changeSize(20);
            body1.makeVisible();
            
            body2.changeColor("white");
            body2.moveHorizontal(-60);
            body2.moveVertical(100);
            body2.changeSize(20);
            body2.makeVisible();
            
            top.changeColor("white");
            top.moveHorizontal(50);
            top.moveVertical(50);
            top.changeSize(10,20);
            top.makeVisible();
            
            thrust.changeColor("white");
            thrust.moveHorizontal(50);
            thrust.moveVertical(90);
            thrust.changeSize(10,70);
            thrust.makeVisible();
            
            star.changeColor("white");
            star.moveHorizontal(-70);
            star.moveVertical(120);
            star.changeSize(10);
            star.makeVisible();
            
            celina.changeColor("white");
            celina.moveHorizontal(-80);
            celina.moveVertical(-40);
            celina.changeSize(5);
            celina.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
        planet1.changeColor("black");
        planet2.changeColor("black");
        planet3.changeColor("black");

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
     
        planet1.changeColor("yellow");
        planet2.changeColor("yellow");
        planet3.changeColor("red");
    }
}
