import java.util.Arrays;
public class Lab_2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        var c = new Integer[] {1,0,15,1,20,-1,0,10,2,3,12};
        //var c = new Double[] {1.0,0.0,15.42,1.121,20.1,-1.32,0.0,10.1,2.2,3.3,12.5};
        if(c.length != 0){
            System.out.println("Исходный массив:");
            for (i=0;i< c.length;i++){
                System.out.print(c[i]+" ");
            }
            System.out.println();
            int count = 0;
            for (i=0;i<c.length;i++){
                if(c[i]/5 > 0 || c[i]/5 < 0){
                    count++;
                }
            }
            var x = Arrays.copyOf(c,count);
            for (i=0;i<c.length;i++){
                if(c[i]/5 > 0 || c[i]/5 < 0){
                    x[j] = c[i]/5;
                    j++;
                }
            }
            System.out.println("Полученный массив до сортировки:");
            for (i=0;i< x.length;i++){
                try {System.out.print(String.format("%.2f ", x[i]));}
                catch (Exception e){System.out.print(String.format("%d ", x[i]));}
            }
            System.out.println();
            for(i=0;i<x.length;++i) {
                for (j = i + 1; j < x.length; ++j) {
                    if (x[i] > x[j]){
                        var temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                }
            }
            System.out.println("Полученный массив после сортировки:");
            for (i=0;i< x.length;i++){
                try {System.out.print(String.format("%.2f ", x[i]));}
                catch (Exception e){System.out.print(String.format("%d ", x[i]));}
            }
            System.out.println();
        }else{
            System.out.println("Массив пустой");
        }
    }
}
