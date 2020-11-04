package com.company;

import java.util.Scanner;

public class linkedlist {
    Scanner ch =new Scanner(System.in);

      class Node{
          int element;
          Node next;

      }
      Node head=null;
      Node tail=null;


      public int  get_data(){
          System.out.println("enter the element to be inserted");
          int d =ch.nextInt();
          return d;

      }
      public linkedlist insert (int value,linkedlist a1) {
          Node n=new Node();
          n.element=value;
          n.next = null;
          if (a1.head == null) {
              a1.head = n;
              a1.tail = n;
              a1.tail.next = null;
              return a1;
          }
          a1.tail.next = n;
          n.next = null;
          a1.tail = n;
          return a1;
      }
      public linkedlist delete(linkedlist a1, int key){
          Node loc,prev;
          loc=a1.head;
          if(loc.element==key){
              a1.head=a1.head.next;
              loc.next=null;
              return a1;
          }
          for(loc=head;loc!=tail;loc=loc.next){
              prev=loc;
              if(loc.element==key){
                  prev.next=loc.next;
                  System.out.println("element deleted");
                  return a1;
              }
              if(loc==tail){
                  if(tail.element==key){
                      tail=prev;
                      tail.next=null;
                      System.out.println("element not found");
                      return a1;
                  }
                  if(tail.element!=key) {
                      System.out.println("element not found");
                      return a1;
                  }
              }




          }
          return a1;

      }
      public void print(linkedlist a1){
          Node ptr;
          if(a1.head==null){
              System.out.println("empty list");
              return;
          }
          for(ptr=a1.head;ptr!=a1.tail;ptr=ptr.next){
              System.out.println(ptr.element);
          }
          System.out.println(a1.tail.element);
          return;

      }

}
