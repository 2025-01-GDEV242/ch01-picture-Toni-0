/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{

    private Circle planet1;
    private Circle planet2;
    private Circle planet3;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        planet1 = new Circle();
        planet2 = new Circle();
        planet3 = new Circle();
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
            planet3.moveHorizontal(20);
            planet3.moveVertical(-40);
            planet3.changeSize(50);
            planet3.makeVisible();
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
