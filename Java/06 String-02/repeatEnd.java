/* Given a string and an int n, return a string made of n repetitions of
the last n characters of the string. You may assume that n is between 0
and the length of the string, inclusive. */

public String repeatEnd(String str, int n) {
  String repeat = "";
  if (n == 0) {
    return repeat;
  }
  for (int i = 0; i < n; i++) {
    repeat += str.substring(str.length()-n, str.length());
  }
  return repeat;
}
