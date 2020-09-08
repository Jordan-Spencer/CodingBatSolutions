/* Given a string of any length, return a new string where the last
2 chars, if present, are swapped, so "coding" yields "codign". */

public String lastTwo(String str) {
  String swap2 = "";
  if (str.length() < 2) {
    return str;
  }
  else {
    swap2 = str.substring(0, str.length()-2);
    swap2 += str.charAt(str.length()-1);
    swap2 += str.charAt(str.length()-2);
  }
  return swap2;
}
