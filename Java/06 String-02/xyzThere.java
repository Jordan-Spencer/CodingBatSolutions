/* Return true if the given string contains an appearance of "xyz" where the
xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz"
does not. */

public boolean xyzThere(String str) {
  for (int i = 0; i < str.length(); i++) {
    if (str.equals("xyz")) {
      return true;
    }
    else if (str.charAt(i) == 'x' && i+2 < str.length()) {
      if (str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z') {
          if (i == 0 || (i-1 >=0 && str.charAt(i-1) != '.')) {
            return true;
          }
        }
      }
    }
  return false;
}
