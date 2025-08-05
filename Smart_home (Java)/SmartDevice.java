abstract class SmartDevice{
    private String deviceName;
    SmartDevice(String  deviceName){
        this.deviceName = deviceName;
    }
    void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }
    String getDeviceName(){
        return deviceName;
    }
    abstract void performFunction();
}