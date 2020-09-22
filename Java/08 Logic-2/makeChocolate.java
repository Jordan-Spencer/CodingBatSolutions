/* We want make a package of goal kilos of chocolate. We have small bars (1 kilo
each) and big bars (5 kilos each). Return the number of small bars to use,
assuming we always use big bars before small bars. Return -1 if it can't be done. */

public int makeChocolate(int small, int big, int goal) {
  int smallsNeeded = 0;
  if (big * 5 <= goal) {
    smallsNeeded = goal - (big * 5);
  }
  else if (big * 5 > goal) {
    smallsNeeded = goal % 5;
  }
  if (smallsNeeded <= small) {
    return smallsNeeded;
  }
  return -1;
}
