/* Given a string and an int n, return a string made of the first n
characters of the string, followed by the first n-1 characters of the
string, and so on. You may assume that n is between 0 and the length
of the string, inclusive (i.e. n >= 0 and n <= str.length()). */

public String repeatFront(String str, int n) {
  String repeat = "";
  if (n == 0) {
    return repeat;
  }
  for (int i = n; i >= 0; i--) {
    repeat += str.substring(0, i);
  }
  return repeat;
}
