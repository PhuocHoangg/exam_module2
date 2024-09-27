package FinalTest.Repository.ForeignPhone;

import FinalTest.model.ForeignPhone;

import java.util.List;

public interface IForeignPhoneRepository {
    List<ForeignPhone> getAllForeignPhones();
    void addForeignPhone(ForeignPhone foreignPhone);
    ForeignPhone getForeignPhoneById(int ID);
    void deleteForeignPhoneById(int ID);
}
