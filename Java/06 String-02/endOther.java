/* Given two strings, return true if either of the strings appears at the
very end of the other string, ignoring upper/lower case differences (in
other words, the computation should not be "case sensitive"). */

public boolean endOther(String a, String b) {
  String lowA = a.toLowerCase();
  String lowB = b.toLowerCase();
  if (lowA.equals(lowB)) {
    return true;
  }
  if (a.length() > b.length()) {
    return lowA.substring((a.length()-b.length()), a.length()).equals(lowB);
    }
  else {
    return lowB.substring((b.length()-a.length()), b.length()).equals(lowA);
  }
}
