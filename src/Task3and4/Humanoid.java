package Task3and4;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humanoid humanoid = (Humanoid) o;
        return isForceUser == humanoid.isForceUser && firstname.equals(humanoid.firstname) && lastname.equals(humanoid.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, isForceUser);
    }

    @Override
    public boolean isForceUser() {
        return this.isForceUser;
    }

    @Override
    public String toString() { // Чтоб выводить в консоль какое-то человекопонятное представление объектов которые прочитали из файла
        return "[ " + this.getClass().getName() + " ]: { firstname = " + this.firstname + "; lastname = " + this.lastname + "; isForceUser = " + this.isForceUser + "; }";
    }
}
