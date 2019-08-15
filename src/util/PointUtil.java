package util;

import beans.Point;
import config.Config;

import java.util.Scanner;

public class PointUtil {
    public static void calculatePoint() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Semestr ərzində neçə ksq(kiçik summativ qiymətləndirilməsi) imtahanı keçirmisiniz?");
            int n = sc.nextInt();
            int m = Config.getStudents().length;
            Point[] points = new Point[m];
            for (int i = 0; i < m; i++) {
                System.out.println(Config.getStudents()[i]+":");
                points[i] = calculatePointt(n);
            }
            Config.setPoints(points);
            showPointOfStudents();
        }catch(NullPointerException ex){
            System.out.println("Zəhmət olmasa əvvəlcə şagirdləri daxil edin!");
        }
    }


    public static Point calculatePointt(int n){
        int m = Config.getStudents().length;
        Scanner sc = new Scanner(System.in);

            double sum = 0;

            for(int j = 0; j < n; j++){
                System.out.println((j+1)+" ksq qiymətini daxil edin:");
                int ksq = sc.nextInt();
                sum += ksq;
            }
            System.out.println("BSQ(Böyük Summativ Qiymətləndirilməsi) qiymətini daxil edin:");
            int bsq = sc.nextInt();
            double point = ( ( sum/n ) * 0.4 ) + ( bsq * 0.6 );
            point = Math.round(point);
            Point pt = new Point((int)point);
            return pt;

    }



    public static void showPointOfStudents(){
        try {
            int totalStudents = Config.getStudents().length;
            for (int i = 0; i < totalStudents; i++) {
                System.out.println(Config.getStudents()[i] + "-Yarımillik qiyməti:" + Config.getPoints()[i]);
            }
        }catch(NullPointerException ex){
            if(Config.getStudents() == null) {
                System.out.println("Zəhmət olmasa əvvəlcə şagirdləri daxil edin!");
            }else{
                System.out.println("Zəhmət olmasa əvvəlcə şagirdlərin yarımillik qiymətini hesablayasınız!");
            }
        }


    }
}
