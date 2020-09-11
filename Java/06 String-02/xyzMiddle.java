/* Given a string, does "xyz" appear in the middle of the string? To define
middle, we'll say that the number of chars to the left and right of the "xyz"
must differ by at most one. This problem is harder than it looks. */

public boolean xyzMiddle(String str) {
  if (str.equals("xyz")) {
    return true;
  }
  for (int i = 0; i+3 <str.length(); i++) {
    if (str.substring(i, i+3).equals("xyz")) {
      int left = i;
      int right = str.length() - (i+3);
      if (Math.abs(left - right) < 2) {
        return true;
      }
    }
  }
  return false;
}
