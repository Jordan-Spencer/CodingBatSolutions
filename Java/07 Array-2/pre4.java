/* Given a non-empty array of ints, return a new array containing the elements
from the original array that come before the first 4 in the original array. The
original array will contain at least one 4. */

public int[] pre4(int[] nums) {
  int fourPosition = -1;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      fourPosition = i;
      break;
    }
  }
  int[] output = new int[fourPosition];
  for (int i = 0; i < output.length; i++) {
    output[i] = nums[i];
  }
  return output;
}
