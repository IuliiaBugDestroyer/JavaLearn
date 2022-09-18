package Task3and4;

import java.util.ArrayList;

public class Sith extends Humanoid {
    public Sith(String firstname, String lastname) {
        super(firstname, lastname, true);
        System.out.println("Lord " + lastname);
    }
}
