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

import java.util.HashMap;
import java.util.Scanner;

public class LinkedList {
    

   int size;
    Node head = new Node() ;
    
    
    public boolean check(int x)
{
    // Base Case
    if (head == null)
        return false;
 
    Node t = new Node();
    t = head;
 
    // Traverse the LinkedList List
    while (t != null) {
        if (t.TicketNo == x)
            return true;
        t = t.next;
    }
        return false;
}
    public void Insert(int TicketNo, int PhoneNo, String Name, DateAndTime Date, Events E){

    // if Reservation Already Exist
    if (check(TicketNo)) {
        System.out.print("Reservation is already available\n");
        return;
    }
    Node t = new Node();
    t.PhoneNo= PhoneNo;
    t.Name = Name;
    t.Date = Date;
    t.Event= E;
    t.TicketNo = TicketNo;
    t.next = null;
    
    // Insert at Begin
    if (head == null || head.TicketNo >= t.TicketNo) {
        t.next = head;
        head = t;
    }
 
    // Insert at middle or End
    else {
        Node c = head;
        while (c.next != null && c.next.TicketNo < t.TicketNo) {
            c = c.next;
        }
        t.next = c.next;
        c.next = t;
    }
      
    System.out.print( "Your Reservation has been Successfully\n ");
    size ++;
}
 

    public void Search(int TicketNo)
{  
    
    // if head is NULL
    if (head==null) {
        System.out.print("No confirmed reservation\n"); 
        return ;
    }
    // Otherwise
    else {
        Node p = head;
        HashMap<Integer,String> Events = new <String, Double>HashMap(); //declares the name of the flower and the price
    
        while (p!= null) {
            if(p.TicketNo == TicketNo){
//                 System.out.print (SearchByHashmap(TicketNo,p));
               Events.put(TicketNo,p.toString());
               System.out.print(Events.get(TicketNo));
            return ;
            }
            p = p.next;
        }
        if (p == null)
            System.out.print("No confirmed reservation\n");
    }
        
}
    public void delete(int num) {
        Node node = head;
        Node dummy = new Node();//Creating a dummy starting node.
        Node prev = dummy;
        prev.next = node;

        while(node!=null) {
            if(node.TicketNo==num)
            {
                prev.next = node.next;//Removing current node.
                node.next = null;//Removing reference to the next node.
                break;//Exiting the loop
            }
            prev = node;
            node = node.next;
        }
        dummy = null;
    }

// Function to display the Student's
// Record
 public void Show()
{
    Node p = head;
    if (p == null)
   System.out.print("No confirmed reservation\n");
    else 
        // Until p is not NULL
       System.out.print("\nTicketNo\tPhone Number\tName\tDate\t\t\t\tTotal price");
        while (p!= null) {
            if(p.Name != null)
             System.out.print("\n"+p.TicketNo+"\t\t"+p.PhoneNo+"\t\t"+p.Name+"\t"+p.Date+"\t\t"+p.Event);
            p = p.next;
        }
}

 
 Scanner in = new Scanner(System.in);

 public void printTicket(int TicketNo, int PhoneNo, String Name, DateAndTime Date, Events E){
     Node p = new Node();
     p.PhoneNo= PhoneNo;
     p.Name = Name;
     p.Date = Date;
     p.Event= E;
     p.TicketNo = TicketNo;
     
     int num = 0;
     System.out.print("\nHow would you like to receive your ticket? \n\t1. Print \n\t2.Send on email \nEnter your Choice: ");
     num = in.nextInt();
     
     if(num==1){
         System.out.print("\n---------------------------------------------------");
         System.out.print("\n|                 RIYADH   SEASON                  |");
         System.out.print("\n|                                                  |");
         System.out.print("\n| TicketNo: "+ p.TicketNo +"           \t                   |");
         System.out.print("\n| Name: "+ p.Name +" \t        Date: "+p.Date+"|");
         System.out.print("\n|                      \t\t Ticket Price: "+p.Event+"|");
         System.out.print("\n| PhoneNo: "+ p.PhoneNo +"\t\t                   |");
         System.out.print("\n---------------------------------------------------\n");
         
     }
     else if (num==2){
         System.out.print("/nEnter your email: ");
         String email = in.next();
     }
     else {
         
     }
 }}

