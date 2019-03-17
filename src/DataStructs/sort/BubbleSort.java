package DataStructs.sort;

public class BubbleSort {
public static int[] bubble(int [] data) {
	int length = data.length;
	for(int i = 0 ; i < length ; i ++) {
		for(int j = 0 ; j < length-i-1 ; j++) {
			if (data[j] > data[j+1]) {
				int temp = data[j];
				data[j] = data[j+1];
				data[j+1] = temp;
			}
		}
	}
	return data;
}
}


class BubbleSortTest{
	public static void main(String [] args) {
		int[] data = { 7, 3 , 19 , 40 , 4 , 7 ,	1,0};
		int[] res = BubbleSort.bubble(data);
		for (int i : res) {
			System.out.println(i);
		}
	}
}