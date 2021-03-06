/* Given an array of ints, return true if the value 3 appears in the array
exactly 3 times, and no 3's are next to each other. */

public boolean haveThree(int[] nums) {
  int threeCount = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3) {
      if (i+1 >= nums.length || (nums[i+1] < nums.length && nums[i+1] != 3)) {
      threeCount++;
      }
    }
  }
  return threeCount == 3;
}
