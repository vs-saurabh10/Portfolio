import java.util.Scanner;

public class MainClass
{
	public static void main(String []args)
	{
		AtmOperationInterf op = new AtmOperationImpl();
		int atmnumber = 12345;
		int atmpin = 123;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!");
		System.out.print("Please Enter Atm Number : ");
		int atmNumber = in.nextInt();
		System.out.print("Please Enter Atm Pin : ");
		int pin = in.nextInt();

		if((atmnumber==atmNumber)&&(atmpin==pin))
		{
			while(true)
			{
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter Choice : ");
				int ch = in.nextInt();
				if (ch==1) {
					op.viewBalance();
					
				}
				else if (ch==2) {
					System.out.println("Enter amount to withdraw : ");
					double withdrawAmount = in.nextDouble();
					op.withdrawAmount(withdrawAmount);

				}
				else if (ch==3) {
					System.out.println("Enter amount to Deposit : ");
					double depositAmount = in.nextDouble();//5000
					op.depositAmount(depositAmount);

					
				}
				else if (ch==4) {
					op.viewMiniStatement();
					
				}
				else if (ch==5){
					System.out.println("Collect your ATM Card...\nThank you for using ATM Machine");
					System.exit(0);	
				}
				else{
					System.out.println("Please Enter Valid Choice !");
				}
			}
		}
		else
		{
			System.out.println("Incorrect Atm Number OR Pin");
			System.exit(0);
		}
	}
}