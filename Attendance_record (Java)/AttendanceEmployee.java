import java.util.*;
class AttendanceEmployee extends Employee implements Markable{
    private int[] attendanceArray;
    AttendanceEmployee(int[] attendanceArray, String department, String name, int id){
        super(department,name,id);
        this.attendanceArray = new int[7];
    }
    public void markAttendance(int[] attendance){
        if(attendance.length == 7){
            for(int i=0; i<7; i++){
                attendanceArray[i] = attendance[i];
            }
        }
    }
    public int calculatePresentDays(int[] attendance){
        int count = 0;
        for(int i: attendance){
            if(i==1) count++;
        }
        return count;
    }
    void displayAttendance(){
        System.out.println("Attendance: "+Arrays.toString(attendanceArray));
        System.out.println("Total Present Days: "+calculatePresentDays(attendanceArray));
    }
}