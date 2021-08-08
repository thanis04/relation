import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Computer {
    @Id
    private String code;
    private String brand;

    @OneToOne
    private Student student;

    public Computer() {
    }

    public Computer(String code, String brand) {
        this.code = code;
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
