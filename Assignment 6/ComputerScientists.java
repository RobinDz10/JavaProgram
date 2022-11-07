import java.util.ArrayList;

public class ComputerScientists {
	private String name;						// Name of the scientist
	private ArrayList<String> researchAreas;	// Research areas of the scientist
	private String majorContribution;			// Contribution of the scientist

	/* Computer scientists constructor */
	public ComputerScientists() {
		name = "";
		researchAreas = new ArrayList<String>();
		majorContribution = "";
	}
	
	/* Get the name of the computer scientist object */
	public String getName() {
		return name;
	}
	
	/* Set the name of the computer scientist object */
	public void setName(String scientistName) {
		name = scientistName;
	}
	
	/* Get the research areas of the computer scientist object */
	public ArrayList<String> getArea() {
		return researchAreas;
	}
	
	/* Set the research areas of the computer scientist object */
	public void setArea(String area) {
		researchAreas.add(area);
	}
	
	/* Get the contribution of the computer scientist object */
	public String getContribution(){
		return majorContribution;
	}
	
	/* Set the contribution of the computer scientist object */
	public void setContribution(String contribution) {
		majorContribution = contribution;
	}
}