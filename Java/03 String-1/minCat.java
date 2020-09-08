/* Given two strings, append them together (known as
"concatenation") and return the result. However, if
the strings are different lengths, omit chars from
the longer string so it is the same length as the
shorter string. So "Hello" and "Hi" yield "loHi".
The strings may be any length. */

public String minCat(String a, String b) {
  String cat = "";
  if (a.length() > b.length()) {
    cat += a.substring((a.length() - b.length()), a.length()) + b;
  }
  else if (b.length() > a.length()) {
    cat += a + b.substring((b.length() - a.length()), b.length());
  }
  else {
    return a + b;
  }
  return cat;
}
