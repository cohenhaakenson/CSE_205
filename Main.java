public class Main {
    public static void main(String[] args) {
        
        int age = 3;
        String fname = "bob";
        String lname = "smith";
        int inches = 67;
        System.out.printf("Mr. %s (first name %s) is %d inches tall and %d years old",
                   fname, lname, age, inches);

                   int[] my_array = {1, 2, 3, 4, 5};
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