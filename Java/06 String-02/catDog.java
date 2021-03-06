/* Return true if the string "cat" and "dog" appear the same number of times
in the given string. */

public boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  for (int i = 0; i < str.length()-2; i++) {
    if (str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g') {
      dogCount++;
    }
    else if (str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') {
      catCount++;
    }
  }
  if (catCount == dogCount) {
    return true;
  }
  return false;
}
