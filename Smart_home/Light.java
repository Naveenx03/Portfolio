class Light extends SmartDevice{
    private int brightnessLevel;
    Light(int brightnessLevel, String deviceName){
        super(deviceName);
        this.brightnessLevel = brightnessLevel;
    }
    void setBrightnessLevel(int level){
        brightnessLevel = level;
    }
    void performFunction(){
        System.out.println("Light is adjusting brightness to "+brightnessLevel+"%");
    }
}