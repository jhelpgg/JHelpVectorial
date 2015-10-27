package jhelp.vectorial.shape;

/**
 * Represents a size/dimension
 * 
 * @author JHelp
 */
public class Size
{
   /** Height */
   private double height;
   /** Width */
   private double width;

   /**
    * Create a new instance of Size
    */
   public Size()
   {
   }

   /**
    * Create a new instance of Size
    * 
    * @param width
    *           Width
    * @param height
    *           Height
    */
   public Size(final double width, final double height)
   {
      this.width = width;
      this.height = height;
   }

   /**
    * Height
    * 
    * @return Height
    */
   public double getHeight()
   {
      return this.height;
   }

   /**
    * Width
    * 
    * @return Width
    */
   public double getWidth()
   {
      return this.width;
   }

   /**
    * Change the height
    * 
    * @param height
    *           New height
    */
   public void setHeight(final double height)
   {
      this.height = height;
   }

   /**
    * Chage the width
    * 
    * @param width
    *           New width
    */
   public void setWidth(final double width)
   {
      this.width = width;
   }
}