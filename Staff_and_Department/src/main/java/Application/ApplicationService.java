package Application;

import Domen.Staff;

public interface ApplicationService {
    void DeleteEntities(long id);
    Staff SearchEntities(long id);
    void get();

}
