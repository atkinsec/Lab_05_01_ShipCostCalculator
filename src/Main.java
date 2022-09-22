public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter your cost");
        //input cost
        double cost = 110;
        double total = 0;

        if (cost >= 100){
            System.out.println("Shipping is free, your total is " + cost + " dollars");

        }
        else {
            total = cost + (cost * 0.02);
            System.out.println("your total is with shipping " + total + " dollars");
        }
    }
}