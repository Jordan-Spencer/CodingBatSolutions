/* Given 2 int arrays, a and b, of any length, return
a new array with the first element of each array. If
either array is length 0, ignore that array. */

public int[] front11(int[] a, int[] b) {
  int[] two = new int[2];
 if (a.length > 0 && b.length > 0) {
   two[0] = a[0];
   two[1] = b[0];
   return two;
 }
 else if (a.length == 0 && b.length != 0) {
   int[] oneB = new int[1];
   oneB[0] = b[0];
   return oneB;
 }
 else if (b.length == 0 && a.length != 0) {
   int[] oneA = new int[1];
   oneA[0] = a[0];
   return oneA;
 }
 else if (a.length == 0 && b.length == 0) {
   return a;
  }
  return two;
}
