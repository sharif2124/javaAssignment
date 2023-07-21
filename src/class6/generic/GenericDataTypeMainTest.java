package class6.generic;

public class GenericDataTypeMainTest {
    public static void main(String[] args) {
        DataType<Integer> intdataType = new DataType<>(10);
        System.out.println("Integer Value : "+intdataType.getDatatype());

        DataType<Double> doubleDataType = new DataType<>(30.00);
        System.out.println("Double Value :"+doubleDataType.getDatatype());

        DataType<String> stringDataType = new DataType<>("Welcome To Generic Part");
        System.out.println("String Value : "+stringDataType.getDatatype());
    }
}
