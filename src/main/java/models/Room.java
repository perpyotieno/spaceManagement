package models;

import java.util.Objects;

public class Room {
    private String name;
    private boolean occupied;
    private int capacity;
    private int id;



    public Room(String  name, boolean occupied,int capacity) {
        this.name = name;
        this.occupied = true;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return occupied == room.occupied &&
                capacity == room.capacity &&
                id == room.id &&
                Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occupied, capacity, id);
    }
}
