/* Given a string, return a string made of the chars
at indexes 0,1, 4,5, 8,9 ... so "kittens" yields
"kien". */

public String altPairs(String str) {
  String altString = "";
  for (int i = 0; i < str.length(); i+=4) {
    altString += str.charAt(i);
    if (i+1 <str.length()) {
      altString += str.charAt(i+1);
    }
  }
  return altString;
}
