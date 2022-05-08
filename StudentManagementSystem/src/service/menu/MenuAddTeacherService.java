/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.menu.inter.MenuAddTeacherServiceInter;

/**
 *
 * @author User
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{

    @Override
    public void process() {
         Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.next();
        
        sc = new Scanner(System.in);
        System.out.print("surname: ");
        String surname = sc.next();
        
        sc = new Scanner(System.in);
        System.out.print("age: ");   
        int age = sc.nextInt();
        
        sc = new Scanner(System.in);
        System.out.print("schoolName: ");
        String schoolName = sc.next();
        
        
        sc = new Scanner(System.in);
        System.out.print("salary: ");
        double salary = sc.nextDouble();
        
         Teacher t = new  Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);
       t.setSchoolName(schoolName);
       t.setSalary(salary);
        
       Config.instance().setTeachers(t);
    }
    
}
