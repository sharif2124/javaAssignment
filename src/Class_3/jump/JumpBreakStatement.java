package Class_3.jump;

public class JumpBreakStatement {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i==10){
                break;
            }
            System.out.println(i);
        }

        //For Decrement

        for(int j=30; j>15; j--){
            if(j==20){
                break;
            }
            System.out.println(j);
        }
    }
}
