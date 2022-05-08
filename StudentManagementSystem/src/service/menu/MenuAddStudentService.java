
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentServiceInter;

public class MenuAddStudentService implements  MenuAddStudentServiceInter{

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
        System.out.print("scholarship: ");
        int scholarship = sc.nextInt();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setSchoolName(schoolName);
        s.setScholarship(scholarship);
        
        Config.instance().setStudents(s);
    }
    
}
