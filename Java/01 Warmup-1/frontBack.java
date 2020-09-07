/* Given a string, return a new string where the first
and last chars have been exchanged. */

public String frontBack(String str) {
  String result = "";
  if (str.length() == 0) {
    return str;
  }
  else if (str.length() == 1) {
    return str;
  }
  else {
    char first = str.charAt(0);
    char last = str.charAt(str.length() - 1);
    result = last + str.substring(1, str.length() - 1) + first;
    return result;
  }
}
