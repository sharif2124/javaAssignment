package student.multilevelInheritance;

public class TestGame {
    public static void main(String[] args) {
        OneDay oneDay = new OneDay();
        oneDay.teamName="Bangladesh vs India";
        oneDay.type="One Day Match";
        oneDay.setFieldName("Sher-e-Bangla National Cricket Stadium");
        oneDay.over=50.00;

        oneDay.displayInformation3();
        System.out.println("Field Name : "+oneDay.getFieldName());

    }
}
