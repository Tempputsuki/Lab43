/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tempp
 */


 class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public double countValue() {
		return(amount * price);
	}
	
	void changeAmount (int newValue)
	{
		this.amount = newValue;
	}
    
     

	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs\n", name,price,amount);
	}
 public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120);
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();
		product.changeAmount(200);
		product.printProduct();
 }
}


