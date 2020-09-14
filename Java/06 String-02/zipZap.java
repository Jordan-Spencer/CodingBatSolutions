/* Look for patterns like "zip" and "zap" in the string -- length-3,
starting with 'z' and ending with 'p'. Return a string where for all
such words, the middle letter is gone, so "zipXzap" yields "zpXzp". */

public String zipZap(String str) {
  String zp = "";
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'z') {
      zp += str.charAt(i);
      if (i+2 < str.length() && str.charAt(i+2) == 'p') {
        zp += str.charAt(i+2);
        i += 2;
      }
    }
    else {
      zp += str.charAt(i);
    }
  }
  return zp;
}
