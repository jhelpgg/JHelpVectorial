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
package jhelp.vectorial.shape;

import jhelp.util.HashCode;
import jhelp.util.math.UtilMath;
import jhelp.util.text.UtilText;
import jhelp.vectorial.math.Point;

/**
 * Represents a segment
 * 
 * @author JHelp
 */
public class Line
{
   /** End point X */
   private double endX;
   /** End point Y */
   private double endY;
   /** Start point X */
   private double startX;
   /** Start point Y */
   private double startY;

   /**
    * Create a new instance of Line
    * 
    * @param startX
    *           Start point X
    * @param startY
    *           Start point Y
    * @param endX
    *           End point X
    * @param endY
    *           End point Y
    */
   public Line(final double startX, final double startY, final double endX, final double endY)
   {
      this.startX = startX;
      this.startY = startY;
      this.endX = endX;
      this.endY = endY;
   }

   /**
    * Create a new instance of Line
    * 
    * @param startX
    *           Start point X
    * @param startY
    *           Start point Y
    * @param end
    *           End point
    */
   public Line(final double startX, final double startY, final Point end)
   {
      this.startX = startX;
      this.startY = startY;
      this.endX = end.getX();
      this.endY = end.getY();
   }

   /**
    * Create a new instance of Line
    * 
    * @param start
    *           Start point
    * @param endX
    *           End point X
    * @param endY
    *           End point Y
    */
   public Line(final Point start, final double endX, final double endY)
   {
      this.startX = start.getX();
      this.startY = start.getY();
      this.endX = endX;
      this.endY = endY;
   }

   /**
    * Create a new instance of Line
    * 
    * @param start
    *           Start point
    * @param end
    *           End point
    */
   public Line(final Point start, final Point end)
   {
      this.startX = start.getX();
      this.startY = start.getY();
      this.endX = end.getX();
      this.endY = end.getY();
   }

   /**
    * Indicates if given object equals to this line <br>
    * <br>
    * <b>Parent documentation:</b><br>
    * {@inheritDoc}
    * 
    * @param object
    *           Tested object
    * @return {@code true} if given object equals to this line
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(final Object object)
   {
      if(object == this)
      {
         return true;
      }

      if(object == null)
      {
         return false;
      }

      if(!(object instanceof Line))
      {
         return false;
      }

      final Line line = (Line) object;
      return (UtilMath.equals(this.startX, line.startX)) && (UtilMath.equals(this.startY, line.startY))
            && (UtilMath.equals(this.endX, line.endX)) && (UtilMath.equals(this.endY, line.endY));
   }

   /**
    * End point
    * 
    * @return End point
    */
   public Point getEnd()
   {
      return new Point(this.endX, this.endY);
   }

   /**
    * End point X
    * 
    * @return End point X
    */
   public double getEndX()
   {
      return this.endX;
   }

   /**
    * End point Y
    * 
    * @return End point Y
    */
   public double getEndY()
   {
      return this.endY;
   }

   /**
    * Start point
    * 
    * @return Start point
    */
   public Point getStart()
   {
      return new Point(this.startX, this.startY);
   }

   /**
    * Start point X
    * 
    * @return Start point X
    */
   public double getStartX()
   {
      return this.startX;
   }

   /**
    * Start point Y
    * 
    * @return Start point Y
    */
   public double getStartY()
   {
      return this.startY;
   }

   /**
    * Hash code <br>
    * <br>
    * <b>Parent documentation:</b><br>
    * {@inheritDoc}
    * 
    * @return Hash code
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      return HashCode.computeHashCode(this.startX, this.startY, this.endX, this.endY);
   }

   /**
    * Indicates if line is reduce to one point
    * 
    * @return {@code true} if line is reduce to one point
    */
   public boolean isPoint()
   {
      return (UtilMath.equals(this.startX, this.endX)) && (UtilMath.equals(this.startY, this.endY));
   }

   /**
    * Change end point
    * 
    * @param x
    *           New end point X
    * @param y
    *           New end point Y
    */
   public void setEnd(final double x, final double y)
   {
      this.endX = x;
      this.endY = y;
   }

   /**
    * Change end point
    * 
    * @param position
    *           New end point
    */
   public void setEnd(final Point position)
   {
      this.endX = position.getX();
      this.endY = position.getY();
   }

   /**
    * Change end point X
    * 
    * @param endX
    *           New end point X
    */
   public void setEndX(final double endX)
   {
      this.endX = endX;
   }

   /**
    * Change end point Y
    * 
    * @param endY
    *           New end point Y
    */
   public void setEndY(final double endY)
   {
      this.endY = endY;
   }

   /**
    * Change the line
    * 
    * @param startX
    *           New start point X
    * @param startY
    *           New start point Y
    * @param endX
    *           New end point X
    * @param endY
    *           New end point Y
    */
   public void setLine(final double startX, final double startY, final double endX, final double endY)
   {
      this.startX = startX;
      this.startY = startY;
      this.endX = endX;
      this.endY = endY;
   }

   /**
    * Change the line
    * 
    * @param startX
    *           New start point X
    * @param startY
    *           New start point Y
    * @param end
    *           New end point
    */
   public void setLine(final double startX, final double startY, final Point end)
   {
      this.startX = startX;
      this.startY = startY;
      this.endX = end.getX();
      this.endY = end.getY();
   }

   /**
    * Change the line
    * 
    * @param start
    *           New start point
    * @param endX
    *           New end point X
    * @param endY
    *           New end point Y
    */
   public void setLine(final Point start, final double endX, final double endY)
   {
      this.startX = start.getX();
      this.startY = start.getY();
      this.endX = endX;
      this.endY = endY;
   }

   /**
    * Change the line
    * 
    * @param start
    *           New start point
    * @param end
    *           New end point
    */
   public void setLine(final Point start, final Point end)
   {
      this.startX = start.getX();
      this.startY = start.getY();
      this.endX = end.getX();
      this.endY = end.getY();
   }

   /**
    * Change start point
    * 
    * @param x
    *           New start point X
    * @param y
    *           New start point Y
    */
   public void setStart(final double x, final double y)
   {
      this.startX = x;
      this.startY = y;
   }

   /**
    * Change start point
    * 
    * @param position
    *           New start point
    */
   public void setStart(final Point position)
   {
      this.startX = position.getX();
      this.startY = position.getY();
   }

   /**
    * Change start point X
    * 
    * @param startX
    *           New start point X
    */
   public void setStartX(final double startX)
   {
      this.startX = startX;
   }

   /**
    * Change start point Y
    * 
    * @param startY
    *           New start point Y
    */
   public void setStartY(final double startY)
   {
      this.startY = startY;
   }

   /**
    * String description <br>
    * <br>
    * <b>Parent documentation:</b><br>
    * {@inheritDoc}
    * 
    * @return String description
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return UtilText.concatenate('(', this.startX, ", ", this.startY, ")-(", this.endX, ", ", this.endY, ')');
   }

   /**
    * Translate the line
    * 
    * @param x
    *           Translation x
    * @param y
    *           Translation Y
    */
   public void translate(final double x, final double y)
   {
      this.startX += x;
      this.startY += y;
      this.endX += x;
      this.endY += y;
   }
}