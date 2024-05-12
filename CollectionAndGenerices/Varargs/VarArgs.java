package CollectionAndGenerices.Varargs;



public class VarArgs {
    
    public  static void main(String[] args) {
        
        System.out.println(sum(4,5));
        // System.out.println(sum(new int[]{4,5}));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,4,7));
        // at we should pass 2 argument and also we can pass as many as we can.
        System.out.println(sum1(2, 50, 5,5));
    }
    
    // this that new syntax
    public static int sum1(int first,int second,int... a){
        int sum1 = 0;
        for (int i : a) {
            sum1 += i;
        }
        return sum1;
    }

    // new Syntax for numbers of varargs this is varargs
    public static int sum(int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    // we can pass single element also in this program so java has new syntax
    // public static int sum(int[] a){
    //     int sum =0;
    //   for (int i : a) {
    //     sum += i;
    //   }
    //     return sum;
    // }

    public static int sum(int a , int b){
        return a+b;
    }
}
