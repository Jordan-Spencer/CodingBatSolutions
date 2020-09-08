/* Given a string, if the first or last chars are 'x',
return the string without those 'x' chars, and otherwise
return the string unchanged. */

public String withoutX(String str) {
 if (str.length() == 0) {
   return "";
 }
 if (str.charAt(0) == 'x') {
   if (str.charAt(str.length()-1) == 'x' && str.length() >1) {
     return str.substring(1, str.length()-1);
      }
   else {
     return str.substring(1, str.length());
      }
    }
 else if (str.charAt(str.length()-1) == 'x') {
  return str.substring(0, str.length()-1);
  }
 return str;
}
