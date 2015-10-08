public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {5,3,6,7,9,8,1};
		int index;
		for(int i = 0; i < arr.length; i++) {
			index = i;

			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}