package co.za.gordonmzizi.simpleWebApp.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Authour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String LastName;
    @ManyToMany(mappedBy = "authours")
    private Set<Book> books = new HashSet<>();

    public Authour() {
    }

    public Authour(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authour authour = (Authour) o;

        return id != null ? id.equals(authour.id) : authour.id == null;
    }

    @Override
    public String toString() {
        return "Authour{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
