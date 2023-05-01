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

import java.util.Scanner;
import java.util.HashMap;
public class RiyadhSeasonProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Node head =new Node();
        LinkedList L =new LinkedList();
        int TicketNo = 0;
        
//         head = null;
    String Name;
 
    // Menu-driven program
         int choice=0;
         Loop1:
          do{
        System.out.print("\n\t\tWELCOME TO THE "+
                "RIYADH SEASON\n\n\tPress\n\t"+
                "1-> To book an event and create a new ticket\n\t2-> to cancellation "+
                "of reservation\n\t3-> to Find reserved "+
                "tickets"+
                "\n\t4-> to view all reserved "+
                "tickets\n\t5-> to Exit\n"+
                    "\nEnter your Choice: \n");
        // Enter Choice
        choice = in.nextInt();
       switch(choice) {
           case 1: System.out.print("Enter your Name:\n");
             String temp = in.nextLine();
             Name = in.nextLine();
             System.out.print("Enter your phone Number:\n");
             int phoneNo;
             phoneNo= in.nextInt();
             DateAndTime D =new DateAndTime();
             D.GetDate();
             Events E = new Events();
             E.BookAnEvent();
             System.out.println("The Total Price is " + E);
             
             TicketNo++;
             
             L.Insert(TicketNo, phoneNo, Name, D , E);
             L.printTicket(TicketNo, phoneNo, Name, D, E);
               break;
        case 2:
             System.out.print("Enter Ticket Number of Customer whose record is to be deleted\n ");
             int TicketNo1;
             TicketNo1= in.nextInt();
             L.delete(TicketNo1);
               break;
        case 3:
            System.out.print("Enter your Ticket Number associated with your Reservation to Search\n");
            int TicketNo2;
            TicketNo2= in.nextInt();
            L.Search(TicketNo2);
            break;  
            
        case 4:
                L.Show();
            break;
       case 5:  
           break Loop1;
       default:
            System.out.print("\tInvalid Choice\n\tPlease Try Again\n");
            
        }
    }while(true);
       
}
}

