/* Return a version of the given array where each zero value in the array is
replaced by the largest odd value to the right of the zero in the array. If
there is no odd value to the right of the zero, leave the zero as a zero. */

public int[] zeroMax(int[] nums) {
  boolean hasZero = false;
  int hiOdd = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      for (int x = i+1; x < nums.length; x++) {
        if (nums[x] != 0) {
          if (nums[x] % 2 != 0 && nums[x] > hiOdd) {
            hiOdd = nums[x];
          }
        }
      }
      nums[i] = hiOdd;
      hiOdd = 0;
    }
  }
  return nums;
}
