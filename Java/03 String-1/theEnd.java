/* Given a string, return a string length 1 from
its front, unless front is false, in which case
return a string length 1 from its back. The string
will be non-empty. */

public String theEnd(String str, boolean front) {
  String end = "";
  if (front == false) {
    end += str.charAt(str.length()-1);
    return end;
  }
  else {
    end += str.charAt(0);
    return end;
  }
}
