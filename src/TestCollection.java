
import java.util.*;
import java.lang.*;
import java.io.*;
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}

