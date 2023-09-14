import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<School> schools;

    public Faculty(String name) {
        this.name = name;
        this.schools = new ArrayList<>();
    }

    public void addSchool(School school) {
        schools.add(school);
    }

    public void printSchools() {
        System.out.println("Escuelas en la facultad de " + name + ":");
        for (School school : schools) {
            System.out.println(school.getName());
        }
    }

    public String getName() {
        return name;
    }
}
