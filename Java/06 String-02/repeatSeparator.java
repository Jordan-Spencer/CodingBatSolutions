/* Given two strings, word and a separator sep, return a big string made of
count occurrences of the word, separated by the separator string. */

public String repeatSeparator(String word, String sep, int count) {
  String repeat = "";
  if (count == 0) {
    return repeat;
  }
  for (int i = count-1; i > 0; i--) {
    repeat = repeat + word + sep;
  }
  repeat = repeat + word;
  return repeat;
}
