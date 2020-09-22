/* We'll say that an element in an array is "alone" if there are values before
and after it, and those values are different from it. Return a version of the
given array where every instance of the given value which is alone is replaced
by whichever value to its left or right is larger. */

public int[] notAlone(int[] nums, int val) {
  int left = 0;
  int right = 0;
  if (nums.length < 3) {
    return nums;
  }
  for (int i = 1; i < nums.length-1; i++) {
    if (nums[i] == val) {
      if (i-1 >= 0 && i+1 < nums.length) {
        left = nums[i-1];
        right = nums[i+1];
      }
      if (right > left) {
        nums[i] = right;
        i++;
      }
      else {
        nums[i] = left;
        i++;
      }
    }
    }
  return nums;
}
