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