package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;

public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("username: ");
        String username = sc.next();
        sc = new Scanner(System.in);
        System.out.print("password: ");
        String password = sc.next();
        if (!(username.equals("abcde") && password.equals("abcde"))){
            throw new IllegalArgumentException("Username or password is invalid!!");
                   }
        Config.setLoggedIn(true);
    
    }

   /* @Override
    public void gmail() { }
    */
}
