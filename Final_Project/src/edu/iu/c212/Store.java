package edu.iu.c212;

import edu.iu.c212.models.Item;
import edu.iu.c212.models.Staff;
import edu.iu.c212.programs.StoreMapDisplay;
import edu.iu.c212.utils.FileUtils;

import java.io.*;
import java.util.*;

public class Store implements IStore {
    public List<Item> itemList = new ArrayList<>();
    public List<Staff> employees = new ArrayList<>();
    public List<String> inputFileList = new ArrayList<>();
    public List<String> outputList = new ArrayList<>();
    public Map<String,String> hireMap = new HashMap<String,String>();


    @Override
    public List<Item> getItemsFromFile() {
        return FileUtils.getItemsFromFile();
    }

    @Override
    public List<Staff> getStaffFromFile() {
        return FileUtils.getStaffFromFile();
    }

    @Override
    public void saveItemsFromFile(List<Item> itemList) {
        FileUtils.saveItemsFromFile(itemList);
    }

    @Override
    public void saveStaffFromFile(List<Staff> staffList) {
        FileUtils.saveStaffFromFile(staffList);
    }

    @Override
    public void takeAction(String command) throws IOException {
        String itemName;
        int itemCost;
        int itemQuantity;
        int itemAisle;

        String staffName;
        int age;
        String role;
        String availability;
        switch (command.substring(0,3)){
            case "EXI":
                System.out.print("Press enter to continue...");
                Scanner in = new Scanner(System.in);
                while (true){
                    if(in.nextLine().equals("")) {
                        FileUtils.writeLineToOutputFile("Thank you for visiting High's Hardware and Gardening!");
                        saveItemsFromFile(itemList);
                        saveStaffFromFile(employees);
                        System.exit(0);
                    }
                }
            case "ADD":
                itemName = command.split("'")[1];
                itemCost = Integer.parseInt(command.split("'")[2].substring(1).split(" ")[0]);
                itemQuantity = Integer.parseInt(command.split("'")[2].substring(1).split(" ")[1]);
                itemAisle = Integer.parseInt(command.split("'")[2].substring(1).split(" ")[2]);
                Item item = new Item(itemName,itemCost,itemQuantity,itemAisle);
                itemList.add(item);
                FileUtils.writeLineToOutputFile(itemName+" was added to inventory");
                break;
            case "COS":
                itemName = command.split("'")[1];
                for (Item item1 : itemList){
                    if(item1.getName().equals(itemName)){
                        itemCost = (int)item1.getPrice();
                        FileUtils.writeLineToOutputFile(itemName+": $"+itemCost);
                        break;
                    }
                }
                break;
            case "FIN":
                boolean temp3 = false;
                itemName = command.split("'")[1];
                for (Item item1 : itemList){
                    if(item1.getName().equals(itemName)){
                        StoreMapDisplay.display(item1);
                        temp3 = true;
                        FileUtils.writeLineToOutputFile("Performing store lookup for "+itemName);
                        break;
                    }
                }
                if(!temp3) FileUtils.writeLineToOutputFile("ERROR: "+itemName+" cannot be found");
                break;
            case "FIR":
                boolean temp = false;
                staffName = command.split("'")[1];
                for(Staff staff : employees){
                    if(staff.getFullName().equals(staffName)){
                        employees.remove(staff);
                        FileUtils.writeLineToOutputFile(staffName+" was fired");
                        temp = true;
                        break;
                    }
                }
                if(!temp) FileUtils.writeLineToOutputFile("ERROR: "+staffName+" cannot be found");
                break;
            case "HIR":
                staffName = command.split("'")[1];
                age = Integer.valueOf(command.split("'")[2].substring(1).split(" ")[0]);
                role = command.split("'")[2].substring(1).split(" ")[1];
                if(command.split("'")[2].substring(1).split(" ").length<3){
                    Staff staff = new Staff(staffName,age,role,null);
                    employees.add(staff);
                }else {
                    availability = command.split("'")[2].substring(1).split(" ")[2];
                    Staff staff = new Staff(staffName,age,role,availability);
                    employees.add(staff);
                }
                FileUtils.writeLineToOutputFile(staffName+" has been hired as a "+hireMap.get(role));
                break;
            case "PRO":
                staffName = command.split("'")[1];
                role = command.split("'")[2].substring(1);
                for(Staff staff1 : employees){
                    if(staff1.getFullName().equals(staffName)){
                        staff1.setRole(role);
                        FileUtils.writeLineToOutputFile(staffName+" was promoted to "+hireMap.get(role));
                        break;
                    }
                }
                break;
            case "SAW":
                for (Item item1 : itemList){
                    if(item1.getName().length()<=5) continue;
                    if(item1.getName().substring(0,5).equals("Plank")){
                        SawPrimePlanks sawPrimePlanks = new SawPrimePlanks();
                        int longPlank = Integer.valueOf(item1.getName().split("-")[1]);
                        List<Integer> planks = sawPrimePlanks.getPlankLengths(longPlank);
                        String plankName = "Plank-";
                        plankName = plankName+planks.get(planks.size()-1);
                        int plankQuan = 1;
                        for (int i=0 ;i<planks.size()-1;i++){
                            plankQuan = plankQuan*planks.get(i);
                        }
                        item1.setName(plankName);
                        item1.setPrice(planks.get(planks.size()-1)*planks.get(planks.size()-1));
                        item1.setQuantity(item1.getQuantity()*plankQuan);
                        break;
                    }
                }
                FileUtils.writeLineToOutputFile("Planks sawed.");
                break;
            case "SCH":
                StaffScheduler staffScheduler = new StaffScheduler();
                staffScheduler.scheduleStaff();
                FileUtils.writeLineToOutputFile("Schedule created.");
                break;
            case "SEL":
                itemName = command.split("'")[1];
                itemQuantity = Integer.parseInt(command.split("'")[2].substring(1));
                boolean temp1 = false;
                for (Item item1 : itemList){
                    if(item1.getName().equals(itemName)){
                        if(item1.getQuantity() >= itemQuantity){
                            item1.setQuantity(item1.getQuantity()-itemQuantity);
                            FileUtils.writeLineToOutputFile(itemQuantity+" "+itemName+" was sold");
                            temp1 = true;
                            break;
                        }
                    }
                }
                if(!temp1) FileUtils.writeLineToOutputFile("ERROR: "+itemName+" could not be sold");
                break;
            case "QUA":
                itemName = command.split("'")[1];
                boolean temp2 = false;
                for (Item item1 : itemList){
                    if(item1.getName().equals(itemName)){
                        itemQuantity = item1.getQuantity();
                        FileUtils.writeLineToOutputFile(String.valueOf(itemQuantity));
                        temp2 = true;
                        break;
                    }
                }
                if(!temp2) FileUtils.writeLineToOutputFile("ERROR: "+itemName+" cannot be found");
                break;
        }
        saveItemsFromFile(itemList);
        saveStaffFromFile(employees);
    }

    public Store(){
        itemList = getItemsFromFile();
        employees = getStaffFromFile();
        hireMap.put("M","Manager");
        hireMap.put("C","Cashier");
        hireMap.put("G","Gardening Expert");
        try {
            inputFileList = FileUtils.readCommandsFromFile();
            for (String s : inputFileList){
                takeAction(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
