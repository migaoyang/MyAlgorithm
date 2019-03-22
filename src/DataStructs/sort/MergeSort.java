package DataStructs.sort;

public class MergeSort {
    public static void merge(int[] data, int p, int q, int r) {
        int i, j, k, n1, n2;
        n1 = q - p + 1;
        n2 = r - q;
        int[] lPart = new int[n1];
        int[] rPart = new int[n2];
        for (i = 0, k = p; i < n1; i++, k++)
            lPart[i] = data[k];
        for (i = 0, k = q + 1; i < n2; i++, k++)
            rPart[i] = data[k];
        for (k = p, i = 0, j = 0; i < n1 && j < n2; k++) {
            if (lPart[i] > rPart[j]) {
                data[k] = lPart[i];
                i++;
            } else {
                data[k] = rPart[j];
                j++;
            }
        }
        //寻找还有未融合完的部分序列
        if (i < n1) {
            for (j = i; j < n1; j++, k++) {
                data[k] = lPart[j];
            }
        }

        if (j < n2) {
            for (j = i; i < n2; i++, k++) {
                data[k] = rPart[i];
            }
        }
    }

    public static void mergeSort(int[] data, int p, int r) {
        if (p < r) {
            int q = (p + r)/2;
            mergeSort(data, p, q);
            mergeSort(data, q+1, r);
            merge(data, p, q, r);
        }

    }

}

class jiecheng{
    public static Integer jiecehngAlgo(int n){
        if (n < 0)
            return null;
        if (n == 0)
            return  1;
        if (n > 1){
            n =n* jiecehngAlgo(n-1);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(jiecehngAlgo(1));
    }

}

class MergeTest {
    public static void main(String[] args) {
        int[] data = {0, 7, 3, 1, 19, 40, 4, 7, 1, 0};
        MergeSort.mergeSort(data,0 , data.length-1);
        for (int i : data) {
            System.out.println(i);
        }
    }
}