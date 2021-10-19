/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg06.course;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab06Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course name : ");
        String courseName = input.nextLine();
        Course course = new Course(courseName);

        for (int i = 1; i < 4; i++) {
            System.out.print("No." + i + ":");
            String stName = input.nextLine();
            course.addStudent(stName);
        }

        String[] students = course.getStudents();
        System.out.printf("Number of students in %s : %d%n", course.getCourseName(), course.getNumberOfStudents());

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%s\n", students[i]);
        }

        System.out.print("Enter the name who want to drop :");
        String stName1 = input.nextLine();
        course.dropStudent(stName1);
        System.out.printf("Number of students in %s : %d%n", course.getCourseName(), course.getNumberOfStudents());
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%s\n", students[i]);
        }

        System.out.print("Do you want clear this course 1(yes) or 0(no) :");
        int score = input.nextInt();
        if (score == 1) {

            course.clear();

            System.out.printf("Number of students in %s : %d%n", course.getCourseName(), course.getNumberOfStudents());
            for (int i = 0; i < course.getNumberOfStudents(); i++) {
                System.out.printf("%s\n", students[i]);
            }
        } else {

            System.out.println("finish");
        }
    }
}
