import java.util.ArrayList;

abstract public class Entity implements Battle {

    ArrayList<Spell> spells = new ArrayList<>();
    int currHP;
    int maxHP;
    int currMana;
    int maxMana;
    boolean fireImm;
    boolean iceImm;
    boolean earthImm;

    public void regenHP(int HP) {
        currHP += HP;
        if (currHP > maxHP) {
            currHP = maxHP;
        }
    }

    public void regenMana(int mana) {
        currMana += mana;
        if(currMana > maxMana) {
            currMana = maxMana;
        }
    }

    public void useAbility(Spell spell, Entity entity) {
        if (entity.currMana >= spell.reqMana) {
            int damage = this.getDamage() + spell.damage;
            entity.recieveDamage(damage);
        }
        else {
            entity.recieveDamage(this.getDamage());
        }
    }
}
