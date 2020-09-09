/* Given an int array of any length, return a new
array of its first 2 elements. If the array is smaller
than length 2, use whatever elements are present. */

public int[] frontPiece(int[] nums) {
  int[] front = new int[2];
  if (nums.length < 2) {
    return nums;
  }
  else {
    front[0] = nums[0];
    front[1] = nums[1];
  }
  return front;
}
