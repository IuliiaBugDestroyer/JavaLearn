package Task3and4;

public class Jedi extends Humanoid {
    public Jedi(String firstname, String lastname) {
        super(firstname, lastname, true);
        System.out.println("Jedi " + firstname + " " + lastname);
    }

    public class Inner {

        public void SayHello() {
            System.out.println("May the force be with you!");
        }
    }
}
