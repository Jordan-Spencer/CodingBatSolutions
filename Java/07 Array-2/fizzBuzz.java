/* This is slightly more difficult version of the famous FizzBuzz problem which
is sometimes given as a first problem for job interviews. Consider the series
of numbers beginning at start and running up to but not including end, so for
example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[]
array containing the string form of these numbers, except for multiples of 3,
use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for
multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will
make the String form of an int or other type. This version is a little more
complicated than the usual version since you have to allocate and index into an
array instead of just printing, and we vary the start/end instead of just always
doing 1..100. */

public String[] fizzBuzz(int start, int end) {
  String[] fizzBuzz = new String[end-start];
  int count = start;
  for (int i = 0; i < fizzBuzz.length; i++) {
    if (count % 3 == 0 && count % 5 == 0) {
      fizzBuzz[i] = "FizzBuzz";
      count++;
    }
    else if (count % 3 == 0) {
      fizzBuzz[i] = "Fizz";
      count++;
    }
    else if (count % 5 == 0) {
      fizzBuzz[i] = "Buzz";
      count++;
    }
    else {
      fizzBuzz[i] = String.valueOf(count);
      count++;
    }
  }
  return fizzBuzz;
}
