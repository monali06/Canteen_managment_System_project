package canteen_management_system;

import java.util.Scanner;

public class Food {
	public String foodName;
	public float price;
	
	public Food(String foodName,float price)
	{
		this.foodName=foodName;
		this.price=price;
	}

	public void foodInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter food name: ");
		foodName=scan.nextLine();
		System.out.println("Enter food price: ");
		price=scan.nextFloat();
	}
	public void foodPayment()
	{
		System.out.println(" price:"+price);	
	}

	
	public String detail() {
		return foodName+" "+price;
	}
	public float getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return foodName;
	}
	
	public void setName(String foodName)
	{
	 this.foodName=foodName;	
	}
	
	
	
	public void setPrice(float price)
	{
	 this.price=price;	
	}
	
	

}
