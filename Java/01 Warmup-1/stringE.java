/* Return true if the given string contains between
1 and 3 'e' chars. */

public boolean stringE(String str) {
  int es = 0;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'e') {
      es++;
    }
    else {
      es += 0;
    }
  }
  if (es > 3 || es <= 0) {
    return false;
  }
  else {
    return true;
  }
}
