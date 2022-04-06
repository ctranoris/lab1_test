package gr.upatras.lab1;

/**
 * @author ctranoris
 *
 */
public class MyLab {

	public static void main(String[] args) {

		PersonLab p = new PersonLab();
		p.setFirstName("TestA");
		System.out.println("hello " + p.getFirstName());

		for (int i = 0; i < 3; i++) {
			printMyPerson(i);
			

		}

	}

	/**
	 * My method
	 * @param i
	 */
	private static void printMyPerson(int i) {
		String newName = "Person_" + i;
		PersonLab myPerson = new PersonLab();
		myPerson.setFirstName(newName);
		System.out.println("hello " + myPerson.getFirstName());
		
	}

}
