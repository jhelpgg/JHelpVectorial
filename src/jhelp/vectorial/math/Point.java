package jhelp.vectorial.math;

/**
 * A point
 * 
 * @author JHelp
 */
public class Point
{
   /** X */
   private double x;
   /** Y */
   private double y;

   /**
    * Create a new instance of Point
    * 
    * @param x
    *           X
    * @param y
    *           Y
    */
   public Point(final double x, final double y)
   {
      this.x = x;
      this.y = y;
   }

   /**
    * X
    * 
    * @return X
    */
   public double getX()
   {
      return this.x;
   }

   /**
    * Y
    * 
    * @return Y
    */
   public double getY()
   {
      return this.y;
   }

   /**
    * Change point
    * 
    * @param x
    *           New X
    * @param y
    *           New Y
    */
   public void setCoordinate(final double x, final double y)
   {
      this.x = x;
      this.y = y;
   }
}