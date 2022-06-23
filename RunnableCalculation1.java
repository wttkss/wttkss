import java.io.IOException;

public class RunnableCalculation {
    public static void main(String args[]) throws IOException {
        if(args.length < 1 ){
            System.out.println("Parameters is empty");
        }else if(args.length != 2){
            System.out.println("Not 2 parameters");
        } else{
            try {
                Integer one = Integer.parseInt(args[0]);
                Integer two = Integer.parseInt(args[1]);
                System.out.println(String.format("Result = %d + %d = %d", one, two, one + two));
            }catch (Exception e){
                System.out.println("Trying to enter a string or fractional number");
            }
        }
    }
}
