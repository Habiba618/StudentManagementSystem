
package util;

import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.inter.MenuService;


public enum Menu {
    LOGIN (1, "Login", new MenuLoginService()),
    REGISTER (2, "Register", new MenuRegisterService()),
    ADD_TEACHER (3, "Add teacher", null),
    ADD_STUDENT (4, "Add student", null),
    SHOW_ALL_TEACHER (5, "Show teachers", null),
    SHOW_ALL_STUDENT (6, "Show students", null),
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
            System.out.println(menus[i]);
        }
        

}
}