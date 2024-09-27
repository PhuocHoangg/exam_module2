package FinalTest.common;

import FinalTest.model.ForeignPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOForeignPhone {
    private static final String FOREIGN_PATH="src/FinalTest/data/ForeignPhone.csv";
    public static void writeForeignPhone(ForeignPhone foreignPhone)  {
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(FOREIGN_PATH,true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data=foreignPhone.getID()+","+foreignPhone.getName()+","+foreignPhone.getPrice()+","+foreignPhone.getQuantity()+","+foreignPhone.getBrand()
                +","+foreignPhone.getGuaranteeTime()+","+foreignPhone.getGuaranteeArea();
        try {
            bufferedWriter.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<ForeignPhone> readForeignPhone() {
        List<ForeignPhone> foreignPhones=new ArrayList<ForeignPhone>();
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(FOREIGN_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        while(true){
            String data= null;
            try {
                data = bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if(data==null){
                break;
            }
            String[] dataArray=data.split(",");
            ForeignPhone foreignPhone1=new ForeignPhone(Integer.parseInt(dataArray[0]),dataArray[1],Double.parseDouble(dataArray[2]),Integer.parseInt(dataArray[3]),dataArray[4],Integer.parseInt(dataArray[5]),dataArray[6]);
            foreignPhones.add(foreignPhone1);
        }
        return foreignPhones;
    }
    public static void writeForeignPhoneToList(List<ForeignPhone> foreignPhones){
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(FOREIGN_PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i=0;i<foreignPhones.size();i++){
            String data=foreignPhones.get(i).getID()+","+foreignPhones.get(i).getName()+","+foreignPhones.get(i).getPrice()+","+foreignPhones.get(i).getQuantity()+","+foreignPhones.get(i).getBrand()+","+foreignPhones.get(i).getGuaranteeTime()+","+foreignPhones.get(i).getGuaranteeArea();
            try {
                bufferedWriter.write(data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static ForeignPhone FindPhoneByID(int ID){
        List<ForeignPhone> foreignPhones=readForeignPhone();
        for(ForeignPhone foreignPhone:foreignPhones){
            if(foreignPhone.getID()==ID){
                return foreignPhone;
            }
        }
        return null;
    }
    public static void DeletePhoneByID(int ID){
        List<ForeignPhone> foreignPhones=readForeignPhone();
        for(ForeignPhone foreignPhone:foreignPhones){
            if(foreignPhone.getID()==ID){
                foreignPhones.remove(foreignPhone);
                writeForeignPhoneToList(foreignPhones);
                return;
            }
        }
    }
    public static int getNextId(){
        int count;
        try {
            FileReader file = new FileReader(FOREIGN_PATH);
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
