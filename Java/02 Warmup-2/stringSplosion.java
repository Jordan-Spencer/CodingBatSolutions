/* Given a non-empty string like "Code" return a string like "CCoCodCode". */

public String stringSplosion(String str) {
  String newString = "";
  String secondString = "";
  for (int i = 0; i < str.length(); i++) {
    secondString += str.charAt(i);
    newString += secondString;
  }
  return newString;
}
