package Application;

import Domen.Deportament;
import Domen.Staff;

public interface ApplicationServiceStaff extends ApplicationService {
    Staff CreateEntities(Staff staff);
    Staff UpdateEntities(long id, Staff staff);
}
