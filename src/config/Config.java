package config;

import beans.*;

public class Config {
    private static Teacher teacher = null;
    private static Student[] students = null;
    public static Point[] points = null;

    public static Teacher getTeacher() {
        return teacher;
    }

    public static void setTeacher(Teacher teacher) {
        Config.teacher = teacher;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static void setStudents(Student[] students) {
        Config.students = students;
    }

    public static Point[] getPoints() {
        return points;
    }

    public static void setPoints(Point[] points) {
        Config.points = points;
    }
}
