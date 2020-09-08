/* Given a string, return true if it ends in "ly". */

public boolean endsLy(String str) {
  if (str.length() < 2) {
    return false;
  }
  if (str.charAt(str.length()-1) == 'y' && str.charAt(str.length()-2) == 'l') {
    return true;
  }
  return false;
}
