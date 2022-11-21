public class LargestNumber {
    public static void main(String[] args) {

        int [] intArray = {52,46,37,64,5,82,73,91,28,7};
        int max = intArray[0];

        for (int i = 0 ;i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("Largest number is: " +max);

    }
}
