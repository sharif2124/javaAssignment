package Class_3.loop;

public class ForLoop {
    public static void main(String[] args) {
       //even number
        for (int i = 2;i<=100;i+=2){
            System.out.println(i);
        }

        //odd number
        for(int i =1;i<=100;i+=2){
            System.out.println(i);
        }

        //Generate Multiplication Table using for loop

        int num = 6;
        for (int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}
