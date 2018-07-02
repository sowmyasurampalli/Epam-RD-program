package com.epam.student.service;

import com.epam.student.bean.Student;
import java.util.Comparator;

public class SortStudentsByFirstName implements Comparator<Student> {

  public int compare(Student studentRecord1, Student studentRecord2) {
    return studentRecord1.getFirstName().compareTo(studentRecord2.getFirstName());
  }
}

