/* Given an array of ints length 3, return a new
array with the elements in reverse order, so
{1, 2, 3} becomes {3, 2, 1}. */

public int[] reverse3(int[] nums) {
  int[] reverse;
  reverse = new int[3];
  reverse[0] = nums[2];
  reverse[1] = nums[1];
  reverse[2] = nums[0];
  return reverse;
}
