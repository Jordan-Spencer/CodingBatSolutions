/* Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring). */

public int last2(String str) {
  if (str.length() < 2) {
    return 0;
  }
  String lastTwo = "";
  int count = 0;
  lastTwo += str.charAt(str.length()-1) + str.charAt(str.length()-2);
  for (int i = 0; i < str.length()-2; i++) {
    if (str.charAt(i) == str.charAt(str.length()-2) && str.charAt(i+1) == str.charAt(str.length()-1)) {
      count++;
    }
  }
  return count;
}
