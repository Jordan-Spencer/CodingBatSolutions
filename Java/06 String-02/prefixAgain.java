/* Given a string, consider the prefix string made of the first N chars of
the string. Does that prefix string appear somewhere else in the string? Assume
that the string is not empty and that N is in the range 1..str.length(). */

public boolean prefixAgain(String str, int n) {
  String sub = str.substring(0, n);
  if (str.length() == 1) {
    return false;
  }
  for (int i = 1; n+i <= str.length(); i++) {
    if (str.substring(i, n+i).equals(sub)) {
      return true;
    }
  }
  return false;
}
