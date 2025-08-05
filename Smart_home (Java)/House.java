class House{
    private Room room1;
    private Room room2;
    House(Room room1,Room room2){
        this.room1 = room1;
        this.room2 = room2;
    }
    void showAllDevices(){
        room1.showRoomDevices();
        room2.showRoomDevices();
    }
    void controlAllDevices(){
        room1.controlDevices();
        room2.controlDevices();
    }
}