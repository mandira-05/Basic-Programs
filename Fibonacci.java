public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int n1=0;
        int n2=1;
        int nth=0;

        System.out.println("Fibonacci series upto " +n+ " is: ");
        //System.out.println(n1);
       // System.out.println(n2);

        for (int i = 0;i < n; i++) {
            nth = n1+n2;
            n1 = n2;
            n2 = nth;
            System.out.println(nth);
        }
    }
}
