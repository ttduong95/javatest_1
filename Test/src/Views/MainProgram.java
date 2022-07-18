/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.BookManager;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainProgram {
    public static int Menu()
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println("1. Add Book");
        System.out.println("2. Save");
        System.out.println("3. Display Book");
        System.out.println("4. Exit");
        
        while(true)
        {
            try{
                System.out.println("Enter your choice (1-4):");
                choice = sc.nextInt();  
                return choice;
            }
            catch(InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Nhập số!");
            }
        }
    }
    
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        BookManager bmg = new BookManager();
        do{
            choice = Menu();
            switch(choice){
                case 1:
                    System.out.println("Add new Book");
                    bmg.AddBook();
                    break;
                case 2:
                    System.out.println("Save to Book.dat");
                    if(bmg.list.isEmpty()==false)
                        bmg.Save();
                    else
                        System.out.println("List is empty");
                    break;
                case 3:
                    if(bmg.Load())
                        bmg.DisplayAll();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please Enter 1-4!");
                    break;
            }
        }while(choice!=4);
    }
    }

