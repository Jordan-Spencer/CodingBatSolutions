/* Given three int values, a b c, return the largest. */

public int intMax(int a, int b, int c) {
  int high;
  if (a > b) {
    high = a;
  }
  else {
    high = b;
  }
  if (c > high) {
    high = c;
    return high;
  }
  else {
    return high;
  }
}
