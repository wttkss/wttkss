public class Lab_3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        //var arr = new Integer[][]{{1,-2,3},{4,5,6},{7,8,-9}};
        var arr = new Double[][]{{1.0,-1.2,2.3},{1.3,4.9,1.2},{2.3,-4.2,1.2}};
        if(arr.length != 0){
            for (i=0;i<arr.length;i++){
                for (j=0;j<arr[i].length;j++){
                    try{System.out.print(String.format("%5.2f ",arr[i][j]));}
                    catch (Exception e){System.out.print(String.format("%5d ",arr[i][j]));}
                }
                System.out.println();
            }
            System.out.println();
            var temp = arr[0][0]/arr[0][0];
            for (i=0;i<arr.length;i++){
                for (j=0;j<arr[i].length;j++){
                    if(arr[j][i] > 0){
                        temp*=arr[j][i];
                    }
                }
                try{System.out.println(String.format("Произведение положительных элементов %d столбца\n%.2f",i+1,temp));}
                catch (Exception e){System.out.println(String.format("Произведение положительных элементов %d столбца\n%d",i+1,temp));}
                temp = arr[0][0]/arr[0][0];
            }

        }else{
            System.out.println("Массив пустой");
        }
    }
}
