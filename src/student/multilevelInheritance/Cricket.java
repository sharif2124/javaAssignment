package student.multilevelInheritance;

public class Cricket extends Game{
    String type;
    private String fieldName;



    Cricket(){

    }

    public String getFieldName(){
        return fieldName;

    }

    public void setFieldName(String fieldName){
        this.fieldName=fieldName;
    }

    void displayInformation2(){
        displayInformation();
        System.out.println("Type : "+type);
    }

}
