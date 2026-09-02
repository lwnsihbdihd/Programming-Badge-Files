package loops;

public class TipCalculator {
    /*
        Welcome! In this module, you will be writing a tip calculator

        Please follow the prompts below, and write your code in the allotted sections. 
        When you are finished, run your code by clicking the triangle on the top-right corner.

        You may need to uncomment certain portions of the code before filling them in. Use Ctrl+/ to do so. 
    */
    public static void main(String[] args) {
        // 1. Define variables for the meal cost and tip percentage.
        // ---- BEGIN CODE ----

        double cost = 9.99;
        double tipPercent = 0.1;  

        // ---- END CODE ----


        // 2. Calculate the amount of the tip.
        // ---- BEGIN CODE ----

        double tipAmount = cost * tipPercent; 

        // ---- END CODE ----


        // 3. Calculate the total cost.
        // ---- BEGIN CODE ----

        double totalCost = cost + tipAmount; 

        // ---- END CODE ----


        // 4. Print the meal cost, tip, and total.
        // ---- BEGIN CODE ----

        System.out.println("Meal cost: " + cost + "\n Tip: " + tipAmount + "\n Total: " + totalCost); 

        // ---- END CODE ----


        // 5. Try changing the values above.
        // What happens if the meal costs $25.50?
        // What happens if the tip is 20%?
    }
}
