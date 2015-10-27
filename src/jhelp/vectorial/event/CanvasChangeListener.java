package jhelp.vectorial.event;

import jhelp.vectorial.layer.Canvas;

/**
 * Listener of canvas changes
 * 
 * @author JHelp
 */
public interface CanvasChangeListener
{
   /**
    * Called when canvas changed
    * 
    * @param canvas
    *           Changed canvas
    */
   public void canvasChanged(Canvas canvas);
}