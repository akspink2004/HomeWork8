package HomeWork_Week_8;

public class NumberLoop {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j = j +1){
            for (int i = 1; i <= j; i = i + 1){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
