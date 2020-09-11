/* Given two strings, a and b, create a bigger string made of the first
char of a, the first char of b, the second char of a, the second char of
b, and so on. Any leftover chars go at the end of the result. */

public String mixString(String a, String b) {
  String mixed = "";
  if (a.length() == b.length()) {
    for (int i=0; i < a.length(); i++) {
      mixed += a.charAt(i);
      mixed += b.charAt(i);
    }
  }
  if (a.length() > b.length()) {
    for (int i = 0; i < a.length(); i++) {
      mixed += a.charAt(i);
      if (i < b.length()) {
        mixed += b.charAt(i);
      }
    }
  }
  if (b.length() > a.length()) {
    for (int i = 0; i < b.length(); i++) {
      if (i < a.length()) {
        mixed += a.charAt(i);
      }
      mixed += b.charAt(i);
    }
  }
  return mixed;
}
