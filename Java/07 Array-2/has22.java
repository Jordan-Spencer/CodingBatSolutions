/* Given an array of ints, return true if the array contains a 2 next to
a 2 somewhere. */

public boolean has22(int[] nums) {
  boolean nextdoor = false;
  for (int i = 0; i+1<nums.length; i++) {
    if (nums[i] == 2 && nums[i+1] == 2) {
      nextdoor = true;
    }
  }
  return nextdoor;
}
