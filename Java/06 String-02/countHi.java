/* Return the number of times that the string "hi" appears
anywhere in the given string. */

public int countHi(String str) {
  int hiCount = 0;
  for (int i = 0; i < str.length()-1; i++) {
    if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
      hiCount++;
    }
  }
  return hiCount;
}
