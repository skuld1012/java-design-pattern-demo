package me.tedzhang.demo.designpattern.behavioral.strategy;

/**
 * Strategy pattern is used when we have multiple algorithm for a specific task and client 
 * decides the actual implementation to be used at runtime.
 * 
 * @author skuld1012
 *
 */
public class StrategyPatternMain {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
        
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
         
        cart.addItem(item1);
        cart.addItem(item2);
         
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
         
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
 
}
