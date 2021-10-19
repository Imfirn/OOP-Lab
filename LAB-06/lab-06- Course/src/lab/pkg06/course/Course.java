/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg06.course;

/**
 *
 * @author USER
 */
public class Course {

    private String Name;
    private String[] students;
    private int numberOfStudents;

    public Course(String Name) {
        this.Name = Name;
        students = new String[50];
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return Name;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {

            if (student.equals(students[i])) {
                students[i] = null; 
                numberOfStudents--;

                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                    i++;
                }
                
                break;
            }
        }
    }

    public void clear() {
        students = new String[20];
        numberOfStudents = 0;
    }

}
