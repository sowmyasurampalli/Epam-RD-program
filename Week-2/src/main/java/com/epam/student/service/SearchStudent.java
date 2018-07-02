package com.epam.student.service;

import com.epam.student.bean.Student;
import java.util.ArrayList;

public class SearchStudent {

  ArrayList<Student> resultArray = new ArrayList<Student>();
  /** This method is to search students based on first name.
   * @param nameToSearch the name with which we wish to search the record.
   * @param studentsArray the array in which we are searching.
   * @return array of student records that match the first name we are searching for.
   */
  
  public ArrayList<Student> searchStudentBasedOnFirstName(
      String nameToSearch, ArrayList<Student> studentsArray) {
    for (Student student : studentsArray) {
      if (student.getFirstName().equals(nameToSearch)) {
        resultArray.add(student);
      }
    }
    return resultArray;
  }
  
  /** This method is to search students based on first name.
   * @param nameToSearch the name with which we wish to search the record.
   * @param studentsArray the array in which we are searching.
   * @return array of student records that match the last name we are searching for.
   */
  public ArrayList<Student> searchStudentBasedOnLastName(
      String nameToSearch, ArrayList<Student> studentsArray) {
    for (Student student : studentsArray) {
      if (student.getLastName().equals(nameToSearch)) {
        resultArray.add(student);
      }
    }
    return resultArray;
  }

  /** This method is to search based on the id number.
   * 
   * @param idNumToSearch id number with which we wish to search the record.
   * @param studentsArray the array in which we are searching.
   * @return array of student records that match the id number we are searching for.
   */
  public ArrayList<Student> searchStudentBasedOnId(
      int idNumToSearch, ArrayList<Student> studentsArray) {
    for (Student student : studentsArray) {
      if (student.getStudentId() == idNumToSearch) {
        resultArray.add(student);
      }
    }
    return resultArray;
  }
  
  /** This method is to search based on the Year of Joining.
   * 
   * @param yearOfJoiningToSearch year with which we wish to search the record.
   * @param studentsArray the array in which we are searching.
   * @return array of student records that match the year of joining we are searching for.
   */
  public ArrayList<Student> searchStudentBasedOnJoiningYear(
      int yearOfJoiningToSearch, ArrayList<Student> studentsArray) {
    for (Student student : studentsArray) {
      if (student.getYearOfJoining() == yearOfJoiningToSearch) {
        resultArray.add(student);
      }
    }
    return resultArray;
  }
}
