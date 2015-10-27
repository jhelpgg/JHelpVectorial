package jhelp.vectorial.math;

import jhelp.util.math.UtilMath;

/**
 * Angle unit : degree, radian OR grade
 * 
 * @author JHelp
 */
public enum AngleUnit
{
   /** Degree angle */
   DEGREE("deg")
   {
      /**
       * Modularize given angle in good range, for degree : [0, 360] <br>
       * <br>
       * <b>Parent documentation:</b><br>
       * {@inheritDoc}
       * 
       * @param angle
       *           Angle to modularize
       * @return Modularized angle
       * @see AngleUnit#modularize(double)
       */
      @Override
      public double modularize(final double angle)
      {
         return UtilMath.modulo(angle, 360.0);
      }
   },
   /** Grade angle */
   GRADE("grad")
   {
      /**
       * Modularize given angle in good range, for grade : [0, 400] <br>
       * <br>
       * <b>Parent documentation:</b><br>
       * {@inheritDoc}
       * 
       * @param angle
       *           Angle to modularize
       * @return Modularized angle
       * @see AngleUnit#modularize(double)
       */
      @Override
      public double modularize(final double angle)
      {
         return UtilMath.modulo(angle, 400.0);
      }
   },
   /** Radian angle */
   RADIAN("rad")
   {
      /**
       * Modularize given angle in good range, for radian : [0, 2&pi;] <br>
       * <br>
       * <b>Parent documentation:</b><br>
       * {@inheritDoc}
       * 
       * @param angle
       *           Angle to modularize
       * @return Modularized angle
       * @see AngleUnit#modularize(double)
       */
      @Override
      public double modularize(final double angle)
      {
         return UtilMath.modulo(angle, UtilMath.TWO_PI);
      }
   };
   /**
    * Obtain angle unit by its short name : {"deg", "rad", "grad"}
    * 
    * @param unitName
    *           Unit short name
    * @return Angle unit OR {@code null} if short name not known
    */
   public static AngleUnit obtainAngleUnitByName(final String unitName)
   {
      for(final AngleUnit angleUnit : AngleUnit.values())
      {
         if(angleUnit.unitName.equalsIgnoreCase(unitName) == true)
         {
            return angleUnit;
         }
      }

      return null;
   }

   /** Unit short name */
   private final String unitName;

   /**
    * Create a new instance of AngleUnit
    * 
    * @param unitName
    *           Unit short name
    */
   AngleUnit(final String unitName)
   {
      this.unitName = unitName;
   }

   /**
    * Unit short name
    * 
    * @return Unit short name
    */
   public String getUnitName()
   {
      return this.unitName;
   }

   /**
    * Modularize given angle in good range
    * 
    * @param angle
    *           Angle to modularize
    * @return Modularized angle
    * @throws RuntimeException
    *            if forget to override this method
    */
   public double modularize(final double angle)
   {
      throw new RuntimeException("MUST override this method for unit : " + this);
   }
}