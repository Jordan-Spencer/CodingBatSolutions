/* Given a string, return the string made of its
first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return
whatever there is, so "X" yields "X", and the empty
string "" yields the empty string "". Note that
str.length() returns the length of a string. */

public String firstTwo(String str) {
  String first2 = "";
  if (str.length() > 0) {
    first2 += str.charAt(0);
    }
  if (str.length() > 1) {
    first2 = first2 + str.charAt(1);
  }
  return first2;
}
