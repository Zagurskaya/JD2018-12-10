package by.it.skosirskiy.jd03_02.Beans;

public class Role {
    private long id;
    private String role;

    public Role() {
    }

    public Role(long id, String role) {
        this.id = id;
        this.role = role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}