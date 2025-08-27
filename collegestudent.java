public class collegestudent extends student1{
    public int roll_no;

    public collegestudent(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_roll()
    {
        System.out.println("Roll No is "+roll_no);
    }
}