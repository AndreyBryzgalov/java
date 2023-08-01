package Application;

import Domen.Deportament;
import Domen.DeportamentRepository;
import Domen.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServercDepartament implements ApplicationServiceDepartament{
    @Autowired
    DeportamentRepository repositiry;
    @Override
    public void DeleteEntities(long id) {
        repositiry.Delete(id);
    }

    @Override
    public Staff SearchEntities(long id) {
        repositiry.Search(id);
        return null;
    }

    @Override
    public void get() {
        repositiry.get();
    }

    @Override
    public Deportament CreateEntities(Deportament dep) {
        repositiry.Create(dep);
        return dep;
    }

    @Override
    public Deportament UpdateEntities(long id, Deportament dep) {
        repositiry.Update(id,dep);
        return dep;
    }
}
