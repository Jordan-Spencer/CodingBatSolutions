/* Given a string, return true if the string starts
 with "hi" and false otherwise. */

public boolean startHi(String str) {
  if (str.length() >= 2) {
  String firstTwo = str.substring(0, 2);
  if (firstTwo.equals("hi")) {
    return true;
  }
  else {
    return false;
  }
  }
  else {
    return false;
  }
}
