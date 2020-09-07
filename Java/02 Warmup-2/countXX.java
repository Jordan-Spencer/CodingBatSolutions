/* Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx"
contains 2 "xx". */

int countXX(String str) {
  int xCount = 0;
  for (int i = 0; i+1 < str.length(); i++) {
    if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
        xCount++;
    }
  }
  return xCount;
}
