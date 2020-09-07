/* We'll say that a number is "teen" if it is in the
range 13..19 inclusive. Given 2 int values, return
true if one or the other is teen, but not both. */

public boolean loneTeen(int a, int b) {
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  if (aTeen == true && bTeen ==true) {
    return false;
  }
  else if ((aTeen == true && bTeen == false) || (aTeen == false && bTeen == true)) {
    return true;
  }
  else {
    return false;
  }
}
