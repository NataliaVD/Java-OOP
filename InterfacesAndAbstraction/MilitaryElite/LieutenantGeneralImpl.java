package InterfacesAndAbstraction.Exercise.MilitaryElite;

import java.util.Collection;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Collection<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, Collection<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }

    public void addPrivate(Private priv) {
        privates.add(priv);
    }

    @Override
    public Collection<Private> getPrivets() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Name: %s %s Id: %d Salary: %.2f\n" +
                "Privates:", super.getFirstName(), super.getLastName(), super.getId(), super.getSalary()))
                        .append(System.lineSeparator());
        privates.forEach(mission -> builder.append(mission).append(System.lineSeparator()));
        return builder.toString();
    }
}
