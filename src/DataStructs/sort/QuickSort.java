package DataStructs.sort;


public class QuickSort {
    /**
     *  quickSort is imporvement of bubbleSort.
     * @param data
     * @return
     */
    public static void quick(int[] data){
        sort(data, 0, data.length-1);
    }

    public static void sort(int[] data , int low , int high){
        int i , j ;
        int index ;  //pivot
        if (low >= high )
            return;
        i = low;
        j = high;
        index = data[i];
        while (i < j){
            while (i < j && data[j] >= index ) //use '>=' to be ensure stabilize
                j --;
            if (i < j)
                data[i++] = data[j];  //data[i] = data[j] ; i++;

            while (i < j && data[i] < index) //not use '=' ensure stabilize
                i ++;
            if (i < j)
                data[j--] = data[i];
        }
        data[i] = index;
        sort(data,low,j-1);    // i = j
        sort(data, i+1, high);
    }
}

class QuickTest{
    public static void main(String[] args) {
        int[] data = { 0,7, 3 ,1, 19 , 40 , 4 , 7 ,	1,0};
        QuickSort.quick(data);
        for (int i : data) {
            System.out.println(i);
        }
    }
}