public class Main {
    public static void main(String[] args) {
        Foo x = new Foo(8), y = new Foo(47);
y.i = x.i;
y.i = 88;
System.out.println(x.i);
                        }


    
    static int  foo(int a){
        a = bar(a) - 1;
        //System.out.print(a);
        return a;
    }

    static int bar(int a){
        
        System.out.print(a);
        return a + 2;
    }



}