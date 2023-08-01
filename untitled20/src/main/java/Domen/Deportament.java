package Domen;

import java.util.HashSet;

public class Deportament {
    private int id;
    private String name;
    private long number;
    private HashSet<Integer> room = new HashSet<>();

    public Deportament(String name,long number,HashSet<Integer> room) {
        this.name=name;
        this.number=number;
        this.room=room;
    }
    public Deportament(){}
    public int getId() {
        return id;
    }

    public void setRoom(HashSet<Integer> room) {
        this.room = room;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Integer> getRoom() {
        return room;
    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", number=" + number +
                ", room=" + room;
    }
}
