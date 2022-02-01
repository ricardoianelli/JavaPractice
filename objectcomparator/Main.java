package objectcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

	public static <T> boolean contains(List<T> list, T element)
	{
		for(T current: list) {
			if(current == null && element == null) return true;
			if(current == null || element == null) continue;
			if(ObjectComparator.compareObjects(current, element)) return true;
		}
		return false;
	}

	public static void testStrings() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains(list, "Tom");
		System.out.println(result);
	}
	
	public static void testEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		boolean result = Main.contains(list, new Employee(1002, "Harry", 70000));
		System.out.println(result);
	}
	
	public static void testManagers() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		boolean result = Main.contains(list, new Manager(1001, "Joe", 50000, 500));
		System.out.println(result);
		
	}

	public static void testCheckingAccount() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1001, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		boolean result = Main.contains(list, new CheckingAccount(1001, 25.00));
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		testStrings();
		testEmployees();
		testManagers();
		testCheckingAccount();
	}
}
