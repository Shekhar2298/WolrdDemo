package Interface;



import java.io.Serializable;

public class Student implements Trial,Serializable, Comparable<Student> {
    private String name;
    private int marks;

    public Student() {
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

  @Override
  public  void display(){
      System.out.println(name);
  }

    @Override
    public int showMark() {
        return marks;
    }


    @Override
    public int compareTo(Student student) {
        if (this.marks > student.marks) {
            return 1;
        } else if (this.marks < student.marks) {
            return -1;
        } else {
            return 0;
        }
    }
}
