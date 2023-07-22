package class5.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rahim");
        p.setAge(38);
        p.setQualification("Teacher");
        p.setSalary(800000);
        System.out.println("Name : "+p.getName());
        System.out.println("Age : "+p.getAge());
        System.out.println("Qualification : "+p.getQualification());
        System.out.println("Salary : "+p.getSalary());
    }
}
