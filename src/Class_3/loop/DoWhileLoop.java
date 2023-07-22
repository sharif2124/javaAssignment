package Class_3.loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        //Generate Multiplication Table using DoWhile loop
        int num=7, i=1;
        do{
            System.out.printf("%d * %d = %d\n",num,i,num*i);
            i++;
        }while (i<=10);

        //even number
        int j=2;
        do{
            System.out.println(j);
            j+=2;
        }while (j<=100);

        //odd number

        int k=1;
        do{
            System.out.println(k);
            k+=2;
        }while (k<=100);

    }
}
