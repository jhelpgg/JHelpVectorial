/**
 * <h1>License :</h1> <br>
 * The following code is deliver as is. I take care that code compile and work, but I am not responsible about any damage it may
 * cause.<br>
 * You can use, modify, the code as your need for any usage. But you can't do any action that avoid me or other person use,
 * modify this code. The code is free for usage and modification, you can't change that fact.<br>
 * <br>
 * 
 * @author JHelp
 */
package jhelp.vectorial.event;

import jhelp.vectorial.shape.Shape;

/**
 * Listener of shape changes
 * 
 * @author JHelp
 */
public interface ShapeChangeListener
{
   /**
    * Called when shape changed
    * 
    * @param shape
    *           Changed shape
    */
   public void shapeChanged(Shape shape);
}