package util;
import beans.*;
public class Main {

    public static void main(String[] args) {

	Teacher tc = TeacherUtil.requireLogin(3,true);
	System.out.println(tc.getUsername()+" Xoş gəlmisiniz" );

	MenuUtil.selectMenu();

    }
}
