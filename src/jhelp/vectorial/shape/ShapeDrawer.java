package jhelp.vectorial.shape;

/**
 * Generic shape drawer.<br>
 * It is used on {@link Shape#drawShape(ShapeDrawer)} to know how draw the shape
 * 
 * @author JHelp
 */
public interface ShapeDrawer
{
   /**
    * Called when drawing finished
    * 
    * @param shape
    *           Draw shape
    */
   public void drawShapeEnd(Shape shape);

   /**
    * Called to draw a segment
    * 
    * @param shape
    *           Drawing shape
    * @param x1
    *           First point X
    * @param y1
    *           First point Y
    * @param x2
    *           Second point X
    * @param y2
    *           Second point Y
    */
   public void drawShapeSegment(Shape shape, double x1, double y1, double x2, double y2);

   /**
    * Called when draw start
    * 
    * @param shape
    *           Drawing shape
    */
   public void drawShapeStart(Shape shape);
}