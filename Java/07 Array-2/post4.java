/* Given a non-empty array of ints, return a new array containing the elements
from the original array that come after the last 4 in the original array. The
original array will contain at least one 4. */

public int[] post4(int[] nums) {
  int lastFourPosition = -1;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      lastFourPosition = i;
    }
  }
  int[] output = new int[nums.length - lastFourPosition-1];
  for (int i = 0; i<output.length; i++) {
    output[i] = nums[i+lastFourPosition+1];
  }
  return output;
}
