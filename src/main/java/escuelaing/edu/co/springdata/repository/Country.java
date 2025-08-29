package escuelaing.edu.co.springdata.repository;

import jakarta.persistence.*; // <-- usa las anotaciones JPA

@Entity
@Table(name = "countries")
public class Country {

    @Id
    // Si quieres que la BD genere el id automáticamente, descomenta:
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100, unique = true)
    private String name;

    public Country() {}
    public Country(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
