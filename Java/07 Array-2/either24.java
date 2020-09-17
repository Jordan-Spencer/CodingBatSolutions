/* Given an array of ints, return true if the array contains a 2 next to a
2 or a 4 next to a 4, but not both. */

public boolean either24(int[] nums) {
  boolean twos = false;
  boolean fours = false;
  for (int i = 0; i+1 < nums.length; i++) {
    if (nums[i] == 2 && nums[i+1] == 2) {
      twos = true;
      i++;
    }
    else if (nums[i] == 4 && nums[i+1] == 4) {
      fours = true;
      i++;
    }
  }
  if (twos == fours) {
    return false;
  }
    return true;
}
