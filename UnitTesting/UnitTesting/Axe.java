package UnitTesting;

public class Axe implements Weapon {

    private int attackPoints;
    private int durabilityPoints;

    public Axe(int attack, int durability) {
        this.attackPoints = attack;
        this.durabilityPoints = durability;
    }

    @Override
    public int getDurabilityPoints() {
        return this.durabilityPoints;
    }

    @Override
    public void attack(Target target) {
        if (this.durabilityPoints <= 0) {
            throw new IllegalStateException("Axe is broken.");
        }

        target.takeAttack(this.attackPoints);
        this.durabilityPoints -= 1;
    }

    @Override
    public int getAttackPoints() {
        return 0;
    }
}
