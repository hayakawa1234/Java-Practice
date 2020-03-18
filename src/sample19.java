import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class sample19 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(23);
		values.add(32);
		values.add(4);
		values.add(5);
		values.add(7);
		values.add(12);
		values.add(16);
		values.add(11);
		values.add(8);
		values.add(3);

		for(int i = 0; i < values.size(); i ++) {
			Integer value = values.get(i);
			value *= 2;
			System.out.println(value);
		}
	}
}
