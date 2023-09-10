public class Main {
    public static void main(String[] args) {
        int x = 98, y = 28;
        y = 85;
        x = y;
        System.out.println(x);


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