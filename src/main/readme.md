how java implements hash tables

My test was to implement an algorithm to find the element in a given array which returns the maximum standard deviation.

Find Binary GAP of zero between an integer for example integer 9 will be represented as 1001, so here binary gap of zero is 2 and so on



I was give a question to check Bitwise XOR of all the numbers between two integers

(like 5 and 8 are inputs the o/p should be 5 BitwiseXor 6 BitwiseXor 7 BitwiseXor 8).



37 << 3 == 37 * Math.pow(2,3) == 37 * 8

if(randInt & 1) ? odd : even.   checks the right most of randInt

XOR - https://en.wikipedia.org/wiki/Exclusive_or

Swapping without "temp"

Here's one of those brain-teasers that you can give to your CS friends. One of the classic problems any CS major should be able to solve is writing code to swap two numbers. Here's how it looks in C.
  temp = x ;
  x = y ;
  y = temp ;
To swap, you introduce a "temp" variable. Its name doesn't have to be "temp", but it is nevertheless an additional temporary variable.
Now ask your friend to solve this without using a temp variable. This means you can ONLY use x and y. This does NOT mean that you name the variable temp2.

How can you do this? If you're thinking "perhaps I can use bitwise XOR", you're right! If you're adventuresome, you can think about how to do this on your own, but if not, here's the answer.

  x = x ^ y ;
  y = x ^ y ;
  x = x ^ y ;
