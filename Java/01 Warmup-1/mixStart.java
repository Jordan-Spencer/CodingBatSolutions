/* Return true if the given string begins with
"mix", except the 'm' can be anything, so "pix",
"9ix" .. all count. */

public boolean mixStart(String str) {
  if (str.length() > 2) {
  return str.charAt(1) == 'i' && str.charAt(2) == 'x';
  }
  else {
    return false;
  }
}
