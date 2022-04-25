package Student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //create student set
        List<Student> StudentList = new LinkedList<>();
        int choice;

        //user enter student
        do {
            System.out.println("Enter student ID: ");
            String studentID = keyboard.nextLine();
            System.out.println("Enter student first name: ");
            String firstName = keyboard.nextLine();
            System.out.println("Enter student last name: ");
            String lastName = keyboard.nextLine();
            System.out.println("Enter date of birth: ");
            String DoB = keyboard.nextLine();
            System.out.println("Enter course year: ");
            int courseYear = keyboard.nextInt();

            Student studentObject = new Student(studentID, firstName, lastName, DoB, courseYear);

            StudentList.add(studentObject);

            System.out.println("Do you want to continue?");
            System.out.println("Enter 0 for YES");
            System.out.println("Enter 1 for NO");
            choice = keyboard.nextInt();
            keyboard.nextLine();

        } while (choice == 0);

        //display student list
        System.out.println("======THE STUDENT LIST IS: ");
        for (int i = 0; i < StudentList.size(); i++) {
            System.out.println(StudentList.get(i));
        }

        //student sort by school year
        System.out.println("===== STUDENT SORT BY SCHOOL YEAR ======");
        Collections.sort(StudentList, new StudentSortByCourseYear());
        for (Student student : StudentList
        ) {
            System.out.println(student);
        }

        //Enter and search
        System.out.println("Enter an ID you want to search: ");
        String search = keyboard.nextLine();

        boolean result = false;
        int i = 0;
        for (Student student : StudentList) {
            if (student.getStudentId().equalsIgnoreCase(search))
            {
                result = true;
                i = StudentList.indexOf(student);
            }
        }

        if (result)
        {
            System.out.println("============= FOUND ===========" + "\n" + StudentList.get(i));
        }
        else
        {
            System.out.println("============ NO INFORMATION ============");
        }

        //print list of students who have course year from 2019 to 2021
        int start = 0;
        int end = 0;

        for (Student student : StudentList)
        {
            if (student.getCourseYear() == 2019)
            {
                start = StudentList.indexOf(student);
            }
            if (student.getCourseYear() == 2021);
            {
                end = StudentList.lastIndexOf(student)+1;
            }
        }

        //sublist of STudentList and print out
        List<Student> StudentList_subList = StudentList.subList(start, end);
        System.out.println("====== STUDENT FROM 2019 - 2021");
        for (Student student : StudentList_subList)
        {
            System.out.println(student);
        }

    }
}
