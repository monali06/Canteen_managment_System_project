package canteen_management_system;

//import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ArrayList<Food>foodList =new ArrayList<>();
     ManageFood managefood= new ManageFood();
     int select;
     Scanner scan= new Scanner(System.in);
     do {
    	 mainMenu();
    	 select=Integer.parseInt(scan.nextLine());
    	 switch(select) {
    	 case 1:do {
        	 menuManageFood();
        	 select=Integer.parseInt(scan.nextLine());
        	 switch(select) {
        	 case 1:
        		 managefood.scan();
        		 break;
        	 case 2:
        		 managefood.print();
        		 managefood.editFood();
        		 break;
        	 case 3:
        		 managefood.print();
        		 break; 
        	 case 4:
        		 managefood.print();
        		 managefood.deleteFood();
        		 break;
        	 case 5:
        		 managefood.printOrder();
        		 break;
        	 case 6:
        		 managefood.search();
        		 break;
        	 case 0:
        		 System.out.println("Back");
        		 break;
        	 default:
        		 break;
             }
         }while(select !=0);
    		 break;
    	 case 2:
    		 do {
            	 menuOrder();
            	 select=Integer.parseInt(scan.nextLine());
            	 switch(select) {
            	 case 1:
            		 managefood.print();
            		 managefood.price();
            		 break;
            	 case 0:
            		 System.out.println("Back");
            		 break;
            	 default:
            		 break;
                 }
             }while(select !=0);
        		 break;
    	 case 3:
    		 System.exit(select);
    		 break;
    		
    	 default:
    		 break;
    	
    	 }
     }while(select !=3);
	}
	
	static void menuManageFood(){
	   	 System.out.println("---------**MENU MANAGE FOOD**-----------");
	   	 System.out.println("0.BACK to main menu");
	   	 System.out.println("1.Add food");
	   	 System.out.println("2.Edit food");
	   	System.out.println("3.show food list");
	   	 System.out.println("4.delete food");
	   	 System.out.println("5.print info table order");
	   	 System.out.println("6.payment");
	   	 System.out.println("----------------------------------");
	   	System.out.println("Select option: ");
	}
	
	static void menuOrder(){
   	 System.out.println("---------**MENU ORDER**-----------");
   	 System.out.println("0.BACK to main menu");
   	 System.out.println("1.Print Menu food and order");
   	 System.out.println("----------------------------");
   	 System.out.println("Select option: ");
	}
   	 
     static void mainMenu(){
    	 System.out.println("---------**MAIN MENU**-----------");
    	 System.out.println("1.Manage food");
    	 System.out.println("2.Manage Order");
    	 System.out.println("3.Exit");
     
    
	}

}
