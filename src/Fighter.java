/**
 * Created by wp-1-09 on 01.03.2017.
 */
public class Fighter {
    private String name;
    private int forse;
    private int dexterity;
    private int intuition;
    private int xp;

    public Fighter(String name, int forse, int dexterity, int intuition, int xp) {
        this.name = name;
        this.forse = forse;
        this.dexterity = dexterity;
        this.intuition = intuition;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForse() {
        return forse;
    }

    public void setForse(int forse) {
        this.forse = forse;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntuition() {
        return intuition;
    }

    public void setIntuition(int intuition) {
        this.intuition = intuition;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
