public class Main {
    public static void main(String[] args) {
        int counter = 10;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            counter-=i;
            arr[i] = counter;
        }

        int[] simpleArr = new int[10];
        for (int i = 0; i < 10; i++) {
            simpleArr[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(simpleArr[i]);
        }
    }
}