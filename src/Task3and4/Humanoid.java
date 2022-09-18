package Task3and4;

public abstract class Humanoid implements Entity {
    public String firstname;
    public String lastname;
    protected boolean isForceUser;
    public Humanoid (String firstname, String lastname, boolean isForceUser) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.isForceUser = isForceUser;
    }

    @Override
    public boolean isForceUser() {
        return this.isForceUser;
    }
}
