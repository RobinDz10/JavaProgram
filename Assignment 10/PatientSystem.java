import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;



/* Class Patient */
class Patient{
	private String name;
	private String birth;
	private String status = "sick";
	
	/* Constructor of Patient */
	public Patient(String name, String birth, String status){
		this.name = name;
		this.birth = birth;
		this.status = status;
	}
	
	/* Get the patient's name */
	public String getName() {
		return this.name;
	}
	
	/* Get the patient's first name */
	public String getFirstName() {
		String firstName = "";
		for(int i = 0; i < this.name.length(); i++) {
			if(this.name.charAt(i) != ' ') {
				firstName += this.name.charAt(i);
			}
			else
				break;
		}
		return firstName;
	}
	
	/* Get the patient's last name */
	public String getLastName() {
		String temp = "";
		for(int i = this.name.length() - 1; i >= 0; i--) {
			if(this.name.charAt(i) != ' ') {
				temp += this.name.charAt(i);
			}
			else
				break;
		}
		String lastName = "";
		for(int i = temp.length() - 1; i >= 0; i--) {
			lastName += temp.charAt(i);
		}
		return lastName;
	}
	
	/* Get the patient's birth year */
	public int getBornYear() {
		String str = "";
		for(int i = 6; i <= 9; i++) {
			str += this.birth.charAt(i);
		}
		return Integer.parseInt(str);
	}
	
	/* Get the patient's birth month */
	public int getBornMonth() {
		String str = "";
		for(int i = 0; i <= 1; i++) {
			str += this.birth.charAt(i);
		}
		return Integer.parseInt(str);
	}
	
	/* Get the patient's birth day */
	public int getBornDay() {
		String str = "";
		for(int i = 3; i <= 4; i++) {
			str += this.birth.charAt(i);
		}
		return Integer.parseInt(str);
	}
	
	/* Get the patient's birth */
	public String getBirth() {
		return this.birth;
	}
	
	/* Set the patient's status */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/* Get the patient's status */
	public String getStatus() {
		return this.status;
	}
	
	/* Get the patient's personal info */
	public String getInfo() {
		String str = "";
		str += this.name;
		str += " ";
		str += this.birth;
		str += " ";
		str += this.status;
		return str;
	}
}

public class PatientSystem {
	private static ArrayList<Patient> patientsInSystem = new ArrayList<Patient>();
	
	
	/* Construct birth date */
	public static String isBirthValid(int day, int month, int year) {
		// Correct birth format: MM/DD/YYYY
		// Check if the given birth is valid.
		if(year < 1922 || year >= 2022)
			return "Given day is not Valid";
		else {
			if(month <= 0 || month > 12)
				return "Given day is not Valid";
			else {
				if(month == 2) {
					if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
						if(day <= 0 || day > 29)
							return "Given day is not Valid";
					}
					else {
						if(day <= 0 || day > 28)
							return "Given day is not Valid";
					}
				}
				else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if(day <= 0 || day > 31)
						return "Given day is not Valid";
				}
				else {
					if(day <= 0 || day > 30)
						return "Given day is not Valid";
				}
			}
		}
		String birthDay = "", birthMonth = "", birthYear = "", birthDate = "";
		if(day < 10)
			birthDay += "0";
		birthDay += String.valueOf(day);
		if(month < 10)
			birthMonth += "0";
		birthMonth += String.valueOf(month);
		if(year < 10)
			birthYear += "0";
		if(year < 100)
			birthYear += "0";
		if(year < 1000)
			birthYear += "0";
		birthYear += String.valueOf(year);
		birthDate += birthMonth;
		birthDate += "/";
		birthDate += birthDay;
		birthDate += "/";
		birthDate += birthYear;
		return birthDate;
	}
	
	/* Add patient to the file */
	public static void addPatient(String name, String birth, String fileName) {
		// Add a new patient record to the file. 
		// if given birth is not valid, then patient will not be added into the file. 
		// Birth must save in a format of Month/Day/Year, in total length of 10, such 
		//		as “02/03/2022”, “11/12/2001”, “01/24/1998”, “12/01/1980” and so on.
		String[] str = {"recover", "sick"};
		Random rand = new Random();
		int pos = rand.nextInt(1);
		Patient newPatient = new Patient(name, birth, str[pos]);
		patientsInSystem.add(newPatient);
	}
	
	public static void deletePatient(String name, String fileName) {
		// Delete an existing patient record from the file 
		// can’t delete if the patient still sick. 
		// if there are two patients occur with the same name, and they are both not 
		//		sick, only delete the first one. Otherwise, delete the first patient who is not 
		//		sick. 
		boolean deleteStatus = false;
		for(int i = 0; i < patientsInSystem.size(); i++) {
			if((patientsInSystem.get(i).getName().equals(name)) && !(patientsInSystem.get(i).getStatus().equals("sick"))){
				patientsInSystem.remove(i);
				deleteStatus = true;
				break;
			}
		}
		if(deleteStatus == true) {
			System.out.println("Delete patient succeed!");
		}
		else {
			System.out.println("Delete patient failed!");
		}
	}
	
	public static void readPatientsFromFile(String fileName) throws FileNotFoundException {
		ArrayList<Patient> allPatients = new ArrayList<Patient>();
		File file = new File(fileName);
		Scanner in = new Scanner(file);
		while(in.hasNextLine()) {
			String str = in.nextLine();
			String name = "", firstName = "", lastName = "", birthDate = "", patientStatus = "";
			if(str.length() <= 10)
				continue;
			else {
				/* Search for first name */
				int pos = 0;
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) != ' ') {
						firstName += str.charAt(i);
					}
					else {
						pos = i + 1;
						break;
					}
				}
				/* Search for last name */
				for(int i = pos; i < str.length(); i++) {
					if(str.charAt(i) != ' ') {
						lastName += str.charAt(i);
					}
					else {
						pos = i + 1;
						break;
					}
				}
				/* Search for birth date */
				for(int i = pos; i < str.length(); i++) {
					if(str.charAt(i) != ' ') {
						birthDate += str.charAt(i);
					}
					else {
						pos = i + 1;
						break;
					}
				}
				/* Search for patient status */
				for(int i = pos; i < str.length(); i++) {
						patientStatus += str.charAt(i);
				}
				name += firstName;
				name += " ";
				name += lastName;
				Patient newPatient = new Patient(name, birthDate, patientStatus);
				allPatients.add(newPatient);
			}
		}
		patientsInSystem = allPatients;
		in.close();
	}
	
	/* Read the number of patients directly from the file */
	public static int countPatients(String status, String fileName) {
		// return numbers of sick patients or recovery patients in the file. 
		// if client given “” (empty string), then return the total number of patients.
		int count = 0;
		if(status.compareToIgnoreCase("recover") == 0) {
			for(int i = 0; i < patientsInSystem.size(); i++) {
				if(patientsInSystem.get(i).getStatus().equals("recover")) {
					count++;
				}
			}
		}
		else if(status.compareToIgnoreCase("sick") == 0) {
			for(int i = 0; i < patientsInSystem.size(); i++) {
				if(patientsInSystem.get(i).getStatus().equals("sick")) {
					count++;
				}
			}
		}
		return count;
	}
	
	/* Find the average age for all patients in the file */
	public static void averageAge(String fileName) throws FileNotFoundException {
		double sum = 0;
		for(int i = 0; i < patientsInSystem.size(); i++) {
			sum += (2022 - patientsInSystem.get(i).getBornYear());
		}
		double avg = sum / patientsInSystem.size();
		System.out.println("The average age of all patients in the file is: " + avg);
	}
	
	/* Modify file by sorting patients by age for all patients from young to old */
	public static void sortPatientsByAge(String fileName) {
		if(patientsInSystem.size() <= 0) {
			System.out.println("There is no patients in the system.");
		}
		else if(patientsInSystem.size() == 1) {
			Patient currPatient = patientsInSystem.get(0);
			currPatient.getInfo();
		}
		else {
			for(int i = 0; i < patientsInSystem.size() - 1; i++) {
				for(int j = i + 1; j < patientsInSystem.size(); j++) {
					int year1 = patientsInSystem.get(i).getBornYear(), month1 = patientsInSystem.get(i).getBornMonth(), day1 = patientsInSystem.get(i).getBornDay();
					int year2 = patientsInSystem.get(j).getBornYear(), month2 = patientsInSystem.get(j).getBornMonth(), day2 = patientsInSystem.get(j).getBornDay();
					if(year1 > year2) {
						continue;
					}
					else if(year1 < year2) {
						Patient temp1 = patientsInSystem.get(i);
						Patient temp2 = patientsInSystem.get(j);
						patientsInSystem.set(i, temp2);
						patientsInSystem.set(j, temp1);
					}
					else {
						if(month1 > month2) {
							continue;
						}
						else if(month1 < month2) {
							Patient temp1 = patientsInSystem.get(i);
							Patient temp2 = patientsInSystem.get(j);
							patientsInSystem.set(i, temp2);
							patientsInSystem.set(j, temp1);
						}
						else {
							if(day1 > day2) {
								continue;
							}
							else if(day1 < day2) {
								Patient temp1 = patientsInSystem.get(i);
								Patient temp2 = patientsInSystem.get(j);
								patientsInSystem.set(i, temp2);
								patientsInSystem.set(j, temp1);
							}
							else {
								continue;
							}
						}
					}
				}
			}
		}
	}
	
	/* Modify file by sorting patients by first name or last name for all patients from a~z  */
	public static void sortPatientsByName(String firstOrLast, String fileName) throws FileNotFoundException {
		if(patientsInSystem.size() <= 1)
			return;
		if(firstOrLast.compareToIgnoreCase("first") == 0) {
			for(int i = 0; i < patientsInSystem.size() - 1; i++) {
				for(int j = i + 1; j < patientsInSystem.size(); j++) {
					String firstName1 = patientsInSystem.get(i).getFirstName();
					String firstName2 = patientsInSystem.get(j).getFirstName();
					if(firstName1.compareToIgnoreCase(firstName2) > 0) {
						Patient temp1 = patientsInSystem.get(i);
						Patient temp2 = patientsInSystem.get(j);
						patientsInSystem.set(i, temp2);
						patientsInSystem.set(j, temp1);
					}
				}
			}
		}
		else if(firstOrLast.compareToIgnoreCase("last") == 0) {
			for(int i = 0; i < patientsInSystem.size() - 1; i++) {
				for(int j = i + 1; j < patientsInSystem.size(); j++) {
					String lastName1 = patientsInSystem.get(i).getLastName();
					String lastName2 = patientsInSystem.get(j).getLastName();
					if(lastName1.compareToIgnoreCase(lastName2) > 0) {
						Patient temp1 = patientsInSystem.get(i);
						Patient temp2 = patientsInSystem.get(j);
						patientsInSystem.set(i, temp2);
						patientsInSystem.set(j, temp1);
					}
				}
			}
		}
		else {
			System.out.println("Invalid sorting type!");
		}
	}
	
	/* Shuffle the patients in a random order */
	public static void shufflePatients(String fileName) {
		// modify file by shuffle all patients, so they are not in any order 
		// Using random in this method is required.
		Random rand = new Random();
		if(patientsInSystem.size() <= 1)
			return;
		for(int i = 0; i < patientsInSystem.size(); i++) {
			int pos = rand.nextInt(patientsInSystem.size() - 1);
			Patient temp1 = patientsInSystem.get(i);
			Patient temp2 = patientsInSystem.get(pos);
			patientsInSystem.set(i, temp2);
			patientsInSystem.set(pos, temp1);
		}
	}
	
	/* Re-write the original file after any modification made on the original file */
	public static void rewriteFileAndDisplay(String filename) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(filename);
		for(int i = 0; i < patientsInSystem.size(); i++) {
			String line = patientsInSystem.get(i).getInfo();
			writer.println(line);
		}
		writer.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Welcome to the patient file system!");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		while(true) {
			System.out.println("Please select the option (enter the option number from 1 to 8):");
			System.out.println("1. Add a patient to the file.");
			System.out.println("2. Delete a patient record.");
			System.out.println("3. Count the total number of sick and recovered patients.");
			System.out.println("4. Find average age for all patients.");
			System.out.println("5. Sort patients by age.");
			System.out.println("6. Sort patients by first name or last name.");
			System.out.println("7. Shuffle patients.");
			System.out.println("8. Exit.");
			String option1 = sc1.nextLine();
			/* Condition 1: add a patient to the file */
			if(option1.equals("1")) {
				System.out.println("Please enter the patient's name:");
				String name = sc2.nextLine();
				System.out.println("Please enter the file name:");
				String filename = sc2.nextLine();
				System.out.println("Please enter the patient's born year (YYYY):");
				int bornYear = sc3.nextInt();
				System.out.println("Please enter the patient's born month (MM):");
				int bornMonth = sc3.nextInt();
				System.out.println("Please enter the patient's born day (DD):");
				int bornDay = sc3.nextInt();
				try {
					if(!isBirthValid(bornDay, bornMonth, bornYear).equals("Given day is not Valid")) {
						readPatientsFromFile(filename);
						addPatient(name, isBirthValid(bornDay, bornMonth, bornYear), filename);
						rewriteFileAndDisplay(filename);
					}
					else {
						System.out.println("Add patient failed! Invalid birthdate");
					}
				}
				catch(IOException e) {
					System.out.println("No such file found!");
				}
			}
			
			/* Condition 2: delete a patient from the file */
			else if(option1.equals("2")) {
				System.out.println("Please enter the patient's name:");
				String name = sc2.nextLine();
				System.out.println("Please enter the file name:");
				String filename = sc2.nextLine();
				try {
					readPatientsFromFile(filename);
					deletePatient(name, filename);
					rewriteFileAndDisplay(filename);
				} catch (IOException e) {
					System.out.println("No such file found!");
				}
			}
			
			/* Condition 3: Count the total number of sick and recovered patients */
			else if(option1.equals("3")) {
				System.out.println("Please enter the status of the patients:");
				String patientsStatus = sc2.nextLine();
				System.out.println("Please enter the file name:");
				String filename = sc2.nextLine();
				try {
					readPatientsFromFile(filename);
					if(patientsStatus.equals("recover")) {
						System.out.println("The total number of recovered patients is: " + countPatients(patientsStatus, filename));
					}
					else if(patientsStatus.equals("sick")) {
						System.out.println("The total number of sick patients is: " + countPatients(patientsStatus, filename));
					}
					else {
						System.out.println("Invalid status type!");
					}
				}
				catch(FileNotFoundException e) {
					System.out.println("No such file found!");
				}
			}
			
			/* Condition 4: Find average age for all patients */
			else if(option1.equals("4")) {
				System.out.println("Please enter the file name:");
				String filename = sc2.nextLine();
				try {
					readPatientsFromFile(filename);
					averageAge(filename);
				}
				catch(FileNotFoundException e) {
					System.out.println("No such file found!");
				}
			}
			
			/* Condition 5: Sort patients by age */
			else if(option1.equals("5")) {
				System.out.println("Please enter the file name:");
				String filename = sc2.nextLine();
				try {
					readPatientsFromFile(filename);
					sortPatientsByAge(filename);
					rewriteFileAndDisplay(filename);
				}
				catch(FileNotFoundException e) {
					System.out.println("No such file found!");
				}
			}
			
			/* Condition 6: Sort patients by first name or last name */
			else if(option1.equals("6")) {
				System.out.println("Please enter the sorting order (First/Last) (Case ignored):");
				String order = sc2.nextLine();
				System.out.println("Please enter the file name:");
				String filename = sc2.nextLine();
				try {
					readPatientsFromFile(filename);
					sortPatientsByName(order, filename);
					rewriteFileAndDisplay(filename);
				}
				catch(FileNotFoundException e) {
					System.out.println("No such file found!");
				}
			}
			
			/* Condition 7: Shuffle patients */
			else if(option1.equals("7")) {
				System.out.println("Please enter the file name:");
				String filename = sc2.next();
				try {
					readPatientsFromFile(filename);
					shufflePatients(filename);
				}
				catch(FileNotFoundException e) {
					System.out.println("No such file found!");
				}
			}
			
			/* Condition 8: Exit program */
			else if(option1.equals("8")) {
				System.out.println("Goodbye!");
				break;
			}
			/* Hidden test option, used for printing out all patients */
//			else if(option1.equals("123")) {
//				try {
//					readPatientsFromFile("patients.txt");
//					for(int i = 0; i < patientsInSystem.size(); i++) {
//						Patient iP = patientsInSystem.get(i);
//						System.out.println(iP.getBirth() + "\t" + iP.getBornDay() + "\t" + iP.getBornMonth() + "\t" + iP.getBornYear());
//						System.out.println(iP.getName() + "\t[" + iP.getFirstName() +"]\t[" + iP.getLastName() + "]");
//						System.out.println(iP.getStatus());
//						System.out.println();
//					}
//				}
//				catch(FileNotFoundException e) {
//					System.out.println("err");
//				}
//			}
			
			/* Other conditions: Invalid option */
			else {
				System.out.println("Invalid option!");
			}
		}
		sc1.close();
		sc2.close();
		sc3.close();
	}
}
