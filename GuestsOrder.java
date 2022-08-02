package canteen_management_system;

import java.util.ArrayList;
import java.util.Scanner;


public class GuestsOrder {
	 public String idTable;
	 
	 ArrayList<Food> eatList=new ArrayList<>();
	 public float totalPayment;
	 
	 public String getIdTable()
	 {
		 return idTable;
	 }
	 public void setEatList(Food food)
	 {
		 eatList.add(food);
	 }
	 
	 
	 public void setTotalPayment(float totalPayment)
	 {
		 this.totalPayment= totalPayment;
	 }
	 
	 public void tableInput()
	 {
		    Scanner scanner = new Scanner(System.in);
			System.out.println("table number: ");
			 idTable=scanner.nextLine();
		
		 
	}
	 
	 public void print()
	 {
		 System.out.println("---------------------------------------------");
		 System.out.println("table number: "+this.idTable+" Total payment: "+this.totalPayment);
		 for(Food m:this.eatList)
		 {
			 System.out.println("selected food is "+m.foodName);	 
	     }
		 System.out.println();
	 }
	 

}
