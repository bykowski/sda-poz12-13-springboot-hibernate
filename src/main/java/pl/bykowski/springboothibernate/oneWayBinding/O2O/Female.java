package pl.bykowski.springboothibernate.oneWayBinding.O2O;

import javax.persistence.*;

@Entity
public class Female {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "male_id")
    private Male male;

    public Male getMale() {
        return male;
    }

    public void setMale(Male male) {
        this.male = male;
    }

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Female() {
    }

    public Female(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Female{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
