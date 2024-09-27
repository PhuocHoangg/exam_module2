package FinalTest.Repository.ForeignPhone;

import FinalTest.common.IOForeignPhone;
import FinalTest.model.ForeignPhone;
import FinalTest.model.LocalPhone;

import java.util.ArrayList;
import java.util.List;

public class ForeignPhoneRepository implements  IForeignPhoneRepository{
    private static final List<ForeignPhone> foreignPhones = new ArrayList<>();


    @Override
    public List<ForeignPhone> getAllForeignPhones() {
        return IOForeignPhone.readForeignPhone();
    }

    @Override
    public void addForeignPhone(ForeignPhone foreignPhone) {
        IOForeignPhone.writeForeignPhone(foreignPhone);

    }

    @Override
    public ForeignPhone getForeignPhoneById(int ID) {
        return IOForeignPhone.FindPhoneByID(ID);
    }

    @Override
    public void deleteForeignPhoneById(int ID) {
        IOForeignPhone.DeletePhoneByID(ID);

    }
}
