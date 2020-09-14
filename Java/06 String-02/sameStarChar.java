/* Returns true if for every '*' (star) in the string, if there are chars
both immediately before and after the star, they are the same. */

public boolean sameStarChar(String str) {
  if (str.length() < 3) {
    return true;
  }
  for (int i = 1; i+1 < str.length(); i++) {
    if (str.charAt(i) == '*') {
      if (str.charAt(i-1) == str.charAt(i+1)) {
        if (i+2 < str.length()) {
          if (str.charAt(i+2) == '*') {
            if (i+3 < str.length()) {
              if (str.charAt(i+3) == str.charAt(i+1)) {
                return true;
                }
              return false;
              }
            }
          }
      }
      else if (str.charAt(i-1) != str.charAt(i+1)) {
        return false;
      }
    }
  }
  return true;
}
