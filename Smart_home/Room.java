class Room{
    private String roomName;
    private SmartDevice device1;
    private SmartDevice device2;
    Room(String roomName,SmartDevice device1,SmartDevice device2){
        this.roomName = roomName;
        this.device1 = device1;
        this.device2 = device2;
    }
    void showRoomDevices(){
        System.out.println("Room: "+roomName);
        System.out.println("- Device: "+roomName+" "+device1.getDeviceName());
        System.out.println("- Device: "+roomName+" "+device2.getDeviceName());
        System.out.println();
    }
    void controlDevices(){
        System.out.print(roomName+ " ");
        device1.performFunction();
        System.out.print(roomName+ " ");
        device2.performFunction();
        System.out.println();
    }
}