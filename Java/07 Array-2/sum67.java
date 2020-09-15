/* Return the sum of the numbers in the array, except ignore sections of
numbers starting with a 6 and extending to the next 7 (every 6 will be
followed by at least one 7). Return 0 for no numbers. */

public int sum67(int[] nums) {
  int total = 0;
  boolean sixhit = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 6) {
      sixhit = true;
    }
    else if (sixhit == true && nums[i] != 7) {
    }
    else if (sixhit == true && nums[i] == 7) {
      sixhit = false;
    }
    else {
      total += nums[i];
    }
  }
  return total;
}
