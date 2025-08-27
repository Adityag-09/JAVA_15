public abstract class Students {
    int roll_no;
    public String name;
    Students(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
    abstract void attend_class();
    abstract void give_exam();
    void register(){
        System.out.println("name is"+name+"student is registering"+roll_no);
    }
}
