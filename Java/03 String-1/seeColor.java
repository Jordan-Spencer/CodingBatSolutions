/* Given a string, if the string begins with "red" or "blue"
return that color string, otherwise return the empty string. */

public String seeColor(String str) {
  if (str.length() < 1) {
    return "";
  }
 if (str.charAt(0) == 'r' && str.length() >= 3) {
   if (str.charAt(1) == 'e' && str.charAt(2) == 'd') {
     return str.substring(0, 3);
   }
 }
 else if (str.charAt(0) == 'b' && str.length() >= 4) {
   if (str.charAt(1) == 'l' && str.charAt(2) == 'u' && str.charAt(3) == 'e') {
     return str.substring(0, 4);
   }
 }
   return "";
}
