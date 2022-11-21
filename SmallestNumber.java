public class SmallestNumber {
    public static void main(String[] args) {

        int [] intArray = {52,46,37,64,5,82,73,91,28,7};
        int min = intArray[0];

        for (int i = 0 ;i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("Smallest number is: " +min);

    }
}
