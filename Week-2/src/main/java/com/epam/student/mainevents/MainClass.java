package com.epam.student.mainevents;

import com.epam.student.bean.Student;
import com.epam.student.service.SearchStudent;
import com.epam.student.service.SortStudentsByFirstName;
import com.epam.student.service.SortStudentsByIdNumber;
import com.epam.student.service.SortStudentsByJoiningYear;
import com.epam.student.service.SortStudentsByLastName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
  /** Displays the main menu and menu for both searching and sorting.
   * 
   * @param args no parameters to be entered while trying to run the class file.
   * @throws IOException ReadStudentsFromFile throws IOException when file is not found.
   */
  public static void main(String[] args) throws IOException {

    ReadStudentsFromFile readStudentsRecords = new ReadStudentsFromFile();
    ArrayList<Student> students = readStudentsRecords.readStudentRecordsFromFile();
    boolean wrongChoice = true;
    while (wrongChoice) { 
      wrongChoice = false;
      System.out.println("MENU:\n1.Search for a student\n2.Sort the records of students");
      System.out.println("Enter your choice:");
      Scanner inputScanner = new Scanner(System.in);
      Scanner readInput = new Scanner(System.in);
      int choice = inputScanner.nextInt();
      switch (choice) {
        case 1: {
          boolean wrongSearchChoice = true;
          while (wrongSearchChoice) {
            System.out.println("MENU\n1.Search the records based on first name");
            System.out.println("2.Search the records based on last name");
            System.out.println("3.Search the records based on Id number");
            System.out.println("4.Search the records based on year of joining");
            System.out.println("5.Back to main menu\nEnter your choice");
            int searchChoice = inputScanner.nextInt();
            switch (searchChoice) {

              case 1: {
                wrongSearchChoice = false;
                System.out.println("Enter first name of the student:");
                String firstName = readInput.nextLine();
                SearchStudent ss = new SearchStudent();
                ArrayList<Student> foundStudentRecords;
                foundStudentRecords = ss.searchStudentBasedOnFirstName(firstName, students);
                if (foundStudentRecords.size() == 0) {
                  System.out.println("Records not found");
                }
                for (Student record: foundStudentRecords) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }

              case 2: {
                wrongSearchChoice = false;
                System.out.println("Enter Last name of the student:");
                String lastName = readInput.nextLine();
                SearchStudent ss = new SearchStudent();
                ArrayList<Student> foundStudentRecords;
                foundStudentRecords = ss.searchStudentBasedOnLastName(lastName, students);
                if (foundStudentRecords.size() == 0) {
                  System.out.println("Records not found");
                }
                for (Student record: foundStudentRecords) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }
              case 3: {
                wrongSearchChoice = false;
                System.out.println("Enter Id number of the student:");
                int idnum = readInput.nextInt();
                SearchStudent ss = new SearchStudent();
                ArrayList<Student> foundStudentRecords = ss.searchStudentBasedOnId(idnum, students);
                if (foundStudentRecords.size() == 0) {
                  System.out.println("Records not found");
                }
                for (Student record: foundStudentRecords) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }
              case 4: {
                wrongSearchChoice = false;
                System.out.println("Enter Year of joining of the student:");
                int yearOfJoining = readInput.nextInt();
                SearchStudent ss = new SearchStudent();
                ArrayList<Student> foundStudentRecords;
                foundStudentRecords = ss.searchStudentBasedOnJoiningYear(yearOfJoining, students);
                if (foundStudentRecords.size() == 0) {
                  System.out.println("Records not found");
                }
                for (Student record: foundStudentRecords) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }
              case 5: {
                wrongSearchChoice = false;//makes the search menu exit
                wrongChoice = true;//takes back to the main menu
                break;
              }
              default: {
                System.out.println("Please reenter your choice");
                wrongSearchChoice = true;
                break;
              }
            }
          }
          break;
        }
        case 2: {
          boolean wrongSortChoice = true;
          while (wrongSortChoice) {
            wrongSortChoice = false;
            System.out.println("MENU\n1.Sort the records based on first name");
            System.out.println("2.Sort the records based on last name");
            System.out.println("3.Sort the records based on Id number");
            System.out.println("4.Sort the records based on year of joining");
            System.out.println("5.Back to main menu\nEnter your choice");
            int sortChoice = readInput.nextInt();
            switch (sortChoice) {
              case 1: {
                Collections.sort(students, new SortStudentsByFirstName());
                for (Student record: students) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }
              case 2: {
                Collections.sort(students, new SortStudentsByLastName());
                for (Student record: students) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }
              case 3: {
                Collections.sort(students, new SortStudentsByIdNumber());
                for (Student record: students) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }
              case 4: {
                Collections.sort(students, new SortStudentsByJoiningYear());
                for (Student record: students) {
                  MainClass mc = new MainClass();
                  mc.printStudentObject(record);
                }
                break;
              }
              case 5: {
                wrongSortChoice = false;//makes the search menu exit
                wrongChoice = true;//takes back to the main menu
                break;
              }
              default: {
                break;
              }
            }
          }
          break;
        }
        default: {
          System.out.println("Please reenter your choice:");
          wrongChoice = true;
          break;
        }
      }
      inputScanner.close();
      readInput.close();
    }
  }

  /** Prints all the fields of Student object on console.
   *   
   * @param studentRecord Student object
   */
  public void printStudentObject(Student studentRecord) {
    System.out.println("First name:" + studentRecord.getFirstName());
    System.out.println("Last name:" + studentRecord.getLastName());
    System.out.println("Id number:" + studentRecord.getStudentId());
    System.out.println("Year of joining:" + studentRecord.getYearOfJoining());
    System.out.println("");
  }

}


