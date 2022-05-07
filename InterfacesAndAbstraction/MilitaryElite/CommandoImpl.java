package InterfacesAndAbstraction.Exercise.MilitaryElite;

import java.util.Collection;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando{
    private Collection<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps, Collection<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }

    public void completeMission(){

   }

    public void addMission(Mission mission){
       missions.add(mission);
    }

    @Override
    public Collection<Mission> getMission() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Name: %s %s Id: %d Salary: %.2f\n" +
                "Corps: %s\n" +
                "Missions:", super.getFirstName(), super.getLastName(), super.getId(), super.getSalary(), super.getCorps().name()))
                        .append(System.lineSeparator());
        missions.forEach(mission -> builder.append(mission.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
