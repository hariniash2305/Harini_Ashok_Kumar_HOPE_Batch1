public class checkedException{
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,4,5};
            System.err.println(arr[6]);
        } catch ( Exception e) {
            System.out.println(e);
        }
    }
}