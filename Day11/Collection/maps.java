package Collection;

import java.util.*;

public class maps {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        map.put("A", 1);
//        map.put("B", 2);
//        map.put(null,null);
//        map.remove("B",2);
//        map.put("",2);
//        map.put("c",3);
//        map.remove("c");
//        System.out.println(map);
//        Map<String,Integer>map1=new HashMap<>();
//        map1.putAll(map);
//        System.out.println(map1.keySet());
//        System.out.println(map1.values());
//        System.out.println(map1.containsKey("A"));
//        System.out.println(map1.containsValue(1));
//        map1.putIfAbsent("A",1);
//        //System.out.println(map1);
//        System.out.println(map1.entrySet());
//        System.out.println("map1 "+map1);
//        System.out.println();
//        Map<String,String>map2=new TreeMap<>();
//        map2.put("hh","2");
//        map2.put("",null);
//        map2.put("aa",null);
//
//        System.out.println(map2);
//
//        List<Employee>list=new ArrayList<>();
//        Map<String,List<Employee>> map3=new HashMap<>();
//        Employee employee=new Employee(1,"Amani","Developer");
//     Employee employee1=new Employee(2,"AArti","Developer");
// Employee employee2=new Employee(2,"Swarali","Developer");
// list.add(employee);
// list.add(employee1);
// list.add(employee2);
// map3.put("Teck",list);
//        System.out.println(map3);
//Iterator itrn= list.iterator();
//while (itrn.hasNext()){
//    System.out.println(itrn.next());
//}
//Stack <List<Employee>>stack=new Stack<>();
//stack.push(list);
//        System.out.println(stack);
//stack.push(list);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//
        Stack <Integer>stack1=new Stack<>();
        stack1.add(1);
        stack1.push(5);
        stack1.add(2);
        stack1.push(4);
        stack1.remove(2);
        stack1.pop();
        System.out.println(stack1);
    }
}
