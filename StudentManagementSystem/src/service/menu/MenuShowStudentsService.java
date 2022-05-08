/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuShowStudentsServiceInter;

/**
 *
 * @author User
 */
public class MenuShowStudentsService implements MenuShowStudentsServiceInter{

    @Override
    public void process() {
        Student[] allstudents = Config.instance().getStudents();
        for (int i = 0; i < allstudents.length; i++) {
            System.out.println(allstudents[i]);
            
        }
    }
    
}
