package filehandling;
import java.util.*;
import java.io.*;

public class Bclass extends Aclass{
	public void come()
	{
  Scanner dal=new Scanner(System.in);
  System.out.println("enter the first no");
  int fno=dal.nextInt();
  System.out.println("enter the second no");
  int seno=dal.nextInt();
  int sum=fno+seno;
  System.out.println(sum);
  
	}

}
