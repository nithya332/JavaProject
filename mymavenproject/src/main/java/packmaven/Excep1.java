package packmaven;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=1000;
		int withdraw=2000;
		if(withdraw>balance) {
//			try
//			{
//				throw new MyException();
//			
//			}
//			catch (Exception e) {
//				System.out.println("Exception Handled");
//				
//			}
			try
			{
				throw new MyException("Insufficeintbalance");
			}
			catch (Exception e) {
				System.out.println("Exception Handled");
			
			}
		}
	}

}
