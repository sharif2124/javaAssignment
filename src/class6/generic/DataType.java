package class6.generic;

public class DataType <T > {
    private T datatype;

    public DataType(T datatype){
        this.datatype=datatype;
    }

    public T getDatatype() {
        return datatype;
    }
}
