public class UserDefinedException {
    public void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("You are too young");
        else
            System.out.println("You are eligible");
    }
}
