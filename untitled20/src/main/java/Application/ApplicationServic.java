package Application;

import Domen.Staff;
import Domen.StaffRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServic implements ApplicationServiceStaff {
    @Autowired
    StaffRepositiry repositiry;

    @Override
    public Staff CreateEntities(Staff staff) {
        repositiry.Create(staff);
        return staff;
    }

    @Override
    public Staff UpdateEntities(long id, Staff staff) {
        repositiry.Update(id,staff);
        return  staff;
    }

    @Override
    public void DeleteEntities(long id) {
        repositiry.Delete( id);
    }

    @Override
    public Staff SearchEntities(long id) {
        repositiry.Search(id);
        return repositiry.Search(id);
    }

    @Override
    public void get() {
        repositiry.get();
    }

}
