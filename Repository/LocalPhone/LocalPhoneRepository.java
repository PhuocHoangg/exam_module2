package FinalTest.Repository.LocalPhone;

import FinalTest.common.IOLocalPhone;
import FinalTest.model.LocalPhone;

import java.util.ArrayList;
import java.util.List;

public class LocalPhoneRepository implements ILocalPhoneRepository {
    private static final List<LocalPhone> localPhones = new ArrayList<LocalPhone>();
    @Override
    public List<LocalPhone> getAllLocalPhones() {
        return IOLocalPhone.readLocalPhone();
    }

    @Override
    public void addLocalPhone(LocalPhone localPhone) {
     IOLocalPhone.writeLocalPhone(localPhone);
    }

    @Override
    public LocalPhone getLocalPhoneById(int ID) {
        return IOLocalPhone.findLocalPhoneByID(ID);
    }

    @Override
    public void deleteLocalPhoneById(int ID) {
        IOLocalPhone.deleteLocalPhoneByID(ID);


    }
}
