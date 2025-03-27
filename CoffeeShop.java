public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        CoffeeOrder coffeeOrder1 = new CoffeeOrder();
        CoffeeOrder coffeeOrder2 = new CoffeeOrder("large");
        CoffeeOrder coffeeOrder3 = new CoffeeOrder("small" , "white");

        // Use a different constructor each time

        // TODO 3: Call describeOrder() on each and print the result
        coffeeOrder1.describeOrder();
        coffeeOrder2.describeOrder();
        coffeeOrder3.describeOrder();

        // TODO 4: Print the total number of orders using
        // CoffeeOrder.getTotalOrders()
        System.out.println("Total Orders: "+CoffeeOrder.getTotalOrders());
    }
}
