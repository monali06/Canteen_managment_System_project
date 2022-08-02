package canteen_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {
	
	ArrayList<Food> foodList=new ArrayList<>();
	ArrayList<GuestsOrder> guestEatList=new ArrayList<>();
	Food food;
	//public GuestsOrder guestsOrder;
	public int selectFood;
	
	public ManageFood()
	{
		
	}
	Scanner scan=new Scanner(System.in);
	
	public void scan()
	{
		System.out.println("Enter number of food item in menu: ");
		 int n=Integer.parseInt(scan.nextLine());
		 for(int i = 0; i <n; i++)
		 {
			 Food food=new Food(null, 0);
			 food.foodInput();
			 foodList.add(food);
			  }
	}
	
	public void print() {
		for(int i=0; i< foodList.size(); i++) {
			System.out.println((i+1)+"."+foodList.get(i).detail());
		}
	}
	
	public void price()
	{
		float priceFood=0;
		float totalPayment=0;
		int number;
		GuestsOrder guest= new GuestsOrder();
		guest.tableInput();
		guestEatList.add(guest);
		
		for(int i=0; i<10; i++)
		{
			System.out.println("select food "+(i+1));
		     selectFood= scan.nextInt();
		     if(selectFood==0)
		     {
		    	 guest.setTotalPayment(totalPayment);
		    	 System.out.println("Total Payment: ");
		    	 System.out.println(totalPayment);
		    	 System.out.println("Thank you, see you again");
		    	 break;
		    }else {
		    	System.out.println("Enter number: ");
		    	number=scan.nextInt();
		    	Food food=foodList.get(selectFood-1);
		    	guest.setEatList(food);
		    	priceFood=food.price*number;
		    }
			totalPayment+=priceFood;
			System.out.println("order finish");
			System.out.println("Payment "+(i+1)+"is: ");
			System.out.println(" "+priceFood);
			System.out.println("Finish Order enter 0 ");
		}
	}
	public void printOrder() {
		for(int i=0; i< guestEatList.size();i++) {
			guestEatList.get(i).print();
		}
	}
	public void search() {
		 Scanner scanner=new Scanner(System.in);
		 String idtable;
		 int up=0;
		 System.out.println("Enter table number payment: ");
		 idtable=scanner.nextLine();
		 for(int i=0; i< guestEatList.size();i++) {
			 if(guestEatList.get(i).getIdTable().equalsIgnoreCase(idtable))
			 {
				 guestEatList.get(i).print();
				 up++;
			 }
		 }
			 
		 if(up==0)
		 {
			 System.out.println("No table number is present "+idtable);
		 }
	 }
	public String editName() {
		System.out.println("Enter name edit ");
		return scan.nextLine();
	}
	public float editPrice() {
		System.out.println("Enter price edit ");
		return scan.nextFloat();
	}
	public void editFood() {
		String nameFood;
		int up=0;
		System.out.println("Enter food name to fix ");
		nameFood=scan.nextLine();
		for(int i=0; i< foodList.size(); i++) {
			if(foodList.get(i).getName().equals(nameFood)) {
			up++;
			foodList.get(i).setName(editName());
			foodList.get(i).setPrice(editPrice());
			break;
			}
		}if(up==0) {
			System.out.println("no food name is "+nameFood);
		}
	}
	public void deleteFood() {
		String deleteFood;
		int up=0;
		System.out.println("Enter name food to delete");
		deleteFood=scan.nextLine();
		for(int i=0; i< foodList.size(); i++) {
			if(foodList.get(i).getName().equals(deleteFood)) {
			up++;
			foodList.remove(i);
			System.out.println("delete finish");
			break;
			}
		}if(up==0) {
			System.out.println("no food name is there "+deleteFood);
		}
	}
  
}
