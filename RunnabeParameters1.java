import java.io.IOException;

public class RunnabeParameters {
    public static void main(String args[]) throws IOException {
        if(args.length < 1){
            System.out.println("Parameters is empty");
        }else{
            System.out.println(String.format("Enter %d parameters",args.length));
        }
    }
}
