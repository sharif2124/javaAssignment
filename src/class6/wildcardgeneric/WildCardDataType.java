package class6.wildcardgeneric;

public class WildCardDataType<T extends Number>{
   private T dataTypes;

   public WildCardDataType(T dataType){
       this.dataTypes=dataType;
   }

    public T getDataTypes() {
        return dataTypes;
    }
}
