package overloading.abstraction.Game;

public class AbstractionMainCricket {
    public static void main(String[] args) {
        CricketMatch cricketMatch = new Shakib();
        System.out.println("Shakib Al Hasan Score is : "+cricketMatch.getScore());

        Tamim tm = new Tamim();
        System.out.println("Tamim Igbal Khan Score is : "+tm.getScore());

        Rahim rahim = new Rahim();
        System.out.println("Rahim Score is : "+rahim.getScore());

        CricketMatch cm;
        cm=new Liton();
        System.out.println("Liton Score is : "+cm.getScore());
    }
}
