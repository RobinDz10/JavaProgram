import java.util.ArrayList;
import java.util.Scanner;

public class ComputerScientistsMain {
	public static ComputerScientists[] makeList() {
		/* Create an array to store all the computer scientists */
		ComputerScientists[] persons = new ComputerScientists[5];
		
		/* Create Computer Scientist 1 */
		ComputerScientists person1 = new ComputerScientists();
		person1.setName("Annie Easley");
		person1.setArea("Artificial Intelligence");
		person1.setArea("Machine Learning");
		person1.setArea("Computer Vision");
		person1.setArea("Human cognition");
		person1.setContribution("Annie Easley is well known of her pioneering work in artificial intelligence. She contributed a lot of algorithms in AI area, including machine learning, computer vision, and human cognition.");
		persons[0] = person1;
		
		/* Create Computer Scientist 2 */
		ComputerScientists person2 = new ComputerScientists();
		person2.setName("Clarence Ellis");
		person2.setArea("Computer Graphics");
		person2.setArea("Game Development");
		person2.setArea("Rendering");
		person2.setArea("Game Engine Design");
		person2.setContribution("Clarence Ellis loves to develop computer games. He has a lot of contribution in computer graphics, especially on real time rendering. He also contributed in developing game engines, such as Unity and Unreal Engine.");
		persons[1] = person2;
		
		/* Create Computer Scientist 3 */
		ComputerScientists person3 = new ComputerScientists();
		person3.setName("Mark Dean");
		person3.setArea("Computer Graphics");
		person3.setArea("Game Development");
		person3.setArea("Computer Vision");
		person3.setContribution("Mark Dean is a wonderful computer scientist. He's really good at math and recognition. He has several contribution in computer vision and computer graphics.");
		persons[2] = person3;
		
		/* Create Computer Scientist 4 */
		ComputerScientists person4 = new ComputerScientists();
		person4.setName("Dorothy Jean Johnson Vaughan");
		person4.setArea("Computational Mathematics");
		person4.setArea("Programming Language Development");
		person4.setContribution("Dorothy Jean Johnson Vaughan is a great black female computer scientist who was focusing on computational mathematics and programming language development. She was working for NACA and NASA, built up the scientific computational team for NACA and NASA. She also contributed a lot of programming language principles.");
		persons[3] = person4;
		
		/* Create Computer Scientist 5 */
		ComputerScientists person5 = new ComputerScientists();
		person5.setName("John Henry Thompson");
		person5.setArea("Image processing");
		person5.setArea("Programming Language Development");
		person5.setArea("Computer Graphics");
		person5.setContribution("John Henry Tompson is a great black computer scientist who developed many products, including Lingo programming, incorporating different graphic formats to create multi-media content and application, combining computer programmming language with visual arts.");
		persons[4] = person5;
		
		return persons;
	}
	
	/* Method to check all the computer scientists who has same research area */
	public static ArrayList<String> personsInThisArea(String area, ComputerScientists[] persons){
		ArrayList<String> result = new ArrayList<String>();
		for(int i = 0; i < persons.length; i++) {
			ArrayList<String> personalResearchArea = persons[i].getArea();
			for(int j = 0; j < personalResearchArea.size(); j++) {
				if(area.equals(personalResearchArea.get(j)))
					result.add(persons[i].getName());
			}
		}
		return result;
	}
	
	/* Method to check all the computer scientists who has same contribution */
	public static ArrayList<String> personsHasThisContribution(String contribution, ComputerScientists[] persons){
		ArrayList<String> result = new ArrayList<String>();
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getContribution().contains(contribution)) {
				result.add(persons[i].getName());
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		/* Create a computer scientists object list */
		ComputerScientists[] allPersons = makeList();
		
		/* Display all computer scientists listed */
		for(int i = 0; i < allPersons.length; i++) {
			System.out.println("No. " + i + " computer scientist:");
			System.out.println("Name: " + allPersons[i].getName());
			System.out.println("Area: " + allPersons[i].getArea());
			System.out.println("Contribution: " + allPersons[i].getContribution());
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		
		/* Check all the computer scientists who has same research area */
		System.out.println("Please input the research area: ");
		String personsArea = sc.nextLine();
		System.out.println("The computer scientists who have same reseach area are: " + personsInThisArea(personsArea, allPersons));
		
		/* Check all the computer scientists who has same contribution */
		System.out.println("Please input the contribution: ");
		String personsContribution = sc.nextLine();
		System.out.println("The computer scientists who have similar contributions are: " + personsHasThisContribution(personsContribution, allPersons));
		
		sc.close();
	}
}
