public class User {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String username;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String generateDisplayName(){
        return "User: " + firstName + " " + lastName;
    }

}


