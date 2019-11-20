package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "author")
public class Author {
    private long id;
    private String name;
    private long birthday;
    private String address;

    public Author() {
    }

    public Author(String name, long birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id &&
                birthday == author.birthday &&
                Objects.equals(name, author.name) &&
                Objects.equals(address, author.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday, address);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
