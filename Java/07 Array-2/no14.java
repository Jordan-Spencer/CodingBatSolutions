/* Given an array of ints, return true if it contains no 1's or it
contains no 4's. */

public boolean no14(int[] nums) {
  boolean fours = false;
  boolean ones = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      ones = true;
    }
    else if (nums[i] == 4) {
      fours = true;
    }
  }
  if (fours == true && ones == true) {
    return false;
  }
  return true;
}
