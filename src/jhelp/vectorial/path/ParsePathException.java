package jhelp.vectorial.path;

import jhelp.util.text.UtilText;

/**
 * Exception when parse failed
 * 
 * @author JHelp
 */
public class ParsePathException
      extends Exception
{
   /**
    * Create a new instance of ParsePathException
    * 
    * @param message
    *           Exception message
    */
   public ParsePathException(final Object... message)
   {
      super(UtilText.concatenate(message));
   }

   /**
    * Create a new instance of ParsePathException
    * 
    * @param cause
    *           Parent cause
    */
   public ParsePathException(final Throwable cause)
   {
      super(cause);
   }

   /**
    * Create a new instance of ParsePathException
    * 
    * @param cause
    *           Parent cause
    * @param message
    *           Exception message
    */
   public ParsePathException(final Throwable cause, final Object... message)
   {
      super(UtilText.concatenate(message), cause);
   }
}