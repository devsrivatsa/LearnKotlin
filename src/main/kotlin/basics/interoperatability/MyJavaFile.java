package basics.interoperatability;

public class MyJavaFile {
    public static void main(String[] args) {
        int input = 14;
        System.out.println(MyCustomKotlinFile.fib(input));
    }
}