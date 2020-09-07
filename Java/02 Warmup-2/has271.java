/* Given an array of ints, return true if it contains a
2, 7, 1 pattern: a value, followed by the value plus 5,
followed by the value minus 1. Additionally the 271 counts
even if the "1" differs by 2 or less from the correct value. */

public boolean has271(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (i + 2 < nums.length) {
      if (nums[i+1] == nums[i]+5) {
        int correct1 = nums[i] - 1;
        if ((nums[i+2]-correct1 <= 2 && nums[i+2]-correct1>=0) || (correct1-nums[i+2] <=2 && correct1-nums[i+2]>=0)) {
          return true;
          }
        }
      }
    }
  return false;
}
