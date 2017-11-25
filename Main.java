package by.http.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> bookList = new LinkedList<>();

		// List<String> bookList = new LinkedList<>();
		// addition to the LinkedList
		bookList.add("Java for Newcomers");
		bookList.add("Pride and Prejudice");
		bookList.add("Excel 2013");
		bookList.add("Gone with the Wind");
		bookList.add("English Advance Level");
		bookList.add("Anna Karenina");
		bookList.add("English-Russian Dictionary");
		bookList.add("Math for Children");
		bookList.add("Software Requirements");
		bookList.add("Manual Testing");

		System.out.println("This is my initial linkedlist of Books without sorting: ");
		System.out.println(bookList);
		System.out.println("");

		bookList.remove("Math for Children");

		System.out.println("This is my linkedlist of Books after 'Math for Children' is removed: ");
		System.out.println(bookList);
		System.out.println("");

		bookList.add(3, "Deutche Sprache");

		System.out.println("This is my linkedlist of Books after 'Deutche Sprache' is added at index 3: ");
		System.out.println(bookList);
		System.out.println("");

		// with the help of ListIterator run through the list and print all elements separately
		ListIterator<String> iterator = bookList.listIterator();
		System.out.println("This is my linkedlist of Books output with the help of 'ListIterator' interface:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("");

		Collections.sort(bookList);
		System.out.println("This is my linkedlist of Books with natural sorting of elements, i.e. ascending order:");
		System.out.println(bookList);
		System.out.println("");

		// no need to created new iterator each time, just use the right name (from previous iterator)
		iterator = bookList.listIterator();
		// 1st element is skipped
		iterator.next();
		// 2nd new element is added after 1st element
		iterator.add("Crimson petal and the white");

		System.out.println(
				"This is my linkedlist of Books after 'Crimson petal and the white' inserted after the 1st element:");
		System.out.println(bookList.toString());
		System.out.println("");
		// why the code below does not print the whole list from the very beginning (2 first books are missed)?
		// printing starts from 2nd position as in the code above iterator stopped at position 1 while adding "Crimson..."
		System.out.println(
				"This is my linkedlist of Books printed with the help of iterator (iterator was left at index 1 after 'Crimson...' inserted after the 1st element:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("");

		// ((LinkedList<String>) bookList).removeLast --- will be used if List is created at the beginning
		// for LinkedList one can use just: bookList.removeLast(); (as this is method of LinkedList)
		bookList.removeLast();
		System.out.println("This is my linkedlist of Books after the last element is removed:");
		System.out.println(bookList.toString());

		System.out.println("");

		// ((LinkedList<String>) bookList).addFirst --- will be used if List is created at the beginning
		// for LinkedList one can use just: bookList.addFirst(); (as this is method of LinkedList)
		bookList.addFirst("Dorian Grey");
		System.out.println("This is my linkedlist of Books after 'Dorian Grey' is added to the 1st position:");
		System.out.println(bookList.toString());

		System.out.println("");

		// ((LinkedList<String>) bookList).addLast --- will be used if List is created at the beginning
		// for LinkedList one can use just: bookList.addLast(); (as this is method of LinkedList)
		bookList.addLast("Atonement");
		System.out.println("This is my linkedlist of my Books after 'Atonement' is added to the last position:");
		System.out.println(bookList.toString());

		System.out.println("");

		// ((LinkedList<String>) bookList).removeFirst --- will be used if List is created at the beginning
		// for LinkedList one can use just: bookList.removeFirst(); (as this is method of LinkedList)
		bookList.removeFirst();
		System.out.println("This is my linkedlist of Books after the 1st element is removed");
		System.out.println(bookList.toString());

	}

}
