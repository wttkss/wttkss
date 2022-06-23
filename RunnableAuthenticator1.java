import java.io.IOException;

public class RunnableAuthenticator {
    public static void main(String args[]) throws IOException {
        if(args.length < 1 ){
            System.out.println("Parameters is empty");
        }else if(args.length != 2){
            System.out.println("Not 2 parameters");
        } else{
            if(args[0] == "Admin" && args[1] == "Admin"){
                System.out.println("Passed, welcome!");
            }else{
                System.out.println("Wrong login or password!");
            }
        }
    }
}
