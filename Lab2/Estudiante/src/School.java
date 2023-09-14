import java.util.ArrayList;
public class School {
    String name;
    ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printLevel(int level) {
        System.out.println("Estudiantes en el nivel " + level + " de la escuela " + name + ":");
        for (Student student : students) {
            if (student.getLevel() == level) {
                student.printInfo();
                System.out.println();
            }
        }
    }

    public String getName() {
        return name;
    }
}