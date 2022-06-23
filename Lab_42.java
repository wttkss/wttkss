public class Lab_4 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        var arr = new Integer[][]{{1,-5,3,5},{4,-2,6,8},{7,8,-9,11},{1,2,0,3}};
        //var arr = new Double[][]{{1.1,-5.2,3.3,5.4},{4.0,-2.52,6.3,8.4},{7.2,8.1,-9.2,11.1},{1.123,2.3,0.5,3.9}};
        if(arr.length != 0){
            System.out.println("Исходный массив:");
            for (i=0;i<arr.length;i++){
                for (j=0;j<arr[i].length;j++){
                    try{System.out.print(String.format("%10.2f ",arr[i][j]));}
                    catch (Exception e){System.out.print(String.format("%10d ",arr[i][j]));}
                }
                System.out.println();
            }
            System.out.println();
            /*var max = -Double.MAX_VALUE; //Можно было сделать так, но тогда теряется универсальность типов данных
            for (i = 0; i < arr.length; i++)
            {
                for (j = 0; j < arr.length - i - 1; j++)
                {
                    if (max < arr[i][j] && arr[i][j]<0) {
                        max = arr[i][j];
                    }
                }
            }
            System.out.println(max);*/
            //Придётся поискать первый отрицательный элемент над побочной диагональю
            var max = 0/arr[0][0];
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length - i - 1; j++) {
                    if (arr[i][j]<0) {
                        max = arr[i][j];
                        break;
                    }
                }
                if(max !=0 ){break;}
            }
            if(max != 0) {
                for (i = 0; i < arr.length; i++) {
                    for (j = 0; j < arr.length - i - 1; j++) {
                        if (max < arr[i][j] && arr[i][j] < 0) {
                            max = arr[i][j];
                        }
                    }
                }
                System.out.println("Максимальынй элемент выше побочной диагонали:\n" + max);
            }else{
                System.out.println("Отрицательных элементов, выше побочной диагонали не найдено.");
            }
        }else{
            System.out.println("Массив пустой");
        }
    }
}
