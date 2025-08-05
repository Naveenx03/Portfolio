import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Room[] tot_rooms = new Room[2];
        for(int i=0; i<tot_rooms.length; i++){
            System.out.print("Enter Room Name: ");
            String room = in.nextLine();
            System.out.print("Adjust Light [0-100]: ");
            int light = in.nextInt();
            System.out.print("Adjust Thermostat Temperature: ");
            int temp = in.nextInt();
            in.nextLine();
            Light device1 = new Light(light, "Light");
            Thermostat device2 = new Thermostat(temp, "Thermostat");
            tot_rooms[i] = new Room(room,device1,device2);
            System.out.println();
        }
        
        House home = new House(tot_rooms[0], tot_rooms[1]);
        home.showAllDevices();
        System.out.println("--- Performing Functions ---");
        System.out.println();
        home.controlAllDevices();
        in.close();
    }
}