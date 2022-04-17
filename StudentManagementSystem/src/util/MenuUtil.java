/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuUtil {
   
    public static Menu showMenu () {
        Menu.showAllMenu();
        System.out.println("Please, select menu: ");
        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();
        
     return Menu.find(selectedMenu);
    }
    public static void processMenu(Menu menu){
        menu.process();
}
}