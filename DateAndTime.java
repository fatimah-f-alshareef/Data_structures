/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riyadhseasonproject;

/**
 *
 * @author whyyy
 */

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class DateAndTime {
    Scanner in = new Scanner(System.in);
   
    Date dt = new Date();
    GregorianCalendar Gr = new GregorianCalendar();
    Date date2;
    DateFormat dateFormat;
    String d;

     
    public void GetDate(){
               System.out.println("Enter the month: ");
                int month = (in.nextInt() - 1);
                System.out.println("Enter the day: ");
                int day = in.nextInt();
                GregorianCalendar Gr2 = new GregorianCalendar(2022, month,day); // play in time 
                Gr2.add(GregorianCalendar.DATE, 0);
                date2 = Gr2.getTime();
                dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
                  this.d = dateFormat.format(date2);

    }
  @Override
 public String toString(){
        return d;
    }
    
}

