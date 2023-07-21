package student.multilevelInheritance;

public class OneDay extends Cricket{
    double over;

    OneDay(){

    }

    void displayInformation3(){
        displayInformation2();
        System.out.println("Over : "+over);
    }
}
