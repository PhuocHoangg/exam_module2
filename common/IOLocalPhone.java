package FinalTest.common;

import FinalTest.model.ForeignPhone;
import FinalTest.model.LocalPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOLocalPhone {
    private static final String LOCALPHONE_PATH="src/FinalTest/data/LocalPhone.csv";
    public static void writeLocalPhone(LocalPhone localPhone) {
        try {
            FileWriter fileWriter = new FileWriter(LOCALPHONE_PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data=localPhone.getID()+","+localPhone.getName()+","+localPhone.getPrice()+","+localPhone.getQuantity()+","+localPhone.getBrand()+","+localPhone.getNation()+","+localPhone.getCondition();
            bufferedWriter.newLine();
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<LocalPhone> readLocalPhone() {
        List<LocalPhone> localPhones=new ArrayList<LocalPhone>();
        try {
            FileReader fileReader=new FileReader(LOCALPHONE_PATH);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while(true){
                String data=null;
                try {
                     data=bufferedReader.readLine();
                    if(data==null){
                        break;
                    }
                    String[] dataArray=data.split(",");
                    LocalPhone localPhone=new LocalPhone(Integer.parseInt(dataArray[0]),dataArray[1],Double.parseDouble(dataArray[2]),Integer.parseInt(dataArray[3]),dataArray[4],dataArray[5],dataArray[6]);
                    localPhones.add(localPhone);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
      return localPhones;
    }
    public static void writeLocalPhoneToList(List<LocalPhone> localPhones) {
        try {
            FileWriter fileWriter=new FileWriter(LOCALPHONE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < localPhones.size(); i++) {
                String data=localPhones.get(i).getID()+","+localPhones.get(i).getName()+","+localPhones.get(i).getPrice()+","+localPhones.get(i).getQuantity()+","+localPhones.get(i).getBrand()+","+localPhones.get(i).getNation()+","+localPhones.get(i).getCondition();
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static LocalPhone findLocalPhoneByID(int id) {
        List<LocalPhone> localPhones=readLocalPhone();
        for (LocalPhone localPhone : localPhones) {
            if (localPhone.getID()==id) {
                return localPhone;
            }
        }
        return null;
    }
    public static void deleteLocalPhoneByID(int id) {
        List<LocalPhone> localPhones=readLocalPhone();
        for (LocalPhone localPhone : localPhones) {
            if (localPhone.getID()==id) {
                localPhones.remove(localPhone);
                writeLocalPhoneToList(localPhones);
                return;
            }
        }
    }
    public static int getNextId(){
        int count;
        try {
            FileReader file = new FileReader(LOCALPHONE_PATH);
            BufferedReader bufferedReader = new BufferedReader(file);
            count = 1;
            while (bufferedReader.readLine() != null) {
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
}
