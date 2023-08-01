package Domen;

import java.util.HashMap;

public interface StaffRepository extends GenericRepository {
    HashMap<Long, Staff> Create(Staff staff);
    Staff getEntity(long id);
    void Update(long id,Staff sta);
}
