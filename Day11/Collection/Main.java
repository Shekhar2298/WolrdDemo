package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1=new ArrayList<>();
        //arrayList1.add("hello");
        arrayList1.add(12);
        arrayList1.add(45);
       // System.out.println(arrayList1);
ArrayList<Employee> arrayList2=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
       // Employee employee=new Employee(sc.nextInt(),sc.nextLine(),sc.next());
        Employee employee1=new Employee(15,"Rahul","Developer");
        Employee employee=new Employee(18,"Rajesh","Developer");
        //Employee employee1=new Employee(15,"Rahul","Developer");
        arrayList2.add(employee);
        arrayList2.add(employee1);
        arrayList2.remove(employee);
        //System.out.println(arrayList2);
        //boolean b=arrayList2.removeAll(arrayList1);
        //System.out.println(b);
        Collections.sort(arrayList2,new EmployeeById());
        for (Employee e:arrayList2){
            System.out.println(e);
        }
    }

}
