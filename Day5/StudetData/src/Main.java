import Model.School;
import Model.Student;
import Model.Subject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student sd=new Student();
        Scanner sc= new Scanner(System.in);
        sd.setName(sc.nextLine());
        School sh=new School("IIT");
        Subject sbj=new Subject("Math");
        sd.setSchool(sh);
        sd.setSubject(sbj);
        System.out.println(sd);
    }
}
