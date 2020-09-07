/* Given two non-negative int values, return true if
they have the same last digit, such as with 27 and
57. Note that the % "mod" operator computes remainders,
so 17 % 10 is 7. */

public boolean lastDigit(int a, int b) {
  int lastA = 0;
  int lastB = 0;
  if (a < 0 || b < 0) {
    return false;
  }
  else {
    if (a < 10) {
      lastA = a;
    }
    else {
      lastA = a % 10;
    }
    if (b < 10) {
      lastB = b;
    }
    else {
      lastB = b % 10;
    }
  }
  if (lastA == lastB) {
    return true;
  }
  else {
    return false;
  }
}
