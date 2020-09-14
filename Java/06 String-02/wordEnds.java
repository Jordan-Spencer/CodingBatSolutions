/* Given a string and a non-empty word string, return a string made of each
char just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may
be included twice if it is between two words. */

public String wordEnds(String str, String word) {
  String ends = "";
  int wrdL = word.length();
  int strL = str.length();
  for (int i = 0; i < strL-wrdL+1; i++) {
    if (i>0 && str.substring(i, i+wrdL).equals(word)) {
      ends += str.charAt(i-1);
    }
    if (i < strL-wrdL && str.substring(i, i+wrdL).equals(word)) {
      ends += str.charAt(i+wrdL);
    }
  }
  return ends;
}
