package Domen;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StaffRepositiry implements StaffRepository{
    HashMap<Long,Staff> map = new HashMap<>();
    @Override
    public Staff getEntity(long id) {
        return map.get(id);
    }

    @Override
    public void Update(long id, Staff sta) {
        map.replace(id,sta);
    }

    @Override
    public HashMap<Long, Staff> Create(Staff staff) {
        long id=map.size()+1;
        map.put(id, (Staff) staff);
        return map;
    }
    @Override
    public void Delete(long id) {
        map.remove(id);
    }

    @Override
    public Staff Search(long id)
    {
        System.out.println(map.get(id));
        return map.get(id);
    }

    @Override
    public void get() {
        for (Map.Entry<Long,Staff> m : map.entrySet()) {
            System.out.println( m.getValue());
        }
    }
}
