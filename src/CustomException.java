import javax.management.remote.SubjectDelegationPermission;

// class represent custom exceptionc
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
//class that uses custom exception InvalidAgeException
 public class CustomException {
    //method check the age
    static void validate(int age){

    }
}