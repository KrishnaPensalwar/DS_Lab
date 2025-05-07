import java.util.*;

public class TokenRing{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes in ring.");
		int n;
		n = sc.nextInt();

		int ch =0;

		do{
			System.out.print("Enter sender : ");
			int sender;
			sender = sc.nextInt();
			
			System.out.print("Enter receiver: ");
			int receiver= sc.nextInt();
			
			System.out.print("Enter data: ");
			int data= sc.nextInt();
			
			int token =0;

			System.out.println("Token passing from .");
			for(int i=token ; i<sender;i++){
				System.out.print(" "+ i +" -> ");		
			}

			System.out.println(" " + sender);

			System.out.println("Sender " + sender + " is sending data  : " +data);

			for(int i=sender;i!=receiver;i = (i+1) %n ){
				System.out.println("Data forwarded by " + i);
			}
			System.out.println("Receiver " + receiver + " received the data.");


			token = sender;

			System.out.print("Do you want to send data again . \n 1.Yes  \n 0. No");

			ch = sc.nextInt();


			
			
		}while(ch==1);
	}
}
