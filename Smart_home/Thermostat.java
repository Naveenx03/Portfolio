class Thermostat extends SmartDevice{
    private double temperature;
    Thermostat(double temperature, String deviceName){
        super(deviceName);
        this.temperature = temperature;
    }
    void setTemperature(double temperature){
        this.temperature = temperature;
    }

    void performFunction(){
        System.out.println(" Thermostat' is set to "+temperature+"°C");
    }
}