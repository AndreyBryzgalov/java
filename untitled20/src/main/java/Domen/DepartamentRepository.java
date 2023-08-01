package Domen;

import java.util.HashMap;
import java.util.List;

public interface DepartamentRepository extends GenericRepository {
    HashMap<Long, Deportament> Create(Deportament dep);
    Deportament getEntity(long id);
    void Update(long id,Deportament dep);
    public List<Deportament> Search(String name)
}
