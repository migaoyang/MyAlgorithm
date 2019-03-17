package DataStructs.sort;

public class SelectSort {
    public static void select(int [] data){
        if (data == null || data.length == 0)
            return;
        for (int i = 0 ; i < data.length ; i++ ){
            int min = data[i];
            for (int j = i + 1 ; j < data.length ; j++){
                if (data[j] < min){
                    int temp = min;
                    min =  data[j];
                    data[j] = temp;
                }
            }
            data[i] = min;
        }
    }
}
class SelectTest{
    public static void main(String[] args) {
        int[] data = { 0,7, 3 ,1, 19 , 40 , 4 , 7 ,	1,0};
        SelectSort.select(data);
        for (int i : data) {
            System.out.println(i);
        }
    }

}