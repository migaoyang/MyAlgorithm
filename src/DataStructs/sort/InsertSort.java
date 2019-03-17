package DataStructs.sort;
/**
 * 插入排序
 * @author xiaomi
 *
 */
public class InsertSort {
	public static int[] insert(int[] data) {
		if (data == null || data.length == 0) {
			return data;
		}
		int length = data.length;
		for(int i = 1 ; i < length ; i ++) {
			int j =i ;
			int temp = data[j];
			if (data[i-1] > data[i]) {
				for(; j > 0 && data[j-1] > temp ; j--) {				
					data[j] = data[j-1];
				}
/*				while (j > 0 && data[j-1] > temp) {
					data[j] = data[j-1];
					j--;
				}*/
				data[j] = temp;
			}				
		
		}
		return data;
	}

}

class Test{
	public static void main(String[] args) {
		int[] data = { 7, 3 , 19 , 40 , 4 , 7 , 1	};
		int[] res = InsertSort.insert(data);
		for (int i : res) {
			System.out.println(i);
		}
		}
}
