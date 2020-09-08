/* Given 2 strings, a and b, return a new string made of
the first char of a and the last char of b, so "yo" and
"java" yields "ya". If either string is length 0, use '@'
for its missing char. */

public String lastChars(String a, String b) {
  String firstLast = "";
  if (a.length() > 0 && b.length() > 0) {
    firstLast += a.charAt(0);
    firstLast += b.charAt(b.length()-1);
  }
  else {
    if (a.length() == 0) {
      firstLast += "@";
    }
    else if (a.length() >0) {
      firstLast += a.charAt(0);
    }
    if (b.length() == 0) {
      firstLast += "@";
    }
    else if (b.length() >0) {
      firstLast += b.charAt(b.length()-1);
    }
  }
  return firstLast;
}
