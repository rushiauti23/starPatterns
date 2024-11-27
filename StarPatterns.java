public class StarPatterns {

    public static void main(String[] args) {
        Pattern9(5);
    }

    static void Pattern1(int n){

        for(int row=1; row<=n; row++){
            //we will run inner loop for row imes
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n){

        for(int row=1; row<=n; row++){
            //we will run inner loop for row imes
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n){

        for(int row=1; row<=n; row++){
            //we will run inner loop for row imes
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n){

        for(int row=1; row<=n; row++){
            //we will run inner loop for row imes
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n){

        for(int row=1; row < 2*n; row++){
            //we will run inner loop for row imes
            int columns = row > n ? 2*n-row : row;

            for (int col = 1; col <= columns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n){

        for(int row=1; row <= n; row++){
            //we will run inner loop for row imes
            int noOfSpace = n-row;

            for (int i = noOfSpace; i >= 1; i--) {
                System.out.print("  ");
            }


            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n){

        for(int row=1; row <= n; row++){
            //we will run inner loop for row imes
            int noOfSpace = row-1;

            for (int i = 1; i <= noOfSpace; i++) {
                System.out.print("  ");
            }


            for (int col = n-row+1; col >= 1; col--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void Pattern8(int n){

        for(int row=1; row <= n; row++){
            //we will run inner loop for row imes
            int noOfSpace = n-row;

            for (int i = noOfSpace; i >= 1; i--) {
                System.out.print(" ");
            }


            for (int col = 2*row-1; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n){

        for(int row=1; row <= n; row++){
            //we will run inner loop for row imes
            int noOfSpace = row-1;

            for (int i = noOfSpace; i >= 1; i--) {
                System.out.print(" ");
            }


            for (int col = 2*(n-row)+1; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    static void Pattern28(int n){

        for(int row=1; row < 2*n; row++){
            //we will run inner loop for row imes
            int columns = row > n ? 2*n-row : row;

            int noOfSpaces = n-columns;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= columns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
