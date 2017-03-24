import java.util.Arrays;
import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int [][] nums = new int[3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 100);
			// last 2 numbers are the range of numbers you put in the array
		// test each method you create below.
			//printArray
				printArray(nums);
				
			//sumRow
			int rowTotal = sumRow(nums, 1);
			System.out.println(rowTotal);
				
			//sumAllRows
			int[] sumOfAllRows = sumAllRows(nums);
			System.out.println(Arrays.toString(sumOfAllRows));
			
			//repeats
			int[] newArray = {2, 3, 5, 3, 4};
			repeats(newArray);
			
			//indexOfTarget
			indexOfTarget(newArray, 5);
			
			//min
			int min = min(nums);
			System.out.println(min);
			
			//max
			int max = max(nums);
			System.out.println(max);

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
		public static void fillRandom(int[][] nums, int low, int high) {
			Random random = new Random();
			for(int r = 0; r < nums.length; r++) {
				for(int c = 0; c < nums[0].length; c++) {
					nums[r][c] = random.nextInt(high) + low;
				}
			}
		}
		
	
	/*
	 * create a method that prints a 2D array
	 */
		public static void printArray(int[][] nums) {
			for(int r = 0; r < nums.length; r++) {
				System.out.print(" { ");
				for(int c = 0; c < nums[0].length; c++) {
					System.out.print(nums[r][c] + ", ");
				}
				System.out.println(" } ");
			}
		}
	
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
		public static int sumRow(int[][] nums, int row) {
			int sum = 0;
			for(int c = 0; c < nums[0].length; c++) {
				
				sum = sum +nums[row][c];
			}
			return sum;
		}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
		public static int[] sumAllRows(int[][] nums) {
			int[] sums = new int[nums.length]; // b/c nums.length is number of rows
			for(int r = 0; r < nums.length; r++){
				sums[r] = sumRow(nums, r);
			}
			
			return sums;
		}
	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
		public static boolean repeats(int[] Array) {
		for(int i = 0; i < Array.length-1; i++) {
			for(int j = i+1; j < Array.length; j++) {
				if(Array[i] == Array[j]){
					return true;
				}
			}
			
		}
		return false;
		}
	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
		public static int indexOfTarget(int[] nums, int target){
			for(int i = 0; i < nums.length -1; i++) {
				if (nums[i] == target) {
					return i;
				} 
			}
			return -1;
		}

	
	
	/*
	 * return the min value in a 2D array
	 */
		public static int min(int[][] nums) {
			int min = nums[0][0];
			for(int r = 0; r < nums.length; r++) {
				for(int c = 0; c < nums[0].length; c++) {
					if(nums[r][c] < min) {
						min = nums[r][c];
					}
				}
			}
			return min;
		}

	
	
	
	/*
	 * return the max value in a 2D array
	 */
		public static int max(int[][] nums) {
			int max = nums[0][0];
			for(int r = 0; r < nums.length; r++) {
				for(int c = 0; c < nums[0].length; c++) {
					if(nums[r][c] > max) {
						max = nums[r][c];
					}
				}
			}
			return max;
		}

	
	
	
}
