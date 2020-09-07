/* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". */

boolean doubleX(String str) {
  for (int i = 0; i+1 < str.length(); i++) {
    if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
      return true;
    }
    else if (str.charAt(i) == 'x' && str.charAt(i+1) != 'x') {
      return false;
    }
  }
  return false;
}
