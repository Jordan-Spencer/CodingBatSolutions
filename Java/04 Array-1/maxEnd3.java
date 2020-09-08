/* Given an array of ints length 3, figure out which is
larger, the first or last element in the array, and set
all the other elements to be that value. Return the
changed array. */

public int[] maxEnd3(int[] nums) {
  if (nums[0] > nums[nums.length-1]) {
    nums[1] = nums[0];
    nums[2] = nums[0];
  }
  else if (nums[0] < nums[nums.length-1]) {
    nums[0] = nums[2];
    nums[1] = nums[2];
  }
  else if (nums[0] == nums[2]) {
    nums[1] = nums[0];
  }
  return nums;
}
