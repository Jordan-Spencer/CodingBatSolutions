/* Given an array of ints of even length, return a new
array length 2 containing the middle two elements from
the original array. The original array will be length
2 or more. */

public int[] makeMiddle(int[] nums) {
  int mid = nums.length / 2;
  int[] mids = new int[2];
  mids[0] = nums[mid-1];
  mids[1] = nums[mid];
  return mids;
}
