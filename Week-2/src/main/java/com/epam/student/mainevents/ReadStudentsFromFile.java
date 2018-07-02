package com.epam.student.mainevents;

import com.epam.student.bean.Student;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadStudentsFromFile {
  /** Reads the data from a csv file and assigns it to a student object.
   * 
   * @return an array list of students that are read from file.
   * @throws IOException when file is not found.
   */
  public ArrayList<Student> readStudentRecordsFromFile() throws IOException {

   
    FileReader inputFileReader = new FileReader("inputFile.csv");
    ArrayList<Student> students = new ArrayList<Student>();

    Scanner inputFileScanner = new Scanner(inputFileReader);
    String lineInFile = "";
    while (inputFileScanner.hasNext()) {
      Student studentRecord = new Student();
      lineInFile = inputFileScanner.nextLine();
      String[] wordsInLine = lineInFile.split(",");
      studentRecord.setFirstName(wordsInLine[0]);
      studentRecord.setLastName(wordsInLine[1]);
      studentRecord.setStudentId(Integer.parseInt(wordsInLine[2]));
      studentRecord.setYearOfJoining(Integer.parseInt(wordsInLine[3]));
      students.add(studentRecord);
    }
    inputFileScanner.close();

    return students;
  }


}
