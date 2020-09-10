/* Given 2 non-negative ints, a and b, return their sum, so long as the sum
has the same number of digits as a. If the sum has more digits than a, just
return a without b. */

public int sumLimit(int a, int b) {
  String input = String.valueOf(a);
  int length = input.length();
  String output = String.valueOf(a+b);
  int length2 = output.length();
  if (length2 > length) {
    return a;
  }
  return a+b;
}
