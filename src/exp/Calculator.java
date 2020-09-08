package exp;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a , int b){
        return a+b;
    }

    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a , int b){
        return a*b;
    }
    public int div(int a , int b) {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }
}
