import java.util.Random;

/**
 * Created by wp-1-09 on 02.03.2017.
 */
public class Arena {
    Random random = new Random();

    Arena(Fighter fighter1, Fighter fighter2) {


        if (random.nextBoolean() == true) {
            System.out.println("GO fighter <<<" + fighter1.getName()+">>>");




             while (fighter2.getXp() != 0 && fighter2.getXp() > 0 && fighter1.getXp() != 0 && fighter1.getXp() > 0){
                 Fighter1(fighter1, fighter2);
                 Fighter2(fighter1, fighter2);
             }

            if (fighter2.getXp() == 0 || fighter2.getXp() < 0) {
                fighter2.setXp(0);
                System.out.println(fighter2.getName() + ": " + fighter2.getXp() + "xp");
                System.out.println("Win " + fighter1.getName());
            } else {
                fighter1.setXp(0);
                System.out.println(fighter1.getName() + ": " + fighter1.getXp() + "xp");
                System.out.println("Win " + fighter2.getName());
            }

        } else {

            System.out.println("GO fighter <<<" + fighter2.getName()+">>>");

             while (fighter2.getXp() != 0 && fighter2.getXp() > 0 && fighter1.getXp() != 0 && fighter1.getXp() > 0){
                 Fighter2(fighter1, fighter2);
                 Fighter1(fighter1, fighter2);
             }

            if (fighter1.getXp() == 0 || fighter1.getXp() < 0) {
                fighter1.setXp(0);
                System.out.println(fighter1.getName() + ": " + fighter1.getXp() + "xp");
                System.out.println("Win " + fighter2.getName());
            } else {
                fighter2.setXp(0);
                System.out.println(fighter2.getName() + ": " + fighter2.getXp() + "xp");
                System.out.println("Win " + fighter1.getName());
            }
        }
    }

    public void Fighter1(Fighter fighter1, Fighter fighter2) {
        Random random = new Random();
        int differenceXp = fighter2.getXp();

        int crit =random.nextInt(10);
        fighter2.setIntuition(random.nextInt(10));
        fighter2.setDexterity(random.nextInt(10));
        if (differenceXp != 0 && differenceXp > 0) {
          //  System.out.println(crit+" : "+fighter2.getIntuition());
            if(crit == fighter2.getDexterity()){
                System.out.println(fighter2.getName()+": "+fighter2.getXp()+"xp"+"\033[34m (deviation)"+"\033[38m");
            }else
            if(crit == fighter2.getIntuition()){
                fighter2.setXp(fighter2.getXp() - (fighter1.getForse()*2));
                System.out.println(fighter2.getName() + ": " + fighter2.getXp() + "xp" + "(-" + (differenceXp - fighter2.getXp()) + "\033[31m crit)"+"\033[38m");
            }else {
                fighter2.setXp(fighter2.getXp() - fighter1.getForse());
                System.out.println(fighter2.getName() + ": " + fighter2.getXp() + "xp" + "(-" + (differenceXp - fighter2.getXp()) + ")");
                fighter1.setForse(random.nextInt(30) + 1);
            }
        }
        differenceXp = fighter2.getXp();

    }

    public void Fighter2(Fighter fighter1, Fighter fighter2) {
        Random random = new Random();
        int differenceXp = fighter1.getXp();

        int crit =random.nextInt(10);
        fighter1.setIntuition(random.nextInt(10));
        fighter1.setDexterity(random.nextInt(10));
        if (differenceXp != 0 && differenceXp > 0) {
            if(crit == fighter1.getDexterity()){
                System.out.println(fighter1.getName()+": "+fighter1.getXp()+"xp"+"\033[34m (deviation)"+"\033[38m");
            }else
            if(crit == fighter1.getIntuition()){
                fighter1.setXp(fighter1.getXp() - (fighter2.getForse()*2));
                System.out.println(fighter1.getName() + ": " + fighter1.getXp() + "xp" + "(-" + (differenceXp - fighter1.getXp()) + "\033[31m crit)"+"\033[38m");
            }else {
            fighter1.setXp(fighter1.getXp() - fighter2.getForse());
            System.out.println(fighter1.getName() + ": " + fighter1.getXp() + "xp" + "(-" + (differenceXp - fighter1.getXp()) + ")");
            fighter2.setForse(random.nextInt(29) + 2);
        }}
        differenceXp = fighter1.getXp();
    }

}
