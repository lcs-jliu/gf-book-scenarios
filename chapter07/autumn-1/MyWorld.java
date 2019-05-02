import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    int leaf = 0;
    
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        loop();
    }
    
    private void loop()
    {
        for (int leaf = 1; leaf <= 18; leaf += 1)
        {
            //Create the object
            Leaf aLeaf = new Leaf();
            
            //Position
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            
            //Now actually add the object to the world
            addObject(aLeaf,x ,y);
        }
    }
    
    
}
