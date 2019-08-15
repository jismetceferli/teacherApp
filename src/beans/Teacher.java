package beans;

public class Teacher {
    private String username;
    private String password;

    public Teacher() {
    }

    public Teacher(String surname, String password) {
        this.username = surname;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String surname) {
        this.username = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
