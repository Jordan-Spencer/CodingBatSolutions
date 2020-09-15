/* Return the sum of the numbers in the array, returning 0 for an empty
array. Except the number 13 is very unlucky, so it does not count and
numbers that come immediately after a 13 also do not count. */

public int sum13(int[] nums) {
  if (nums.length == 0) {
    return 0;
  }
  int total = 0;

  for (int i = 0; i<nums.length; i++) {
    if (nums[i] == 13) {
      if (i+1<nums.length) {
        i++;
      }
      else if (i+1 >= nums.length) {
        return total;
      }
    }
    else {
      total += nums[i];
    }
  }
  return total;
}
