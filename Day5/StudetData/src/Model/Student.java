package Model;

public class Student {
    private String name;
    private School school;
    private  Subject subject;

    public Student() {
    }

    public Student(School school, String name, Subject subject) {
        this.school = school;
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                ", subject=" + subject +
                '}';
    }
}
