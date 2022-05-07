package InterfacesAndAbstraction.Exercise.MilitaryElite;

import java.util.Collection;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer{
    private Collection<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps, Collection<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs;
    }

    public void addRepair(Repair repair){
        repairs.add(repair);
    }

    public Collection<Repair> getRepairs(){
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Name: %s %s Id: %d Salary: %.2f\n" +
                "Corps: %s\n" +
                "Repairs:", super.getFirstName(), super.getLastName(), super.getId(), super.getSalary(), super.getCorps().name()));
        repairs.forEach(mission -> builder.append(mission.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
