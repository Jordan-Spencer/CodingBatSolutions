/* Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between
small and medium is the same as the difference between medium and large. */

public boolean evenlySpaced(int a, int b, int c) {
  if (a == b && b == c && a == c) {
    return true;
  }
  if (a == b || b == c || a == c) {
    return false;
  }
  int diff1 = Math.abs(a-b);
	int diff2 = Math.abs(b-c);
	int diff3 = Math.abs(a-c);
	return (diff1 == diff2) || (diff1 == diff3) || (diff2 == diff3);
}
