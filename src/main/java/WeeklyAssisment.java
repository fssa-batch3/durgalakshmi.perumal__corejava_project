

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class WeeklyAssisment {





	
	static String departwiseSortedPrinting(List<String> departNameList) {
		//Write your code Here
	
		StringBuilder Sb = new StringBuilder("");
		Map<String, TreeSet<String>> deptName= new TreeMap<String,TreeSet<String>>(); 
		if(departNameList == null) {
			return "";
		}
		else {
			
			
			for(String Str:departNameList) {
				String[] values = Str.split(",");
				
				
				if(deptName.containsKey(values[0])) {
					Set<String> empName = deptName.get(values[0]);
					empName.add(values[1]);
				}
				
				else {
					TreeSet<String> empName = new TreeSet<String>();
					empName.add(values[1]);
					deptName.put(values[0],empName);
				}
				
			}
		}
		
		
		Set<String> deptKey = deptName.keySet();
		
		for(String dept:deptKey) {
			Sb.append(dept);
			Sb.append(":");
			Sb.append(deptName.get(dept));
			Sb.append("\n");
		}
		return Sb.toString();
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numOfLines = sc.nextInt();
	    sc.nextLine();
	    List<String> inputLines = new ArrayList<String>(numOfLines);

	    for (int i = 0; i < numOfLines; i++) {
	        inputLines.add(sc.nextLine());
	    }

	    sc.close();
	    System.out.println(departwiseSortedPrinting(inputLines));
	}

}