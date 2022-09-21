package Task3and4;

public class CloneTrooper extends JangoFett {
    public CloneTrooper(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.print(" " + firstname + " " + lastname + "\r\n");
    }
    public static class Nested {

        public void SayHello() {
            System.out.println("Empire needs you");
        }
    }
}
