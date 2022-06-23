import java.io.IOException;

public class RunnableHelloWorld {
    public static void main(String args[]) throws IOException {
        if(args.length < 1){
            System.out.println("Hello world");
        }else{
            System.out.println(String.format("Hello %s ",args[0]));
        }
    }
}
