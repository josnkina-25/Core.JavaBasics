public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String attack() {
        return getName() + "attacking with Fire!";
    }
}