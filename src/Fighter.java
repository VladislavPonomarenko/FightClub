import java.util.Random;

/**
 * Created by wp-1-09 on 01.03.2017.
 */
public class Fighter {
    private String name;
    private int forse;
    private int dexterity;
    private int intuition;
    private int xp;

    Random random = new Random();

    public Fighter(String name) {
        this.name = name;
        forse = random.nextInt(100)+1;
        dexterity = random.nextInt(100)+1;
        intuition = random.nextInt(100)+1;
        xp = 100;

        int sum = forse+dexterity+intuition;

        float coef = (float)50/sum;


        forse *= coef;
        dexterity*= coef;
        intuition*= coef;

        if(forse<1)
            forse=1;


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

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", forse=" + forse +
                ", dexterity=" + dexterity +
                ", intuition=" + intuition +
                ", xp=" + xp +
                '}';
    }
}
