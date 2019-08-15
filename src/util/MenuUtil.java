package util;

import java.util.Scanner;

public class MenuUtil {
    public static int showMenu(){
            System.out.println("Zəhmət olmasa əməliyyatı seçin:");
            String str = "1-Şagirdləri daxil et\n" +
                    "2-Şagirdləri göstər\n" +
                    "3-Şagirdlərin yarmillik qiymətini hesabla\n" +
                    "4-Şagirdlərin yarmillik qiymətini göstər\n" +
                    "5-Proqramdan çıx\n" +
                    "6-Profildən çıx";
            System.out.println(str);

        Scanner sc = new Scanner(System.in);
        int selectMenu = sc.nextInt();
        if(selectMenu > 0 && selectMenu < 7){
            return selectMenu;
        }else {
            System.out.println("Zəhmət olmasa düzgün seçim edin!");
            return -1;
        }

    }

    public static void selectMenu() {
        while(true) {
            int selectMenu = showMenu();

            if (selectMenu == 1) {
                StudentsUtil.enterStudents();
            }if (selectMenu == 2) {
                StudentsUtil.showStudents();
            }if (selectMenu == 3) {
                PointUtil.calculatePoint();
            }if (selectMenu == 4) {
                PointUtil.showPointOfStudents();
            }if (selectMenu == 5) {
                System.exit(0);
            }if (selectMenu == 6) {
                TeacherUtil.requireLogin(3,true);
            }



        }
    }
}
