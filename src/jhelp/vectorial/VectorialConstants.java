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
package jhelp.vectorial;

import jhelp.vectorial.layer.Canvas;
import jhelp.vectorial.layer.Layer;
import jhelp.vectorial.layer.ShapeDescription;
import jhelp.vectorial.path.ClosePath;
import jhelp.vectorial.path.CubicBezierTo;
import jhelp.vectorial.path.EllipticalArcTo;
import jhelp.vectorial.path.LineTo;
import jhelp.vectorial.path.MoveTo;
import jhelp.vectorial.path.Path;
import jhelp.vectorial.path.QuadricBezierTo;
import jhelp.vectorial.shape.Shape;

/**
 * Constants for serialize/parse object in/from JSON
 * 
 * @author JHelp
 */
public interface VectorialConstants
{
   /** Indicates a {@link Canvas} object */
   public static final String KEY_CANVAS                          = Canvas.class.getSimpleName();
   /** Indicates a {@link Layer} object */
   public static final String KEY_LAYER                           = Layer.class.getSimpleName();
   /** Indicates a {@link Path} object */
   public static final String KEY_PATH                            = Path.class.getSimpleName();
   /** Indicates a {@link ClosePath} object */
   public static final String KEY_PATH_ELEMENT_CLOSE_PATH         = ClosePath.class.getSimpleName();
   /** Indicates a {@link CubicBezierTo} object */
   public static final String KEY_PATH_ELEMENT_CUBIC_BEZIER_TO    = CubicBezierTo.class.getSimpleName();
   /** Indicates a {@link EllipticalArcTo} object */
   public static final String KEY_PATH_ELEMENT_ELLIPTICAL_ARC_TO  = EllipticalArcTo.class.getSimpleName();
   /** Indicates a {@link LineTo} object */
   public static final String KEY_PATH_ELEMENT_LINE_TO            = LineTo.class.getSimpleName();
   /** Indicates a {@link MoveTo} object */
   public static final String KEY_PATH_ELEMENT_MOVE_TO            = MoveTo.class.getSimpleName();
   /** Indicates a {@link QuadricBezierTo} object */
   public static final String KEY_PATH_ELEMENT_QUADRIC_BEZIER_TO  = QuadricBezierTo.class.getSimpleName();
   /** Indicates a {@link Shape} object */
   public static final String KEY_SHAPE                           = Shape.class.getSimpleName();
   /** Indicates a {@link ShapeDescription} object */
   public static final String KEY_SHAPE_DESCRIPTION               = ShapeDescription.class.getSimpleName();
   /** Control point X parameter */
   public static final String PARAMETER_CONTROL_POINT_X           = "controlPointX";
   /** Control point Y parameter */
   public static final String PARAMETER_CONTROL_POINT_Y           = "controlPointY";
   /** First control point X parameter */
   public static final String PARAMETER_FIRST_CONTROL_POINT_X     = "firstControlPointX";
   /** First control point Y parameter */
   public static final String PARAMETER_FIRST_CONTROL_POINT_Y     = "firstControlPointY";
   /** Large arc parameter */
   public static final String PARAMETER_LARGE_ARC                 = "largeArc";
   /** Path parameter */
   public static final String PARAMETER_PATH                      = "path";
   /** Precision parameter */
   public static final String PARAMETER_PRECISION                 = "precision";
   /** Radius on X parameter */
   public static final String PARAMETER_RADIUS_X                  = "radiusX";
   /** Radius on Y parameter */
   public static final String PARAMETER_RADIUS_Y                  = "radiusY";
   /** Relative parameter */
   public static final String PARAMETER_RELATIVE                  = "relative";
   /** Rotation in degree around X axis parameter */
   public static final String PARAMETER_ROTATION_AXIS_X_IN_DEGREE = "rotationAxisXInDegree";
   /** Scale X parameter */
   public static final String PARAMETER_SCALE_X                   = "scaleX";
   /** Scale Y parameter */
   public static final String PARAMETER_SCALE_Y                   = "scaleY";
   /** Second control point X parameter */
   public static final String PARAMETER_SECOND_CONTROL_POINT_X    = "secondControlPointX";
   /** Second control point Y parameter */
   public static final String PARAMETER_SECOND_CONTROL_POINT_Y    = "secondControlPointY";
   /** Sweep parameter */
   public static final String PARAMETER_SWEEP                     = "sweep";
   /** X parameter */
   public static final String PARAMETER_X                         = "x";
   /** Y parameter */
   public static final String PARAMETER_Y                         = "y";
}