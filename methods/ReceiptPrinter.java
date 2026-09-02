package methods;

public class ReceiptPrinter {
    /*
        Welcome! In this module, you will be creating a reusable receipt printer. 

        Please follow the prompts below, and write your code in the allotted sections. 
        When you are finished, run your code by clicking the triangle on the top-right corner.



        --------- PART 1 ---------

        1. Write code (in main) to print a divider, then "RECEIPT", then another divider. Below is an example. 
        =====================================
        RECEIPT
        =====================================

        2. After the header from above, print a list of items with their prices. For example: 
           Burger    $12.99
           Fries     $3.50
           Drink     $2.00

        3. Now write code to print a divider, then the final price. Below is an example. 
        =====================================
        SUBTOTAL        $18.49
        TOTAL           $19.78

        4. Now write another receipt for a different set of items. Run your code after you are finished


        --------- PART 2 ---------
        Notice how this is difficult to write and read. Surely there's a better way. Comment out your code 
        from parts 1-4. We will write a better version. 


        5. Begin by replacing your code to print the dividers with a method. The method header has been 
        written for you as `printDivider`

        6. Now create two arrays: one which stores the item names, and one which stores the prices for each item. 

        7. Create a method which takes in the array of item names and the array of item prices, and 
          prints the itemized list as part (2). The method header has been created for you as `printItemizedList`

        8. Create another method which computes the subtotal from an array of item prices. Make it "return" 
          the subtotal to the calling program. The method header has been created as `computeSubtotal`

        9. Write a method which takes in a subtotal and "returns" the total (subtotal * (1+tax rate)), and use it. 
          You may uncomment the `applyTax` method to do so. 
        
        10. Run your program. You should have your first receipt completely printed!

        --------- PART 3 ---------


        11. You still have one method incomplete (printReceipt). This is because it is still a bit difficult to 
          completely write another receipt (you still have to call a bunch of methods and write two new arrays). 
          Copy your current code for printing one receipt into `printReceipt`, and modify it so that works
          for any items/prices given. 
          Then, comment out your old receipt printing code, and write 

    */
    public static void main(String[] args) {

        /*--------- PART 1 --------- */
        // 1. Print the divider and the 'RECEIPT' header

        System.out.println("===============================\n\nRECEIPT\n\n===============================");

        // 2. Print list of items with prices

        // System.out.println("Burger" + "\t\t\t" + 12.99); 
        // System.out.println("Fries" + "\t\t\t" + 3.50); 
        // System.out.println("Drinks" + "\t\t\t" + 2.00); 

        // // 3. Print divider, subtotal, and final price
        
        // System.out.println("===============================\n");
        
        // System.out.println("Subtotal: " + 18.49); 
        // System.out.println("Total: " + 19.78); 

        // 4. Write another receipt (do steps 1-3 again)

        // System.out.println("===============================\n\nRECEIPT\n\n===============================");

        // System.out.println("Chicken nuggets" + "\t\t\t" + 9.99); 
        // System.out.println("Fries" + "\t\t\t" + 3.50); 
        // System.out.println("Soda" + "\t\t\t" + 2.00); 

        // System.out.println("===============================\n");
        
        // System.out.println("Subtotal: " + 15.49); 
        // System.out.println("Total: " + 16.57);

        /*--------- PART 2 --------- */

        // 5.2. Run the printDivider method by uncommenting below:

        

        // 6. Create two arrays for item names and prices. 
        // ------ BEGIN CODE ------

        String[] names = {"Burger", "Fries", "Drinks"};
        double[] prices = {12.99, 3.50, 2.00}; 
       
        // ------ END CODE -----

        // 7.2. Print the itemized list by uncommenting below: 
        printItemizedList(names, prices); 

        // 8.2. Compute the subtotal and print it out. The code has been written for you, uncommment when ready:
        printDivider();
        double subtotal = computeSubtotal(prices); 
        System.out.println("Subtotal: " + subtotal); 
        
        // 9.2. Compute and print the final price below. 
        System.out.println("Total: " + "__"); 


        /*--------- PART 3 --------- */
        // 11.2. When you are finished with writing the printReceipt method, uncomment below and fill in the 
        // names/prices to run it. Notice how elegant this is! 
        String[] names1 = {"Burger", "Fries", "Drinks"};
        double[] prices1 = {12.99, 3.50, 2.00}; 
        printReceipt(names1, prices1); 
        String[] names2 = {"Chicken Wings", "Fries", "Soda"};
        double[] prices2 = {9.99, 3.50, 2.00}; 
        printReceipt(names2, prices2); 


    }

    public static void printDivider() {
        // 5.1. Move your divider printing code here
        System.out.println("===============================\n");
    }


    public static void printItemizedList(String[] names, double[] prices) {
        // 7.1. print itemized list here
        for (int i = 0; i < names.length; i++) {
            String name = names[i]; 
            double price = prices[i]; 
            
            // print out the name and price for the current item
            System.out.println(name + "\t\t\t" + price);
        }
    }

    public static double computeSubtotal(double[] prices) {
        // 8.1. Compute subtotal here
        double subtotal = 0; 
        for (int i = 0; i < prices.length; i++) {
            subtotal = subtotal + prices[i]; 
        }
        return subtotal; 
    }

    
    public static double applyTax(double subtotal) {
       // 9.1. compute & return final price here
       subtotal = subtotal * 1.08;
       return subtotal;
    }





    public static void printReceipt(String[] names, double[] prices) {
    // 11.1. copy your current receipt printing code here and modify to allow printing any given `names` and `prices`
        printDivider();
        System.out.println("RECEIPT"); 
        printDivider(); 
    }




}
