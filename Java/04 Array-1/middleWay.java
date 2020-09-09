/* Given 2 int arrays, a and b, each length 3, return a
new array length 2 containing their middle elements. */

public int[] middleWay(int[] a, int[] b) {
  int[] middles;
  middles = new int[2];
  middles[0] = a[1];
  middles[1] = b[1];
  return middles;
}
