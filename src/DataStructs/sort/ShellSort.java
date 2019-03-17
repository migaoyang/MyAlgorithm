package DataStructs.sort;

public class ShellSort {
	public static int[] shell(int [] data) {
		int length = data.length;
		int j ;
		for(int pace = length/2 ; pace > 0 ; pace = pace / 2 ) {
			for(int i = pace ; i < length ; i ++) {
				int temp = data[i];
				for( j = i - pace ; j >= 0 ; j  -= pace) {
					if (temp < data[j]) {
						data[j+pace] = data[j];
					}else 
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