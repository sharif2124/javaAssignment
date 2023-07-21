package student;

public class Teacher {
       String name="Mr.Kamal";
        private static final int age = 50;
        String qualification="MSC in CSE";
        double salary = 200000.00;

        void displayInformation(){
            System.out.println("Name :"+name);
            System.out.println("Age :"+age);
            System.out.println("Qualification :"+qualification);
            System.out.println("Salary :"+salary);

        }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.displayInformation();
    }

}
