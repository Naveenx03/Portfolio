class Employee extends Person{
    String department;
    static int employeeCount = 0;
    Employee(String department, String name, int id){
        super();
        setDepartment(department);
        setName(name);
        setId(id);
        employeeCount++;
    }
    void setDepartment(String department){
        this.department = department;
    }
    String getDepartment(){
        return department;
    }
    void showEmployeeCount(){
        System.out.println("Total Employees Created: "+employeeCount);
    }
    void showDetail(){
        System.out.println("Name: "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Department: "+getDepartment());
    }
}