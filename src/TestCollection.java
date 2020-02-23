
import java.util.*;
import java.lang.*;
import java.io.*;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		List<List<Integer>> table = new ArrayList<List<Integer>>();
		for(int i=0;i<10;i++) {
			List<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<10;j++)
				row.add(i*j);
			table.add(row);
		}
		for(List<Integer> row : table)
			System.out.println(row);
	}
*/
		Btree tree = new Btree();
		new TestThread().testScenario_1();
}
}

class TestThread
{
	class Mytask implements Runnable
	{
		int x = 20;
		public void run()
		{
			long id = Thread.currentThread().getId();
			System.out.println("Mthread id "+ id + "running x=" + x);
		}
	}
	void testScenario_1()
	{
		Mytask m = new Mytask();
	
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				long id = Thread.currentThread().getId();
				System.out.println("Mthread id "+ id + "running with method local paramterized anonymous class");
				
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
	

}

