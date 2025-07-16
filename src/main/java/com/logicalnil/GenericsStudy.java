package com.logicalnil;

public class GenericsStudy<T, U, V, W> {

    T roomNumber;
    U floor;
    V governmentApproval;
    W rent;
    
    GenericsStudy(){};

    public void setFloor(U floor) {
        this.floor = floor;
    }

    public void setGovernmentApproval(V governmentApproval) {
        this.governmentApproval = governmentApproval;
    }

    public void setRent(W rent) {
        this.rent = rent;
    }

    public void setRoomNumber(T roomNumber) {
        this.roomNumber = roomNumber;
    }

    public U getFloor() {
        return floor;
    }

    public T getRoomNumber() {
        return roomNumber;
    }

    public V getGovernmentApproval() {
        return governmentApproval;
    }

    public W getRent() {
        return rent;
    }
}
