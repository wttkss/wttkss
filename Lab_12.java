public class Lab_1 {
    public static void main(String[] args) {
        int i = 0;
        var arr = new Double[] {1.1,-1.2,3.4,5.2,1.2,10.8,0.0};
        //var arr = new Integer[] {1,2,3,1,0,-1,2,10,2,3};

        if(arr.length != 0){
            System.out.println("Массив:");
            for (i=0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            var max = arr[0];
            for (i=0;i< arr.length;i++){
                if(arr[i]>=max){
                    max = arr[i];
                }
            }
            System.out.println("Максимальный элемент:\n"+max);
            System.out.println("Массив после деления на максимальный элемент:");
            for (i=0;i< arr.length;i++){
                try {
                    System.out.print(String.format("%.2f ", arr[i] / max));
                }catch (Exception e){
                    System.out.print(String.format("%d ", arr[i] / max));
                }
            }
        }else{
            System.out.println("Массив пустой");
        }
    }
}
