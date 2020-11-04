package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        linkedlist a1=new linkedlist();
        Scanner sc=new Scanner(System.in);
        System.out.println("----------MENU------------");
        int ch;
        do { System.out.println("1: Insert element\n2: Print list\n4.delete an given element\n5: sort the given list\n6: search a given element in the given list\n7: reverse the list\n8: exit");
            System.out.println("enter your choice");
            Scanner scan=new Scanner(System.in);
            ch=scan.nextInt();

            switch (ch) {
                case 1:
                    int d=a1.get_data();
                    a1=a1.insert(d,a1);

                    break;
                case 2:
                    a1.print(a1);
                    break;
                case 4:
                    System.out.println("enter the element to be deleted");
                    int k=sc.nextInt();
                    a1=a1.delete(a1,k);
                    break;

                default:
                    System.out.println("invalid choice");
            }

        }while(ch!=8);


    }
}
