package jhelp.vectorial.event;

import jhelp.vectorial.path.PathElement;

/**
 * Listener of path element changes
 * 
 * @author JHelp
 */
public interface PathElementChangeListener
{
   /**
    * Called when path element changed
    * 
    * @param pathElement
    *           Path element changed
    */
   public void pathElementChanged(PathElement pathElement);
}