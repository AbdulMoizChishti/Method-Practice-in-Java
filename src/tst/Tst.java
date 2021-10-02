/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.Scanner;
public class Tst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner (System.in);
//    String []bd=new String[5];
        System.out.print("Enter Name of Student: ");    
        String name=sc.nextLine();

        System.out.print("Enter Father Name: ");
        String fname=sc.nextLine();
        
        System.out.print("Enter Age of Student: ");
        int age=sc.nextInt();
        
        System.out.print("Enter Prevoius % of Student: ");
        double pprc=sc.nextDouble();
        
        System.out.print("Enter Prevoius Marks of Student: ");
        double pmrks=sc.nextDouble();
        
        System.out.print("Enter Previous Class: ");
        int cls=sc.nextInt();
if (cls==8){
        System.out.println("Restriction"
                + "The Student has to admitted in the class 9 only");
    }    
 

System.out.print("Enter Previous Grade: ");
        char grade=sc.next().charAt(0);
    if(grade=='b' || grade =='B'){
        System.out.println("The Student cannot be admitted to the school  ");
    }
    
        System.out.println("Enter marks of maths:");
    int maths=sc.nextInt();
    System.out.println("Enter marks of physics:");
    int phy=sc.nextInt();
    System.out.println("Enter marks of chemistry:");
    int chem=sc.nextInt();
    
    
    Marks mrks=new Marks();
    mrks.Av(maths, phy, chem);
    mrks.setmarks();
    }
    
}
