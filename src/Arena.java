import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by wp-1-09 on 02.03.2017.
 */
public class Arena {
    Random random = new Random();
    Arena(Fighter fighter1, Fighter fighter2){
       // System.out.println(fighter1+"\n");
      //  System.out.println(fighter2);


        if(random.nextBoolean()==true){

            Fighter1(fighter1,fighter2);

        }else {
                System.out.println("GO fighter" + fighter2);
                if (fighter1.getXp() > 0) {
                    fighter1.setForse(fighter2.getXp() - fighter1.getForse());
                    System.out.println(fighter1.getForse());
                } else {
                    System.out.println("Fatality");

            }

        }



    }
    public void Fighter1(Fighter finghter1, Fighter finghter2){
        System.out.println("GO fighter"+fighter1);
        if (fighter2.getXp()>0) {
            fighter2.setForse(fighter2.getXp() - fighter1.getForse());
            System.out.println(fighter2.getForse());
        }else{
            System.out.println("Fatality");}
    }
}
