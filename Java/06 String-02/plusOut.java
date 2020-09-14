/* Given a string and a non-empty word string, return a version of the
original String where all chars have been replaced by pluses ("+"), except
for appearances of the word string which are preserved unchanged. */

public String plusOut(String str, String word) {
  String plussed = "";
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == word.charAt(0) && str.substring(i, i+word.length()).equals(word)) {
        plussed += word;
        i += word.length()-1;
        }
    else {
      plussed += "+";
      }
    }
  return plussed;
}
