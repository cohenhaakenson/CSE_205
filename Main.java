public class Main {
    static String bar(String s) {
        if (s.length() < 1)
            return s;
        
        return bar(s.substring(1)) + s.charAt(0);
    }

    public static void insertionSort(int [] numbers) {
          int i, j, temp;
        
           for (i = 1; i < numbers.length; ++i) {
               j = i;
               // Insert numbers4 into sorted part 
               // stopping once numbers4 in correct position
               int c = 0;
               while (j > 0 && numbers[j] < numbers[j - 1]) {
                    c++;
                    System.out.println("c: "+c);
                  // Swap numbers[j] and numbers[j - 1]
                  temp = numbers[j];
                  numbers[j] = numbers[j - 1];
                  numbers[j - 1] = temp;
                  --j;
                  System.out.println(numbers[4]);
               }
            }
          }

    public static void main(String[] args) {
        int a = 8;
        int b = 15;
        int c = 2;
        int x = 17;

        if(a>b){
            x = 15;
        }else if(a > c){
            x = 4;
        }else if(b > c){
            x = 6;
        }else{
            x = 10;
        }

        System.out.println(x);
    }

}