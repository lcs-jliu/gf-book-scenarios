import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /*
     * Instance varaiables
     * (we can use these variables anywhere in the class)
     */
    int frames;

    //Create the array (list of names)
    String[] peopleInClass = {"Julio", "Liam", "Osman", "Simon", "Eric",
            "Phillip", "Joven", "Joe", "Gordon", "Sam", "Jeff", "Jason", "Selena",
            "Selena", "Jieun", "Nick"
        };

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        //Initialize instance variables
        frames = 0;
    }

    /*
     * act
     * (gets called repeatedly to create animation
     */

    public void act()
    {
        //Say "hello" to a different person each second
        if ( (frames % 60 == 0) && (frames / 60 < 16) )
        {
            //Only show a message when we are in the bounds of the array
            //showText("Array Index is:" + frames / 60, 400, 250);

            //Only say hello when we are in the bounds of the array
            // Say hello to everyone in the class!
            //showText("Hello " + peopleInClass[frames/60], 400, 170);
        }

        //Track frames
        frames += 1;

        //Show the frames
        //showText("" + frames, 100, 100);
    }
}