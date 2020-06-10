public class Player {

    public String firstName,lastName;
    public int age =0;
    public boolean active=true;
    public int roundReached=0;

    public int getRoundReached() {
        return roundReached;
    }

    public void setRoundReached(int roundReached) {
        this.roundReached = roundReached;
    }



    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



    public Player(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
