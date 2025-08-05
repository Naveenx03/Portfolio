abstract class Person{
    private String name;
    private int id;
    void setName(String name){
        this.name = name;
    }
    void setId(int id){
        this.id = id;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    abstract void showDetail();
}
