package Tomasz_Nowak;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n =10;
        for(int i = 1 ; i<= n ; i++){
            for(int j = n - i ; j >= 0 ; j--){
                System.out.printf(" "); }
            for(int k = 2 * i - 1; k > 0 ; k--) {
                System.out.printf("*"); }
            System.out.printf("\n");
        }
    }
}
