package FinalTest.Repository.LocalPhone;

import FinalTest.model.LocalPhone;

import java.util.List;

public interface ILocalPhoneRepository {
    List<LocalPhone> getAllLocalPhones();
    void addLocalPhone(LocalPhone localPhone);
    LocalPhone getLocalPhoneById(int ID);
    void deleteLocalPhoneById(int ID);
}
