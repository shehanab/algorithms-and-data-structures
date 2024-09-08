### Problem Statement:
Given a binary string `S` consisting of only `0`s and `1`s, write an algorithm to find the number of different ways to get the longest consecutive subsegment of `1`s only. You are allowed to change any `K` number of `0`s to `1`s. If two ways lead to the same string, they are considered similar, not different.

### Input:
- The first line of the input consists of the string `S`.
- The second line consists of an integer `changeK`, representing the number of changes you can make (`K`).

### Output:
Print an integer representing the number of different ways possible to get the longest consecutive subsegment of `1`s.

### Constraints:
- `1 ≤ size of string ≤ 2 * 10^5`
- `0 ≤ changeK ≤ size`

### Example:

#### Input:
```
1010101
1
```

#### Output:
```
3
```

#### Explanation:
Since only one change is allowed, the different combinations possible are `1110101`, `1011101`, and `1010111`. In all the possible combinations, the maximum sequence of consecutive `1`s is in `1011101`, i.e., `111`. So, there are `3` different ways to achieve the longest consecutive subsegment of `1`s.