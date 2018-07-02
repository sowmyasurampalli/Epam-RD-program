package com.epam.student.bean;

public class Student {
  int studentId;
  String firstName;
  String lastName;
  int yearOfJoining;
  
  public int getStudentId() {
    return studentId;
  }
  
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public int getYearOfJoining() {
    return yearOfJoining;
  }
  
  public void setYearOfJoining(int i) {
    this.yearOfJoining = i;
  }


}
