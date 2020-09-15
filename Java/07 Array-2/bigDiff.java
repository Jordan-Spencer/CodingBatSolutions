/* Given an array length 1 or more of ints, return the difference between
the largest and smallest values in the array. */

public int bigDiff(int[] nums) {
  int hi = nums[0];
  int lo = nums[0];
  for (int i = 1; i < nums.length; i++) {
    hi = Math.max(hi, nums[i]);
    lo = Math.min(lo, nums[i]);
  }
  return hi-lo;
}
