/*
 * Test2.java
 *
 * Research In Motion Limited proprietary and confidential
 * Copyright Research In Motion Limited, 2011-2011
 */
package test;

/**
 * 
 *
 * @author Ragaeeb Haq
 * @version 1.00 Jan 23, 2011 Initial submission.
 * @since x10 
 *
 */
import hsa.Console;
import java.text.*;
public class Test2
{
    static Console c;
    public static void main (String[] args)
    {
        c = new Console();
        int type; // ERROR 2, should be int, not integer

        do
        { 
            c.println("MAIN MENU");
            c.println("=========");
            c.println("1. Convert to a Letter grade");
            c.println("2. Convert to a Level grade");
            c.println("3. Exit \n");
            c.println("Please enter your selection: ");
            type=c.readInt();

            if (type==1) percentageToLevel();                               
            if (type==2) percentageToAlpha();  
        }
        while (type != 3);




    }

    // Conversion function percentage to Alpha
    public static void percentageToAlpha ()
    {

        int grade;
        String alphaGrade;
        String messageOut;

        c.println("Please enter the numeric grade: "); // ERROR 1, should be println not printline
        grade=c.readInt();

        if (grade < 50) {
            alphaGrade="F";
        }else if ((grade >= 50) && (grade <=52))
        {
            alphaGrade = "D-";
        }else if ((grade >= 53) && (grade <=56))
        {
            alphaGrade = "D";
        }else if ((grade >= 57) && (grade <=59))
        {
            alphaGrade = "D+";
        }else if ((grade >= 60) && (grade <=72))                               
        {
            alphaGrade = "C-";
        }else if ((grade >= 63) && (grade <=66))
        {
            alphaGrade = "C";
        }else if ((grade >= 67) && (grade <=69))
        {
            alphaGrade = "C+";                                                  
        }else if ((grade >= 70) && (grade <=72))
        {
            alphaGrade = "B-";
        }else if ((grade >= 73) && (grade <=76))
        {
            alphaGrade = "B";
        }else if ((grade >= 77) && (grade <=79))
        {
            alphaGrade = "B+";
        }else if ((grade >= 80) && (grade <=84))
        {
            alphaGrade = "A-";
        }else if ((grade >= 85) && (grade <=89))
        {
            alphaGrade = "A";
        }else if ((grade >= 90) && (grade <=100)) 
        {
            alphaGrade = "A+";
        }else{alphaGrade = "Error - invalid mark, try again!";
        }

        messageOut=(grade + "% = " + alphaGrade);
        c.println(messageOut);
    }

    // Conversion function percentage to level
    public static void percentageToLevel ()

    {
        int grade;
        String levelGrade;
        String messageOut;

        c.println("Please enter the numeric grade: ");
        grade=c.readInt();

        if (grade < 50) {
            levelGrade="R";
        }else if ((grade >= 50) && (grade <=52))
        {
            levelGrade="L1-";
        }else if ((grade >= 53) && (grade <=56))
        {
            levelGrade="L1";
        }else if ((grade >= 57) && (grade <=59))
        {
            levelGrade="L1+";
        }else if ((grade >= 60) && (grade <=62))
        {
            levelGrade="L2-";
        }else if ((grade >= 63) && (grade <=66))
        {
            levelGrade="L2";
        }else if ((grade >= 67) && (grade <=69))
        {
            levelGrade="L2+";
        }else if ((grade >= 70) && (grade <=72))
        {
            levelGrade="L3-";
        }else if ((grade >= 73) && (grade <=76))
        {
            levelGrade="L3-";                                                                                       
        }else if ((grade >= 77) && (grade <=79))
        {
            levelGrade="L3+";
        }else if ((grade >= 80) && (grade <=84))
        {
            levelGrade="L4-";
        }else if ((grade >= 85) && (grade <=89))
        {
            levelGrade="L4";
        }else if ((grade >= 90) && (grade >=100))                                    
        {
            levelGrade="L4+";
        }else{
            levelGrade="Error - invalid mark, try again!";
        }

        messageOut=(grade + "% = " + grade);                                                                            
        c.println(messageOut);
    }

}//End of class
