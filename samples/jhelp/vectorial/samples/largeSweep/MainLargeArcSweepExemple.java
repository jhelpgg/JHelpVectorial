package jhelp.vectorial.samples.largeSweep;

import jhelp.util.gui.UtilGUI;

/**
 * Launch the frame for understand the role of <b>largeArc</b> and <b>sweep</b>
 * 
 * @author JHelp
 */
public class MainLargeArcSweepExemple
{
   /**
    * Launch the frame for understand the role of <b>largeArc</b> and <b>sweep</b>
    * 
    * @param args
    *           Unused
    */
   public static void main(final String[] args)
   {
      UtilGUI.initializeGUI();
      final FrameLargeArcSweepExemple frameLargeArcSweepExemple = new FrameLargeArcSweepExemple();
      frameLargeArcSweepExemple.setVisible(true);
   }
}