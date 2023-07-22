package Class_3.loop;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println("Bangladesh");
            i++;
        }

        //Generate Multiplication Table using While loop

        int num = 5,j=1;

        while (j<=10){
            System.out.printf("%d * %d =%d\n ",num,j,num*j);
            j++;
        }
    }
}
