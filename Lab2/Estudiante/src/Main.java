public class Main {
    public static void main(String[] args) {

        Address studentAddress = new Address("Cra 27 #56", "No Idea", "Bucaramanga");
        Student student = new Student("Juan", 1, studentAddress);

        School school = new School("Escuela de Ingeniería de Sistemas");
        School school1 = new School("Escuela de Ingeniería civil");
        Faculty faculty = new Faculty("FisicoMecanicas");
        faculty.addSchool(school);
        faculty.addSchool(school1);



        school.addStudent(student);
        System.out.println("Información del estudiante:");
        student.printInfo();

        // Imprimir las escuelas en la facultad
        faculty.printSchools();
    }
}
