/* A sandwich is two pieces of bread with something in between. Return the
string that is between the first and last appearance of "bread" in the given
string, or return the empty string "" if there are not two pieces of bread. */

public String getSandwich(String str) {
  int breadCount = 0;
  String sandwich = "";
  for (int i = 0; i+5 <= str.length(); i++) {
    if (str.substring(i, i+5).equals("bread")) {
      breadCount++;
      if (breadCount >= 2 && i+10 > str.length()) {
        return sandwich;
      }
      if (breadCount == 1) {
        i = i+4;
      }
      else if (breadCount > 1 && i+6 < str.length()) {
        sandwich += str.charAt(i);
      }
    }
    else if (breadCount > 0) {
      sandwich += str.charAt(i);
    }
  }
  return sandwich;
}
