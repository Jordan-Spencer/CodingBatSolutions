/* Given 2 int values greater than 0, return whichever value is nearest to 21
without going over. Return 0 if they both go over. */

public int blackjack(int a, int b) {
  int diffA = 21 - a;
	int diffB = 21 - b;
	if (a > 21 && b <= 21) {
		return b;
	}
	else if (b > 21 && a <= 21) {
		return a;
	}
	else if (b <= 21 && a <= 21) {
		if (diffA < diffB) {
			return a;
		}
		return b;
	}
	return 0;
}
