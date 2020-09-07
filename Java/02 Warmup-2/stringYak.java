/* Suppose the string "yak" is unlucky. Given a
string, return a version where all the "yak" are
removed, but the "a" can be any char. The "yak"
strings will not overlap. */

public String stringYak(String str) {
  String noYak = "";
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) != 'y') {
      noYak += str.charAt(i);
      }
    else if (i+2 < str.length() && str.charAt(i+2) == 'k') {
        i += 2;
      }
    else {
      noYak += str.charAt(i);
      }
    }
  return noYak;
}
