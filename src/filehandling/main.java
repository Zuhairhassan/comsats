package filehandling;

public class main {
	public static void main(String []arg)
	{
		Bclass b=new Bclass();
		try{
		b.checkunexcepted();
		}
		catch(Exception e)
		{
			System.out.println("donot put the zero no");
		}
		
		try{
		b.come();
		}
		catch(Exception e)
		{
			System.out.println("not enter the name1");
		}
	}

}
