public class Debug2 {
    /**
     * TASK: 
     *  The following program has some bugs for you to fix. 
     *  Try running the program to see what error messages/results are printed, 
     *  and fix the program from there. 
     * 
     *  This program should print the sum of even numbers from 50 to 100 using a for loop (eg. 50+52+54+...+98+100)
     *    The expected output is 1950
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        int sum = 0; 

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0) {
                sum = sum + i; 
            }
        }

        System.out.println(sum); 
    }
}