/* Given 2 int arrays, each length 2, return a new array
length 4 containing all their elements. */

public int[] plusTwo(int[] a, int[] b) {
  int[] newAr = new int[4];
  newAr[0] = a[0];
  newAr[1] = a[1];
  newAr[2] = b[0];
  newAr[3] = b[1];
  return newAr;
}
