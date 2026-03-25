public class TypecastingOperator {
    public static void main(String[] args) {
        double d=9.78;
        //explicit type conversion
        int num=(int)d;
        System.out.println("Double value after Conversion: "+d);
        System.out.println("After explicit type Conversion: "+num);
        //implicit type conversion
        int a=10;
        double b=a;
        System.out.println("After implicit conversion: "+b);
    }
}
