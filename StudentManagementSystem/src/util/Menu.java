
package util;

import bean.Config;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowStudentsService;
import service.menu.MenuShowTeachersService;
import service.menu.inter.MenuService;


public enum Menu {
    LOGIN (1, "Login", new MenuLoginService()),
    REGISTER (2, "Register", new MenuRegisterService()),
    ADD_TEACHER (3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT (4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER (5, "Show teachers", new MenuShowTeachersService()),
    SHOW_ALL_STUDENT (6, "Show students", new MenuShowStudentsService()),
    UNKNOWN;
    
    private String label;
    private MenuService service;
    private int number;

    private Menu() {
    }
    
    
    private Menu (int number,String label, MenuService service){
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }
    
    public void process (){
    service.process();
    MenuUtil.showMenu();
}
    public static Menu find(int number){
         Menu menus[] = Menu.values();
          for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number){
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }
    public static void showAllMenu(){
    Menu menus[] = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i]!=UNKNOWN)
                if (menus[i]==LOGIN || menus[i]==REGISTER){
                if (!Config.isLoggedIn()){
                 System.out.println(menus[i]);
                }
                  }
            else if  (Config.isLoggedIn()){
                 System.out.println(menus[i]);
                }
           
        }
        

}
}