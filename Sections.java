import java.util.Scanner;
public class Sections {
   static Scanner gIN = new Scanner(System.in);// to take user input
   static double[] gGrades = new double[100];
   public static void main(String[] args) {
    System.out.println("UTSA - Fall2021 - CS1083 - Section 001 - Project 2 - written by Amos Munteanu");
    System.out.println();
    System.out.print("Enter class size: "); //ask's for class size
    int gClassSize = gIN.nextInt();
    gGrades = new double[gClassSize];
    System.out.println("MAIN MENU");
    System.out.println("0 - Exit, 1 - List, 2 - Report, 3 - Add/Modify Grade, 4 - Swap Grades");
    System.out.println("Select an option : ");
    int choice = gIN.nextInt();// stores the user choice
    while (choice != 0) {
     switch (choice) {
     case 1:
      listGrades(); //loads the method listGrades
      break;
      
     case 2:
      report(); //loads the method report
      break;
      
     case 3:
      addModifyGrade(); //loads the method to add and or modify grades
      break;
      
     case 4:
      swapGrades(); //loads the method that swap's grades from different indexs
      break;
      
     case 5:
        if(choice > 4){
        System.out.println("Value out of range, please, try again");
        System.out.println();
        break;
     }
      case 6:
        if(choice < 0){
        System.out.println("Value out of range, please, try again");
        System.out.println();
        break;
     }
     }
     System.out.println("MAIN MENU"); //message that is being repated every time the program restarts
     System.out.println("0 - Exit, 1 - List, 2 - Report, 3 - Add/Modify Grade, 4 - Swap Grades");
     System.out.println("Select an option : ");
     choice = gIN.nextInt();
     gIN.nextLine();
    }
    System.out.println("Thank you for using the grades program! Bye!"); //message that's execute when the program is done
   }
   //the following method will prdouce a list of all current grades
   public static void listGrades() {
    System.out.println("LIST OF GRADES");
    for (int i = 0; i < gGrades.length; i++) {
     System.out.println("Grade" + "["+(i)+"] : " + gGrades[i]);
    }
   }
   // the following method below prints out how many people have each kind of grade
   public static void report() {
    System.out.println("GRADES REPORT");
     System.out.println("F : " + getGradesLetter('F'));
    System.out.println("D : " + getGradesLetter('D'));
    System.out.println("C : " + getGradesLetter('C'));
    System.out.println("B : " + getGradesLetter('B'));
    System.out.println("A : " + getGradesLetter('A'));
     }
   // the following method hold the data of how many students have what grade letter
   public static String getGradesLetter(char ch) {
    int numGrades = 0;
    if (ch == 'A') {
     for (int i = 0; i < gGrades.length; i++) {
      if (gGrades[i] >= 95)
       numGrades += 1;
     }
    } else if (ch == 'B') {
     for (int i = 0; i < gGrades.length; i++) {
      if (gGrades[i] < 95 && gGrades[i] >= 90)
       numGrades += 1;
     }
    } else if (ch == 'C') {
     for (int i = 0; i < gGrades.length; i++) {
      if (gGrades[i] < 90 && gGrades[i] >= 80)
       numGrades += 1;
     }
    } else if (ch == 'C') {
     for (int i = 0; i < gGrades.length; i++) {
      if (gGrades[i] < 90 && gGrades[i] >= 80)
       numGrades += 1;
     }
    } else if (ch == 'D') {
     for (int i = 0; i < gGrades.length; i++) {
      if (gGrades[i] < 80 && gGrades[i] >= 70)
       numGrades += 1;
     }
    } else if (ch == 'F') {
     for (int i = 0; i < gGrades.length; i++) {
      if (gGrades[i] < 70 && gGrades[i] >= 60)
       numGrades += 1;
     }
    } else {
     for (int i = 0; i < gGrades.length; i++) {
      if (gGrades[i] < 60)
       numGrades += 1;
     }
    }
    return numGrades + "";
   }
   //the folloing method allows the user to add and modify grades for each index
   public static void addModifyGrade() {
    boolean loop = true;
    while (loop) {
     System.out.print("Enter the index (0 to " + (gGrades.length - 1) + ") :");
     int index = gIN.nextInt();
     System.out.println("The current value of the grade in index " + index + " is : " + gGrades[index]);
     if (index >= 0 && index <= gGrades.length - 1) {
      System.out.print("Enter the grade you want to assign (0.00 - 100.00) : ");
      double grade = gIN.nextDouble();
      if (grade >= 0.00 && grade <= 100.00) {
       gGrades[index] = grade;
       loop = false;
      } 
      else {
       System.out.println("Value out of range, please, try again.");
      }
     }
     else {
      System.out.println("Value out of range, please, try again.");
     continue;
     }
    }
   }
   //the following method allows the user to swap grades inbetween other index's
   public static void swapGrades() {
    boolean loop = true;
    while (loop) {
     System.out.print("Enter the index from (0 to " + (gGrades.length - 1) + ") :");
     int indexFrom = gIN.nextInt();
     if (indexFrom >= 0 && indexFrom <= gGrades.length - 1) {
      System.out.print("Enter the index to (0 to " + (gGrades.length - 1) + ") that is not " + indexFrom);
      int indexTo = gIN.nextInt();
      if (indexTo >= 0 && indexTo <= gGrades.length - 1) {
       if (indexFrom != indexTo) {
        double gradeSwaped = gGrades[indexFrom];
        gGrades[indexFrom] = gGrades[indexTo];
        gGrades[indexTo] = gradeSwaped;
        loop = false;
       } else {
        System.out.println("Value out of range, please, try again.");
        continue;
       }
      } else {
       System.out.println("Value out of range, please, try again.");
       continue;
      }
     } else {
      System.out.println("Value out of range, please, try again.");
      continue;
     }
    }
   }
}   
   
   
   