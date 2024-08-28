import java.util.Scanner;


public class IT24101082Lab5Q3 {

public static void main(String []args){
	 final double THREE_TO_FOUR_DAY_DISCOUNT = 10;
	 final double FIVE_DAY_ONWARD_DISCOUNT =20;
	 final double ROOM_CHARGE = 48000.00;



	 
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter start date (1-31): ");
	int sdate = scanner.nextInt();
	if(sdate <=0 || sdate >31){
		System.out.print("Days must be between 1 and 31");
		System.exit(1);
	}
	
	System.out.print("Enter end date (1-31): ");
	int edate = scanner.nextInt();
	if(edate <=0 || edate >31){
		System.out.print("Days must be between 1 and 31");
		System.exit(1);
	}
	
	if(sdate > edate){
		System.out.print("Start Date must be less than End Date");
		System.exit(1);
	}
	
	int dateReserved = edate - sdate;
	double amount = ROOM_CHARGE * dateReserved;
	System.out.println("Room Charge Per Day: Rs."+ ROOM_CHARGE + "/=");
	System.out.println("Number of Days Reserved: "+ dateReserved);

	if((dateReserved >=3) && (dateReserved <=4)){
		amount -= amount *(THREE_TO_FOUR_DAY_DISCOUNT/100);

	}else if (dateReserved >=5){
		amount -= amount *(FIVE_DAY_ONWARD_DISCOUNT/100);
	}else {
		amount -= 0;
	}


	System.out.println("Total Amount to be paid: "+ amount);
	
	
}



}
