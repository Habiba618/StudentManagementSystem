/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import service.menu.inter.MenuRegisterServiceInter;
import service.menu.inter.MenuService;

/**
 *
 * @author User
 */
public class MenuRegisterService implements MenuRegisterServiceInter{

    @Override
    public void process() {
        System.out.println("Register");
    }
    
}
