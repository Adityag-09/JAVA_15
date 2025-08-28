public class MyException {
    public static void main(String[] args) {
        UserDefinedException udf= new UserDefinedException();
        try{
            udf.validate(22);
            udf.validate(2);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
