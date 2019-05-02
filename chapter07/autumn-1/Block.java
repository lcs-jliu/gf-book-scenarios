import greenfoot.*;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;

    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        checkForLeafCollision();
    }

    /**
     * Remove a Leaf Object if we are intersecting with it.
     */
    private void checkForLeafCollision()
    {
        //Get an object reference to a single leaf from any Leaf objects we are currently
        //intrsecting
        //NOTE: By placing a type in brackets before the call to getOneIntersectingObject
        //      we ***cast*** (or force) the type to change the Actor to Leaf
        //NOTE 2; We can do this becuase Leaf is a subclass of actor
        Leaf someLeaf = (Leaf)getOneIntersectingObject(Leaf.class);
        
        //Check that the someLeaf object acually has a reference to an object
        //If it is null, that means there was no Leaf intersecting this block this time around
        if(someLeaf != null)
        {
            //someLeaf is NOT null... so now we can remove it
            World myWorld = getWorld();
            myWorld.removeObject(someLeaf);
        }
    }

    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }

    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction

            //Add a new Leaf object to the world
            //Add a reference to the World
            World myWorld = getWorld();
            // 2. Use the object reference to call,or use,method on the world object
            myWorld.addObject(new Leaf(),getX(),getY());
        }
    }

    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        //When null is the argument, Greefoot responds to a mouse click ANYWHERE on screen
        //When null is the argument, Greefoot responds to a mouse click ONLY on Block object
        //
        if (Greenfoot.mouseClicked(this)) 
        {
            // 1.Get an object reference to the world
            World myWorld = getWorld();
            
            // Make a message show on screen when the mouse is clicked
            myWorld.showText("mouse was clicked",200,200);
        }
    }

}
