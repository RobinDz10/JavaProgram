package edu.iu.c212.utils;

import edu.iu.c212.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FileUtils {
    private static File inputFile = new File("src/edu/iu/c212/resources/input.txt");
    private static File outputFile = new File("src/edu/iu/c212/resources/output.txt");
    private static File inventoryFile = new File("src/edu/iu/c212/resources/inventory.txt");
    private static File staffFile = new File("src/edu/iu/c212/resources/staff.txt");
    private static File staffAvailabilityFile = new File("src/edu/iu/c212/resources/staff_availability_IN.txt");
    private static File shiftSchedulesFile = new File("src/edu/iu/c212/resources/shift_schedules_IN.txt");
    private static File storeScheduleFile = new File("src/edu/iu/c212/resources/store_schedule_OUT.txt");

    public static List<Item> getItemsFromFile(){
        List<Item> inventoryList = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inventoryFile));
            String str = null;
            while((str = bufferedReader.readLine()) != null)
            {
                if(str.substring(0,2).equals("//")) continue;
                Item item = new Item(str.split(",")[0].split("'")[1],Double.valueOf(str.split(",")[1]),Integer.parseInt(str.split(",")[2]),Integer.parseInt(str.split(",")[3]));
                inventoryList.add(item);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return inventoryList;
    }

    public static List<Staff> getStaffFromFile(){
        List<Staff> employees = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(staffAvailabilityFile));
            String str = null;
            while((str = bufferedReader.readLine()) != null)
            {
                if(str.split(" ").length<5){
                    Staff staff = new Staff(str.split(" ")[0]+" "+str.split(" ")[1],Integer.parseInt(str.split(" ")[2]),str.split(" ")[3],null);
                    employees.add(staff);
                }else {
                    Staff staff = new Staff(str.split(" ")[0]+" "+str.split(" ")[1],Integer.parseInt(str.split(" ")[2]),str.split(" ")[3],str.split(" ")[4]);
                    employees.add(staff);
                }

            }
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return employees;
    }

    public static void saveItemsFromFile (List<Item> items){
        try {
            inventoryFile.deleteOnExit();
            if (!inventoryFile.isFile()) {
                inventoryFile.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(inventoryFile));
            boolean temp =true;
            for (Item item:items){
                if(temp){
                    writer.write(item.toString());
                    temp =false;
                }else writer.write("\n"+item.toString());
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void saveStaffFromFile (List<Staff> employees) {
        try {
            staffAvailabilityFile.deleteOnExit();
            if (!staffAvailabilityFile.isFile()) {
                staffAvailabilityFile.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(staffAvailabilityFile));
            writer.write(employees.get(0).toString());
            for (int i=1 ;i<employees.size();i++){
                writer.write("\n"+employees.get(i).toString());
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static List<String> readCommandsFromFile() throws IOException {
        List<String> inputFileList = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            String str = null;
            while((str = bufferedReader.readLine()) != null)
            {
                if(str.substring(0,2).equals("//")) continue;
                inputFileList.add(str);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return inputFileList;
    }

    public static List<String> readShiftFromFile() throws IOException {
        List<String> shiftList = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(shiftSchedulesFile));
            String str = null;
            while((str = bufferedReader.readLine()) != null)
            {
                shiftList.add(str);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return shiftList;
    }

    public static void writeStoreScheduleToFile(List<String> lines) {
        try {
            storeScheduleFile.delete();
            if (!storeScheduleFile.isFile()) {
                storeScheduleFile.createNewFile();
            }
            Calendar calendar = Calendar.getInstance();
            String year = String.valueOf(calendar.get(Calendar.YEAR));
            String month = String.valueOf(calendar.get(Calendar.MONTH)+1);
            String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
            String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
            if(Integer.valueOf(hour)<10) hour = "0"+hour;
            String minute = String.valueOf(calendar.get(Calendar.MINUTE));
            if(Integer.valueOf(minute)<10) minute = "0"+minute;
            FileWriter fw = new FileWriter(storeScheduleFile,true);
            PrintWriter writer = new PrintWriter(fw);
            writer.println("Created on "+day+"/"+month+"/"+year+" at "+hour+minute);
            for (String s:lines){
                 writer.println(s);
            }
            writer.close();
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void writeLineToOutputFile(String line) throws IOException {
        if (!outputFile.isFile()) {
            outputFile.createNewFile();
        }
        try {
            FileWriter fw = new FileWriter(outputFile,true);
            PrintWriter pw=new PrintWriter(fw);
            pw.println(line);
            pw.close() ;
            fw.close() ;
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
