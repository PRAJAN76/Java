import java.util.Scanner;
class Electricity_bill{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the type of EB connection:");
		String type_of = input.nextLine();
		String a = type_of.toLowerCase();
		System.out.println("enter the units: ");
		int u = input.nextInt();
		switch (a){
			case ("domestic"):
				if (u<=100){
					System.out.println("total amount: " + u*1);
				}
				else if(u>=101&&u<=200){
					System.out.println("total amount: " + u*2.50);
				}
				else if(u>=201&&u<=500){
					System.out.println("total amount:" + u*4);
				}
				else{
					System.out.println("total amount: "+ u*6);
				}
				break;
			case("commercial"):
				if(u<=100){
					System.out.println("total amount: "+u*2);
				}
				else if(u>=101&&u<=200){
					System.out.println("total amount: " + u*4.50);
				}
				else if(u>=201&&u<=500){
					System.out.println("total amount:" + u*6);
				}
				else{
					System.out.println("total amount: "+ u*7);
				}
					
		}
	}
}