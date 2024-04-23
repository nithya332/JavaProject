package packmaven;

public class Addition {

	public static void main(String[] args) {
		try
		{
			int v=100/0;
			System.out.println(v);
		}
		catch (Exception e) {
			System.out.println("Exception handled" +e);
		}
		
		// TODO Auto-generated method stub

	
	finally {
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
 System.out.println("rest of statement");
	}
}

