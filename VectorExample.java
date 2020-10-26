import java.util.*;
public class VectorExample {
	public static void main(String [] args) {
		/* We create an empty vecotr with initial capacity 4 */
		Vector<String> vec = new Vector<String>(4);
		/* Adding elements to a vector */
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		/* Check the size of all the capacity */
		System.out.println("Size is:" +vec.size());
		System.out.println("Default capacity is:" + vec.capacity());
		/* Displaying all the vector elements */
		System.out.println("Vector element is:" + vec);
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		/* Again check size and capacity affter two insertions */
		System.out.println("Size after addition:" +vec.size());
		System.out.println("Capacity after addition is: "+vec.capacity());
		/* Display Vector elements again */
		System.out.println("Elements are:"+vec);
		/* Checking if Tiger is present or not in this vetor */
		if (vec.contains("Tiger")) {
			System.out.println("Tiger is present or not in index" +vec.indexOf("Tiger"));
		}
		else {
			System.out.println("Tiger is not present in the list");
		}
		/* Get the first element */
		System.out.println("The first animal of the vector is ="+vec.firstElement());
		/* Get the last element */
        System.out.println("The Last animal of the vector is =" +vec.lastElement());
	}
}

