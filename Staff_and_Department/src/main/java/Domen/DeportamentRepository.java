package Domen;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DeportamentRepository implements DepartamentRepository{

    HashMap<Long,Deportament> map = new HashMap<>();
    @Override
    public Deportament getEntity(long id) {
        return map.get(id);
    }


    @Override
    public HashMap<Long, Deportament> Create(Deportament dep) {
        long id=map.size()+1;
        map.put(id, dep);
        return map;
    }
    @Override
    public void Delete(long id) {
        map.remove(id);
    }

    @Override
    public Staff Search(long id) {
        return null;
    }

    //    @Override
//    public List<Deportament> Search(String name) {
//        return map.values().stream()
//                .filter(item -> item.getName().contains(name))
//                .collect(Collectors.toList());
//    }
    @Override
    public void get() {
        for (Map.Entry<Long, Deportament> m : map.entrySet()) {
            System.out.println( m.getValue());
        }
    }
    @Override
    public void Update(long id,Deportament dep) {
            map.replace(id,dep);
       }

    @Override
    public List<Deportament> Search(String name) {
        return null;
    }

}


