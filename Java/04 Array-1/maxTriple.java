/* Given an array of ints of odd length, look at the first,
last, and middle values in the array and return the largest.
The array length will be a least 1. */

public int maxTriple(int[] nums) {
  if (nums.length < 3) {
    if (nums.length == 2) {
      if (nums[0] > nums[1]) {
        return nums[0];
      }
      return nums[1];
      }
    }
  else {
    int first = nums[0];
    int mid = nums[nums.length / 2];
    int last = nums[nums.length -1];
    if (first > mid) {
      if (first > last) {
        return first;
      }
      if (last > first) {
        return last;
      }
    }
    if (mid > first) {
      if (mid > last) {
        return mid;
      }
      if (last > mid) {
        return last;
      }
    }
    }
    return 0;
  }
