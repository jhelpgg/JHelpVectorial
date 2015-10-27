package jhelp.vectorial.event;

import jhelp.vectorial.path.Path;

/**
 * Listener of path changes
 * 
 * @author JHelp
 */
public interface PathChangeListener
{
   /**
    * Called when path changed
    * 
    * @param path
    *           Changed path
    */
   public void pathChanged(Path path);
}