package Interface;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aarti", 90);
        Student student2 = new Student("Jay", 90);

        System.out.println("Comparing marks of students:");
        int comparison = student1.compareTo(student2);
        if (comparison > 0) {
            System.out.println(student1.getName() + "'s marks are higher than " + student2.getName() + "where Marks are " + student1.getName() + " =  " + student1.getMarks() + " and " + student2.getName() + "=" + student2.getMarks());

        } else if (comparison < 0) {
            System.out.println(student1.getName() + "'s marks are less than " + student2.getName() + " where Marks are " + student1.getName() + " =  " + student1.getMarks() + " and  " +  student2.getName() + "= " + student2.getMarks());
        } else {
            System.out.println("Marks of " + student1.getName() + " and " + student2.getName() + " are equal");
        }
    }
}
