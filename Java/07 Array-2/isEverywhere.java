/* We'll say that a value is "everywhere" in an array if for every pair of
adjacent elements in the array, at least one of the pair is that value.
Return true if the given value is everywhere in the array. */

public boolean isEverywhere(int[] nums, int val) {
  boolean everywhere = false;
  if (nums.length < 2) {
    return true;
  }
  for (int i = 0; i+1 < nums.length; i++) {
    if (nums[i] == val || nums[i+1] == val) {
      everywhere = true;
    }
    else if (nums[i] != val && nums[i+1] != val) {
      return false;
    }
  }
  return everywhere;
}
