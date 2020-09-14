/* Return a version of the given string, where for every star (*) in the
string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad". */

public String starOut(String str) {
  String noStars = "";
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) != '*') {
      if (i+1 < str.length() && str.charAt(i+1) == '*') {
        i+=2;
      }
      else if (i-1 >= 0 && str.charAt(i-1) == '*') {
        if (i+2 < str.length()) {
        }
      }
      else {
      noStars += str.charAt(i);
      }
    }
    else {
      i++;
    }
  }
  return noStars;
}
