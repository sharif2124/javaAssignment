package Class_3.jump;

public class JumpContinueStatement {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i==10){
                continue;
            }
            System.out.println(i);
        }

        //For Decrement

        for (int j=20;j>10;j--){
            if(j==13){
                continue;
            }
            System.out.println(j);
        }
    }
}
