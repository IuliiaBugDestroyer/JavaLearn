package Task3and4;

import java.util.ArrayList;

public class Factory {
    final static int MAX_SITH_COUNT = 2;
    public static ArrayList<Sith> Siths = new ArrayList<Sith>();

    public static Entity Create (String person, String firstname, String lastname) {
        if (person.equalsIgnoreCase("jedi")) {
            return new Jedi(firstname, lastname);
        } else if (person.equalsIgnoreCase("Sith")) {
            if (Siths.size() == MAX_SITH_COUNT) {
                System.out.println("There always must be two of them - the teacher and the padawan.");
                return null;
            }
            else if (Siths.size() < MAX_SITH_COUNT) {
                var sith = new Sith(firstname, lastname);
                Siths.add(sith);
                return sith;
            }
        }
        else if (person.equalsIgnoreCase("CloneTrooper")) {
            return new CloneTrooper(firstname, lastname);
        }
        return null;
    }
}
