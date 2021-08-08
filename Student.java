import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    private String id;
    private String name;

    @OneToOne(mappedBy = "student")
    private Computer computer;

    @OneToMany(mappedBy ="student")
    private List<Book> books;

    @ManyToMany
    private List<Subject> subjects;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
