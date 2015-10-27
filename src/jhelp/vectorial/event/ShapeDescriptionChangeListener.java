package jhelp.vectorial.event;

import jhelp.vectorial.layer.ShapeDescription;

/**
 * Listener of shape description changes
 * 
 * @author JHelp
 */
public interface ShapeDescriptionChangeListener
{
   /**
    * Called when shape description changed
    * 
    * @param shapeDescription
    *           Changed shape description
    */
   public void shapeDescriptionChanged(ShapeDescription shapeDescription);
}