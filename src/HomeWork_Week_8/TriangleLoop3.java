package HomeWork_Week_8;

public class TriangleLoop3 {
    public static void main(String[] args) {
        int row = 5;
        for (int j = 0; j < row; j++){
            for (int i =2*(row-j) ; i >= 0; i--){
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
