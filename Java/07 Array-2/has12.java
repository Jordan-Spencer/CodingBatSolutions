/* Given an array of ints, return true if there is a 1 in the array with a
2 somewhere later in the array. */

public boolean has12(int[] nums) {
  boolean hasOne = false;
  boolean hasTwo = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      hasOne = true;
    }
    else if (nums[i] == 2 && hasOne == true) {
      hasTwo = true;
    }
  }
  return hasOne && hasTwo;
}
