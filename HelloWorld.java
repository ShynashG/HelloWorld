
class HelloWorld {
    static int first, second, res;
    
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        add(1,2);
        sub(3,2);
            

    }
    public static int add(int a, int b){
        res = a + b;
        System.out.println("Sum = " + res);
        return res; 
    }
    
    public static int sub(int a, int b){
        res = a -b;
        System.out.println("sub = " + res);
        return res; 
    }
    
    public static int mul(int a, int b){
        res = a*b;
        System.out.println("Mul = " + res);
        return res; 
    }
    public static int  div(int a, int b){
        res = a/b;
        System.out.println("Div = " + res);
        return res; 
    }
}