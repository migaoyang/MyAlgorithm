package DataStructs.sort;

public class ShellSort {
	public static int[] shell(int [] data) {
		int length = data.length;
		int j ;
		for(int pace = length/2 ; pace > 0 ; pace = pace / 2 ) {
			//设置一个步长（增量）pace，每隔这个增量就是一个子序列。
			for(int i = pace ; i < length ; i ++) {

				int temp = data[i];
				for( j = i - pace ; j >= 0 ; j  -= pace) {
					//初始j为第一个子序列的第一个数据
					//保证已经比较过的子序列是有序的，在自序列中为递增
					if (temp < data[j]) {
						data[j+pace] = data[j]; //data[j+pace] == data[i] == temp
					}else
						//已经遍历的子序列已经有序，data[j]已为最大值
						break;					
				}
				data[j+pace] = temp;
			}
		}
		return data;
	}

}

class TestMain{
	public static void main(String [] args) {

		int[] data = { 7, 3 , 19 , 40 , 4 , 7 ,	1};
		int[] res = ShellSort.shell(data);
		for (int i : res) {
			System.out.println(i);
		}
	}
}