public class Schoolstudent extends Students{
    Schoolstudent(int roll_no,String name){
        super(roll_no,name);
    }
    public void attend_class(){
        System.out.println(name+"student is attending");
    }
    public void give_exam(){
        System.out.println( name+"giving exam");
    }
}
