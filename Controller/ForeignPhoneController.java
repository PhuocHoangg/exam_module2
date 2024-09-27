package FinalTest.Controller;

import FinalTest.Repository.ForeignPhone.ForeignPhoneRepository;
import FinalTest.Repository.ForeignPhone.IForeignPhoneRepository;
import FinalTest.common.IOForeignPhone;
import FinalTest.model.ForeignPhone;

import java.util.List;
import java.util.Scanner;

public class ForeignPhoneController {
    private static final Scanner sc= new Scanner(System.in);
    IForeignPhoneRepository foreignPhoneRepository = new ForeignPhoneRepository();
    public void getAllForeignPhones() {
        List<ForeignPhone> foreignPhoneList= foreignPhoneRepository.getAllForeignPhones();
        for (ForeignPhone foreignPhone : foreignPhoneList) {
            if(foreignPhone!=null){
                System.out.println(foreignPhone);
            }
            else{
                return;
            }
        }
    }
    public void addForeignPhone() {
        int id= IOForeignPhone.getNextId();
        System.out.println("Enter Foreign Phone Name");
        String foreignPhoneName= sc.nextLine();
        System.out.println("Enter Price");
        double foreignPhonePrice= Double.parseDouble(sc.nextLine());
        System.out.println("Enter quantity");
        int foreignPhoneQuantity= Integer.parseInt(sc.nextLine());
        System.out.println("Enter Brand");
        String foreignPhoneBrand= sc.nextLine();
        System.out.println("Enter Guarantee Time");
        int foreignPhoneGuaranteeTime= Integer.parseInt(sc.nextLine());
        System.out.println("Enter Guarantee Area");
        String foreignPhoneGuaranteeArea= sc.nextLine();
        ForeignPhone foreignPhone=new ForeignPhone(id,foreignPhoneName,foreignPhonePrice,foreignPhoneQuantity,foreignPhoneBrand,foreignPhoneGuaranteeTime,foreignPhoneGuaranteeArea);
        foreignPhoneRepository.addForeignPhone(foreignPhone);
    }
    public void getForeignPhoneById() {
        System.out.println("Enter Foreign Phone ID");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println(foreignPhoneRepository.getForeignPhoneById(id));
    }
    public void deleteForeignPhone() {
        System.out.println("Enter Foreign Phone ID");
        int id=Integer.parseInt(sc.nextLine());
        foreignPhoneRepository.deleteForeignPhoneById(id);
    }
}
