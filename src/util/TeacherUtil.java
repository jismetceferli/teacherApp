package util;
import beans.Teacher;
import config.Config;
import java.util.Scanner;

public class TeacherUtil {

    public static Teacher login(String username,String password){

            if ("Teacher".equals(username) && "12345".equals(password)) {
                Teacher tc = new Teacher(username, password);
                Config.setTeacher(tc);
                return tc;
            }

           throw new IllegalArgumentException("İstifadəçi adı və ya şifrə yalnışdır!");
        }



    public static  Teacher requireLogin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("İstifadəçi adını daxil edin:");
        String username = sc.nextLine();
        System.out.println("Şifrəni daxil edin:");
        String password = sc.nextLine();
        Teacher tc = login(username, password);
        return tc;
    }

    public static  Teacher requireLogin(int tryCount, boolean b){
        for(int i = 0; i < tryCount; i++) {
            try {
                Teacher teacher = requireLogin();
                return teacher;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                if (i != tryCount - 1) {
                    System.out.println("Yenidən cəhd edin!");

                }
            }
        }
            if(b){
                System.out.println("Blok olundunuz!");
                System.exit(0);
            }

            return null;

    }
}
