import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        AttendanceEmployee[] employees = new AttendanceEmployee[4];

        System.out.println("--------- Attendance Instructions --------- ");
        System.out.println("Enter attendance for 7 days as 0 (Absent) or 1 (Present) ");
        System.out.println();

        for(int i=1; i<=employees.length; i++){
            System.out.println("Enter details for Employee "+i+":");
            System.out.print("Enter Name: ");
            String name = in.nextLine();
            System.out.print("Enter ID: ");
            int id = in.nextInt();
            in.nextLine();
            System.out.print("Enter Department: ");
            String dept = in.nextLine();
            System.out.print("Enter Attendance (7 values of 0/1): ");
            int[] attendance = new int[7];
            for(int j=0; j<attendance.length; j++){
                attendance[j] = in.nextInt();
            }
            employees[i-1] = new AttendanceEmployee(attendance, dept, name, id);
            employees[i-1].markAttendance(attendance);
            in.nextLine();
            System.out.println();
        }
        for(AttendanceEmployee emp: employees){
            System.out.println("Employee's Details:");
            System.out.println();
            emp.showDetail();
            emp.displayAttendance();
            emp.showEmployeeCount();
            System.out.println();
        }
        System.out.println("Total Employees Created: "+AttendanceEmployee.employeeCount);
        in.close();
    }
}