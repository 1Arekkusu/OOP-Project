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


}
