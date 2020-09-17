/* Given an array of ints, return true if every 2 that appears in the array is
next to another 2. */

public boolean twoTwo(int[] nums) {
  boolean hasTwo = false;
  boolean hasPair = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      hasTwo = true;
      if ((i+1 < nums.length && nums[i+1] == 2) || (i-1 >=0 && nums[i-1] == 2)) {
        hasPair = true;
      }
      else {
        hasPair = false;
      }
    }
  }
  return !hasTwo || hasPair;
}
