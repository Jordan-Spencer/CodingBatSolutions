/* Given a string, if the string "del" appears
starting at index 1, return a string where that
"del" has been deleted. Otherwise, return the
string unchanged. */

public String delDel(String str) {
  String result = "";
  if (str.length() < 3) {
    return str;
  }
  else if (str.charAt(1) == 'd' && str.charAt(2) == 'e' && str.charAt(3) == 'l') {
    result = str.substring(0, 1) + str.substring(4, str.length());
    return result;
  }
  else {
    return str;
  }
}
