package FinalTest.Controller;

import FinalTest.Repository.LocalPhone.ILocalPhoneRepository;
import FinalTest.Repository.LocalPhone.LocalPhoneRepository;
import FinalTest.common.IOLocalPhone;
import FinalTest.model.LocalPhone;

import java.util.List;
import java.util.Scanner;

public class LocalPhoneController {
    private static final Scanner sc = new Scanner(System.in);
    ILocalPhoneRepository localPhoneRepository = new LocalPhoneRepository();
    public void getAllLocalPhones() {
        List<LocalPhone> localPhones = localPhoneRepository.getAllLocalPhones();
        for (LocalPhone localPhone : localPhones) {
            if(localPhone != null) {
                System.out.println(localPhone);
            }
            else{
                return;
            }
        }

    }
    public void addLocalPhone() {
        int id= IOLocalPhone.getNextId();
        System.out.println("Enter Local Phone Name");
        String localPhoneName= sc.nextLine();
        System.out.println("Enter Price");
        double localPhonePrice= Double.parseDouble(sc.nextLine());
        System.out.println("Enter quantity");
        int localPhoneQuantity= Integer.parseInt(sc.nextLine());
        System.out.println("Enter Brand");
        String localPhoneBrand= sc.nextLine();
        System.out.println("Enter Nation");
        String localPhoneNation= sc.nextLine();
        System.out.println("Enter Conditions");
        String localPhoneConditions= sc.nextLine();
        LocalPhone localPhone=new LocalPhone(id,localPhoneName,localPhonePrice,localPhoneQuantity,localPhoneBrand,localPhoneNation,localPhoneConditions);
        localPhoneRepository.addLocalPhone(localPhone);
    }
    public void deleteLocalPhone() {
        System.out.println("Enter Local Phone ID");
        int id=Integer.parseInt(sc.nextLine());
        localPhoneRepository.deleteLocalPhoneById(id);
    }
    public void getLocalPhoneById() {
        System.out.println("Enter Local Phone ID");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println(localPhoneRepository.getLocalPhoneById(id));
    }
}
