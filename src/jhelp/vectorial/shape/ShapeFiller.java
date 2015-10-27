package jhelp.vectorial.shape;

/**
 * Generic filler of shape.<br>
 * It is called inside {@link Shape#fillShape(ShapeFiller)} to know how fill the shape
 * 
 * @author JHelp
 */
public interface ShapeFiller
{
   /**
    * Called when filling is finished
    * 
    * @param shape
    *           Shape filled
    */
   public void fillShapeEnd(Shape shape);

   /**
    * Called when a pixel have to be draw<br>
    * The given point is sure to be inside the shape and given area at {@link #obtainDrawingAreaBounds(Shape)}
    * 
    * @param shape
    *           Filling shape
    * @param x
    *           Point X
    * @param y
    *           Point Y
    */
   public void fillShapePixel(Shape shape, int x, int y);

   /**
    * Called when filling started
    * 
    * @param shape
    *           Filling shape
    * @param filledArea
    *           The area intersection between shape and given area at {@link #obtainDrawingAreaBounds(Shape)}
    */
   public void fillShapeStart(Shape shape, Rectangle filledArea);

   /**
    * Obtain the maximum area can be filled, if shape have part outside area, only the intersection will be filled
    * 
    * @param shape
    *           Shape to fill
    * @return Maximum area can be filled
    */
   public Rectangle obtainDrawingAreaBounds(Shape shape);
}