package Domen;

import java.util.HashSet;

public class Staff {
    private long id;
    private String name;
    private String date;
    private String position;
    private HashSet<Deportament> dep = new HashSet<>();

    public Staff(long id,String name,String date,String position,HashSet set) {
        this.id=id;
        this.name=name;
        this.date=date;
        this.position=position;
        this.dep=set;
    }

    public Staff(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setDep(HashSet<Deportament> dep) {
        this.dep = dep;
    }

    public HashSet<Deportament> getDep() {
        return dep;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", position='" + position + '\'' +
                ", dep=" + dep +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
