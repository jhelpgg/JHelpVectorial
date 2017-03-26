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
package jhelp.vectorial.math;

import jhelp.util.HashCode;
import jhelp.util.math.UtilMath;
import jhelp.util.text.UtilText;

/**
 * Represents an angle, it can be express in {@link AngleUnit#DEGREE degree}, {@link AngleUnit#GRADE grade} OR
 * {@link AngleUnit#RADIAN radian}
 * 
 * @author JHelp
 */
public class Angle
{
   /** Angle value */
   private final double    angle;
   /** Angle unit */
   private final AngleUnit angleUnit;

   /**
    * Create a new instance of Angle
    * 
    * @param angle
    *           Angle value
    * @param angleUnit
    *           Angle unit
    */
   public Angle(final double angle, final AngleUnit angleUnit)
   {
      if(angleUnit == null)
      {
         throw new NullPointerException("angleUnit musn't be null");
      }

      this.angle = angleUnit.modularize(angle);
      this.angleUnit = angleUnit;
   }

   /**
    * Addition with an other angle.<br>
    * The result angle will use the same unit as this angle
    * 
    * @param angle
    *           Angle to add
    * @return Addition result
    */
   public Angle addition(final Angle angle)
   {
      return new Angle(this.angle + angle.convert(this.angleUnit).angle, this.angleUnit);
   }

   /**
    * Convert the angle to an other unit.<br>
    * If use the same unit as actual, this angle is returned
    * 
    * @param angleUnit
    *           Angle unit to convert
    * @return Converted angle
    */
   public Angle convert(final AngleUnit angleUnit)
   {
      if(angleUnit == null)
      {
         throw new NullPointerException("angleUnit musn't be null");
      }

      switch(this.angleUnit)
      {
         case DEGREE:
            switch(angleUnit)
            {
               case DEGREE:
                  return this;
               case GRADE:
                  return new Angle(UtilMath.degreeToGrade(this.angle), angleUnit);
               case RADIAN:
                  return new Angle(UtilMath.degreeToRadian(this.angle), angleUnit);
            }
         break;
         case GRADE:
            switch(angleUnit)
            {
               case DEGREE:
                  return new Angle(UtilMath.gradeToDegree(this.angle), angleUnit);
               case GRADE:
                  return this;
               case RADIAN:
                  return new Angle(UtilMath.gradeToRadian(this.angle), angleUnit);
            }
         break;
         case RADIAN:
            switch(angleUnit)
            {
               case DEGREE:
                  return new Angle(UtilMath.radianToDegree(this.angle), angleUnit);
               case GRADE:
                  return new Angle(UtilMath.radianToGrade(this.angle), angleUnit);
               case RADIAN:
                  return this;
            }
         break;
      }

      throw new RuntimeException("Oups convertion " + this.angleUnit + " TO " + angleUnit + " not managed");
   }

   /**
    * Cosinus of anlge
    * 
    * @return Angle cosinus
    */
   public double cosinus()
   {
      return Math.cos(this.convert(AngleUnit.RADIAN).angle);
   }

   /**
    * Indicates if given object is equals to this angle <br>
    * <br>
    * <b>Parent documentation:</b><br>
    * {@inheritDoc}
    * 
    * @param object
    *           Object to test
    * @return {@code true} if given object is equals to this angle
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

      if(!(object instanceof Angle))
      {
         return false;
      }

      final Angle angle = ((Angle) object).convert(this.angleUnit);
      return UtilMath.equals(this.angle, angle.angle);
   }

   /**
    * Angle value
    * 
    * @return Angle value
    */
   public double getAngle()
   {
      return this.angle;
   }

   /**
    * Angle unit
    * 
    * @return Angle unit
    */
   public AngleUnit getAngleUnit()
   {
      return this.angleUnit;
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
      return HashCode.computeHashCode(this.convert(AngleUnit.RADIAN).angle);
   }

   /**
    * Sinus of angle
    * 
    * @return Angle sinus
    */
   public double sinus()
   {
      return Math.sin(this.convert(AngleUnit.RADIAN).angle);
   }

   /**
    * subtract an angle from this angle.<br>
    * The result will have same unit as this angle
    * 
    * @param angle
    *           Angle to subtract
    * @return Subtract result
    */
   public Angle subtract(final Angle angle)
   {
      return new Angle(this.angle - angle.convert(this.angleUnit).angle, this.angleUnit);
   }

   /**
    * String representation <br>
    * <br>
    * <b>Parent documentation:</b><br>
    * {@inheritDoc}
    * 
    * @return String representation
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return UtilText.concatenate(this.angle, this.angleUnit.getUnitName());
   }
}