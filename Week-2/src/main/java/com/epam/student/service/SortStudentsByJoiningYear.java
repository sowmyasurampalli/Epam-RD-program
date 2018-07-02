package com.epam.student.service;

import com.epam.student.bean.Student;
import java.util.Comparator;


public class SortStudentsByJoiningYear implements Comparator<Student> {
  public int compare(Student studentRecord1, Student studentRecord2) {
    return studentRecord1.getYearOfJoining() - studentRecord2.getYearOfJoining();
  }
}
