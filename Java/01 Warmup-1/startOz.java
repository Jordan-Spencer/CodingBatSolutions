/* Given a string, return a string made of the first
2 chars (if present), however include first char
only if it is 'o' and include the second only if
it is 'z', so "ozymandias" yields "oz". */

public String startOz(String str) {
  if (str.length() < 3) {
    return str;
  }
  else {
    if (str.charAt(0) == 'o') {
      if (str.charAt(1) == 'z') {
        return str.substring(0,2);
      }
      else {
        return str.substring(0,1);
      }
    }
    else if (str.charAt(1) == 'z') {
      return str.substring(1,2);
    }
    else {
      return "";
    }
  }
}
