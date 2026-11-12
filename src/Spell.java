

public class Spell {
    int damage;
    int reqMana;
    String type;

    public Spell(String type, int damage, int reqMana) {
        this.type = type;
        this.damage = damage;
        this.reqMana = reqMana;
    }

    public String toString() {
        return (type + damage + reqMana);
    }

}
