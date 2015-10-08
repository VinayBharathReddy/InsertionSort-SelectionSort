public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {5,3,6,7,9,8,1};
		int index;
		for(int i = 1; i < arr.length; i++) {
			index = i;
			int temp = arr[i];
			while(index > 0 && arr[index - 1] > temp) {
				arr[index] = arr[index - 1];
				index = index - 1;
			}
			arr[index] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}