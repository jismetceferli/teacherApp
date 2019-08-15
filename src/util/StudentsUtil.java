package util;

import beans.Point;
import beans.Student;
import config.Config;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Scanner;

public class StudentsUtil {

    public static Student register(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Şagirdin adını daxil edin:");
        String name = sc.nextLine();
        System.out.println("Şagirdin soyadını daxil edin:");
        String surname = sc.nextLine();
        Student st = new Student(name,surname);
        return st;
    }

    public static  void showStudents(){
        try {
            for (int i = 0; i < Config.getStudents().length; i++) {
                Student st = Config.getStudents()[i];
                System.out.println(st);
            }
        }catch(NullPointerException ex){
            System.out.println("Zəhmət olmasa əvvəlcə şagirdləri daxil edin!");
        }

    }


    public static  Student[] enterStudents(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Neçə nəfər şagird daxil edəcəksiniz?");
        int countStudents = sc.nextInt();
        Student[] students = new Student[countStudents];
        for(int i = 0; i < countStudents; i++){
            students[i] = register();
        }
        Config.setStudents(students);
        return students;
    }

}
