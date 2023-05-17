package m5s;


public class Service {

	public int [] arr= {5,2,7,14,23,11,10,42,25,19,4};
	QuickSort sort = new QuickSort();
	
    int min=0;
    int max= ((arr.length)-1);
    int size;
	int i;
	
	
	public  int[] sortService() {
		sort.quickSort(arr, min, max);
		return arr;
		}
		
		
	
	public int runBinarySearchIteratively( int[] sortedArray, int key, int min, int max) {
			    int index = Integer.MAX_VALUE;
			    
			    try {
					while (min <= max) {
					    int mid = min  + ((max - min) / 2);
					    if (sortedArray[mid] < key) {
					        min = mid + 1;
					    } else if (sortedArray[mid] > key) {
					        max = mid - 1;
					    } else if (sortedArray[mid] == key) {
					        index = mid;
					        break;
					    }
					}
					System.out.println("Index of your target value is: " + index);
					return index;
				} catch (Exception e) {
				System.out.println("The target you searched for is not available!");
				return 0;
				}
			}


	
	
}
