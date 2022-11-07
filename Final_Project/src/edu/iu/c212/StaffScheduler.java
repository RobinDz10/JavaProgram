package edu.iu.c212;

import edu.iu.c212.models.Staff;
import edu.iu.c212.utils.FileUtils;

import java.io.IOException;
import java.util.*;

public class StaffScheduler {

    public void scheduleStaff() throws IOException {
        List<Staff> staffList = FileUtils.getStaffFromFile();
        List<String> shiftList = FileUtils.readShiftFromFile();
        int hours = 0;
        int minnum = 100;
        Map<String,List<Staff>> dayStaff = new TreeMap<>();
        for(String s : shiftList){
            hours += (Integer.valueOf(s.split(" ")[2].substring(0,2))-Integer.valueOf(s.split(" ")[1].substring(0,2)));
            List<Staff> oneDay = new ArrayList<>();
            for(Staff staff : staffList){
                String[] strings = staff.getAvailability().split("\\.");
                for(String s1 : strings){
                    if(s1.equals(s.split(" ")[0])){
                        oneDay.add(staff);
                        break;
                    }
                }
            }
            if(oneDay.size()<minnum) minnum = oneDay.size();
            dayStaff.put(s,oneDay);
        }
        minnum--;
        int times = minnum*dayStaff.size()/staffList.size()+1;
        String[] tempstring = new String[dayStaff.size()];
        Map<String,Integer> usetime = new TreeMap<String, Integer>();
        for (Staff value : staffList) {
            usetime.put(value.getFullName(), 0);
        }
        for(Map.Entry<String,List<Staff>> entry : dayStaff.entrySet()){
            String line = entry.getKey();
            int temp = minnum;
            for(Staff staff : entry.getValue()){
                if(temp == 0) break;
                if(usetime.get(staff.getFullName())<=times){
                    line = line + " ("+staff.getFullName().split(" ")[0]+" "+staff.getFullName().split(" ")[1].substring(0, 1)+")";
                    usetime.put(staff.getFullName(),usetime.get(staff.getFullName())+1);
                    temp--;
                }
            }
            switch (entry.getKey().split(" ")[0]){
                case "M":
                    tempstring[0] = line;
                    break;
                case "T":
                    tempstring[1] = line;
                    break;
                case "W":
                    tempstring[2] = line;
                    break;
                case "TR":
                    tempstring[3] = line;
                    break;
                case "F":
                    tempstring[4] = line;
                    break;
                case "SAT":
                    tempstring[5] = line;
                    break;
                case "SUN":
                    tempstring[6] = line;
                    break;
            }
        }
        List<String> result = new ArrayList<>(Arrays.asList(tempstring));
        FileUtils.writeStoreScheduleToFile(result);
    }

}
