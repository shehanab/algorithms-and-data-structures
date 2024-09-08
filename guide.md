Here's a concise guide to help you polish up your knowledge of important data structures and collections in Java 8. This guide focuses on key points, common usage scenarios, and some nuances specific to Java 8.

### 1. **Arrays**
- **Fixed Size**: Once initialized, the size of an array cannot change.
- **Access**: Direct access via index makes it fast (O(1) for reading/writing).
- **Usage**: Best for storing a fixed number of elements when you know the size in advance.

### 2. **ArrayList**
- **Dynamic Size**: Resizable array, grows automatically as you add elements.
- **Access Time**: O(1) for getting or setting elements by index.
- **Insertions/Deletions**: O(n) in the worst case, due to potential resizing or shifting.
- **Usage**: Ideal for lists that require frequent random access and occasional insertions/removals.

### 3. **LinkedList**
- **Doubly Linked List**: Each element points to its previous and next elements.
- **Access Time**: O(n) for getting an element by index.
- **Insertions/Deletions**: O(1) for adding/removing at the beginning or end, O(n) elsewhere.
- **Usage**: Suitable for scenarios where you need constant-time insertions or deletions at the cost of slower access.

### 4. **HashMap**
- **Key-Value Pairs**: Stores data in key-value pairs; keys must be unique.
- **Access Time**: O(1) for put/get operations in the average case.
- **Collisions**: Handled using chaining (linked lists within the bucket) or probing.
- **Load Factor**: Default load factor is 0.75, which balances time and space complexity.
- **Usage**: Ideal for situations requiring quick lookups by key.

### 5. **TreeMap**
- **Sorted Order**: Keys are stored in a Red-Black Tree, maintaining natural or custom order.
- **Access Time**: O(log n) for get, put, and remove operations.
- **Usage**: Useful when you need sorted key-value pairs and efficient range queries.

### 6. **HashSet**
- **Unique Elements**: Stores unique elements with no duplicates allowed.
- **Underlying Structure**: Backed by a HashMap, with elements being keys.
- **Access Time**: O(1) for add, remove, and contains operations in the average case.
- **Usage**: Suitable when the uniqueness of elements is required without any specific order.

### 7. **TreeSet**
- **Sorted Order**: Like TreeMap, TreeSet maintains elements in a sorted order using a Red-Black Tree.
- **Access Time**: O(log n) for add, remove, and contains operations.
- **Usage**: Ideal for scenarios where you need a sorted set of elements.

### 8. **PriorityQueue**
- **Heap Implementation**: Typically implemented as a binary heap.
- **Natural Ordering**: Elements are ordered according to their natural ordering or by a comparator provided at the time of construction.
- **Operations**: O(log n) for insertion and removal.
- **Usage**: Suitable for tasks like scheduling where you need access to the smallest (or largest) element.

### 9. **Deque (ArrayDeque and LinkedList)**
- **Double-Ended Queue**: Allows insertion and removal of elements from both ends.
- **ArrayDeque**: Faster than LinkedList for most cases; doesn’t allow null elements.
- **LinkedList**: Deque implementation that can be used when you need a LinkedList’s benefits.
- **Usage**: Useful for implementing stacks and queues, especially when both operations at the head and tail are needed.

### 10. **Stack**
- **LIFO (Last In First Out)**: Supports push, pop, peek operations.
- **Legacy Class**: While still widely used, consider using `Deque` (specifically `ArrayDeque`) for stack operations instead, due to better performance.
- **Usage**: Best for situations requiring last-in-first-out order.

### 11. **Queue**
- **FIFO (First In First Out)**: Main operations are `add` (or `offer`), `remove` (or `poll`), and `peek`.
- **Implementations**: `LinkedList`, `PriorityQueue`, `ArrayDeque`.
- **Usage**: Useful in scenarios like task scheduling or handling requests in the order they arrive.

### 12. **Concurrent Collections (Java.util.concurrent)**
- **ConcurrentHashMap**: Thread-safe version of HashMap, designed for highly concurrent environments.
    - **Segmented Locks**: Reduces lock contention compared to `Hashtable`.
- **CopyOnWriteArrayList/CopyOnWriteArraySet**: Thread-safe collections where all mutative operations result in a new copy of the underlying array.
    - **Usage**: Ideal for cases where reads are frequent and modifications are rare.
- **BlockingQueue**: Supports operations that wait for the queue to become non-empty/full when retrieving/adding an element.
    - **Usage**: Common in producer-consumer scenarios.

### 13. **Iterable and Stream API**
- **Iterable Interface**: Implemented by all collection classes. Provides an iterator to traverse the collection.
- **Stream API**: Introduced in Java 8, allows functional-style operations on streams of elements.
    - **Key Methods**: `filter`, `map`, `reduce`, `collect`, `forEach`.
    - **Parallel Streams**: Leverage multi-core architectures for parallel processing.

### 14. **Common Algorithms and Practices**
- **Sorting**: `Collections.sort(List)` or `List.sort(Comparator)` for in-place sorting.
- **Searching**: `Collections.binarySearch(List, key)` for binary search (requires sorted list).
- **Equals and HashCode**: Always override `equals()` and `hashCode()` when using objects as keys in a `HashMap` or elements in a `HashSet`.

### 15. **Performance Considerations**
- **Memory Overhead**: Choose the right data structure based on memory constraints (e.g., LinkedList vs. ArrayList).
- **Access Patterns**: Consider typical operations (e.g., random access vs. sequential) to choose between different collections.
- **Thread Safety**: For multi-threaded environments, prefer `ConcurrentHashMap`, `CopyOnWriteArrayList`, or `synchronized` wrappers.

This guide should provide you with a solid foundation for your pair programming interview. Focus on understanding the trade-offs and typical use cases for each data structure, and you'll be well-prepared. Good luck!




Here’s a list of common methods from important Java utility classes like the `Math` and `String` classes, along with other useful classes that you'll likely use during problem-solving. Familiarizing yourself with these methods will help you solve common problems more efficiently.

---

### **1. Math Class**

The `Math` class contains methods for performing basic numeric operations.

- **abs(int a)**: Returns the absolute value of an `int`.
- **abs(double a)**: Returns the absolute value of a `double`.
- **max(int a, int b)**: Returns the greater of two `int` values.
- **min(int a, int b)**: Returns the smaller of two `int` values.
- **pow(double a, double b)**: Returns the value of the first argument raised to the power of the second.
- **sqrt(double a)**: Returns the correctly rounded positive square root of a `double` value.
- **cbrt(double a)**: Returns the cube root of a `double` value.
- **round(double a)**: Rounds the value of a `double` to the nearest `long`.
- **ceil(double a)**: Returns the smallest `double` value that is greater than or equal to the argument and is equal to a mathematical integer.
- **floor(double a)**: Returns the largest `double` value that is less than or equal to the argument and is equal to a mathematical integer.
- **random()**: Returns a `double` value between 0.0 and 1.0.
- **log(double a)**: Returns the natural logarithm (base `e`) of a value.
- **log10(double a)**: Returns the base 10 logarithm of a value.
- **sin(double a), cos(double a), tan(double a)**: Trigonometric functions for sine, cosine, and tangent, respectively.
- **toRadians(double angdeg)**: Converts degrees to radians.
- **toDegrees(double angrad)**: Converts radians to degrees.
- **signum(double a)**: Returns the sign of a value (-1.0, 0.0, or 1.0).

### **2. String Class**

The `String` class represents character strings.

- **charAt(int index)**: Returns the character at the specified index.
- **length()**: Returns the length of the string.
- **substring(int beginIndex, int endIndex)**: Returns a substring starting from `beginIndex` and ending at `endIndex` (exclusive).
- **substring(int beginIndex)**: Returns a substring starting from `beginIndex` to the end.
- **indexOf(String str)**: Returns the index of the first occurrence of a substring.
- **lastIndexOf(String str)**: Returns the index of the last occurrence of a substring.
- **equals(Object obj)**: Compares two strings for equality.
- **equalsIgnoreCase(String anotherString)**: Compares two strings, ignoring case considerations.
- **startsWith(String prefix)**: Tests if the string starts with the specified prefix.
- **endsWith(String suffix)**: Tests if the string ends with the specified suffix.
- **toLowerCase()**: Converts all characters in the string to lowercase.
- **toUpperCase()**: Converts all characters in the string to uppercase.
- **trim()**: Removes leading and trailing whitespace from the string.
- **replace(CharSequence target, CharSequence replacement)**: Replaces occurrences of `target` with `replacement`.
- **split(String regex)**: Splits the string around matches of the given regular expression.
- **contains(CharSequence s)**: Returns true if the string contains the specified sequence of char values.
- **isEmpty()**: Returns `true` if the string is empty (i.e., its length is 0).
- **matches(String regex)**: Tells whether the string matches the given regular expression.
- **compareTo(String anotherString)**: Compares two strings lexicographically.
- **concat(String str)**: Concatenates the specified string to the end of this string.

### **3. StringBuilder/StringBuffer Class**

These classes are used to create mutable (modifiable) strings.

- **append(String str)**: Appends the specified string to this sequence.
- **insert(int offset, String str)**: Inserts the string at the specified offset.
- **delete(int start, int end)**: Removes the characters in the substring from `start` to `end`.
- **reverse()**: Reverses the sequence of characters.
- **setCharAt(int index, char ch)**: Sets the character at the specified index to the given character.
- **toString()**: Returns a string representing the data in the builder.

### **4. Arrays Class**

The `Arrays` class provides methods to work with arrays.

- **sort(int[] a)**: Sorts the specified array of `int` in ascending order.
- **sort(int[] a, int fromIndex, int toIndex)**: Sorts a range of the array.
- **binarySearch(int[] a, int key)**: Searches the array for the specified key using the binary search algorithm.
- **fill(int[] a, int val)**: Assigns the specified value to each element of the specified array.
- **equals(int[] a, int[] b)**: Compares two arrays for equality.
- **toString(int[] a)**: Returns a string representation of the array.
- **copyOf(int[] original, int newLength)**: Copies the specified array, truncating or padding with zeros to obtain the specified length.
- **copyOfRange(int[] original, int from, int to)**: Copies the specified range from the original array.

### **5. Collections Class**

The `Collections` class provides methods to work with collections like `List`, `Set`, and `Map`.

- **sort(List<T> list)**: Sorts the specified list into ascending order.
- **reverse(List<?> list)**: Reverses the order of the elements in the specified list.
- **shuffle(List<?> list)**: Randomly permutes the elements in the list.
- **binarySearch(List<? extends Comparable<? super T>> list, T key)**: Searches the list for the specified key using the binary search algorithm.
- **max(Collection<? extends T> coll)**: Returns the maximum element of the given collection.
- **min(Collection<? extends T> coll)**: Returns the minimum element of the given collection.
- **frequency(Collection<?> c, Object o)**: Returns the number of occurrences of the specified element in the collection.
- **swap(List<?> list, int i, int j)**: Swaps the elements at the specified positions in the list.

### **6. Character Class**

The `Character` class wraps a value of the primitive type `char`.

- **isLetter(char ch)**: Determines if the specified character is a letter.
- **isDigit(char ch)**: Determines if the specified character is a digit.
- **isWhitespace(char ch)**: Determines if the specified character is white space.
- **isUpperCase(char ch)**: Determines if the specified character is uppercase.
- **isLowerCase(char ch)**: Determines if the specified character is lowercase.
- **toUpperCase(char ch)**: Converts the character to uppercase.
- **toLowerCase(char ch)**: Converts the character to lowercase.
- **isAlphabetic(int codePoint)**: Determines if the specified character (Unicode code point) is alphabetic.

### **7. Optional Class (Java 8)**

The `Optional` class is used to avoid `null` pointer exceptions by representing a value that may be present or absent.

- **of(T value)**: Returns an `Optional` with the specified non-null value.
- **ofNullable(T value)**: Returns an `Optional` describing the specified value, or an empty `Optional` if the value is `null`.
- **empty()**: Returns an empty `Optional` instance.
- **isPresent()**: Returns `true` if a value is present, otherwise `false`.
- **get()**: Returns the value if present, otherwise throws `NoSuchElementException`.
- **orElse(T other)**: Returns the value if present, otherwise returns `other`.
- **orElseGet(Supplier<? extends T> other)**: Returns the value if present, otherwise invokes the `Supplier` and returns its result.
- **ifPresent(Consumer<? super T> action)**: If a value is present, performs the given action with the value.

---

These methods from key utility classes in Java will be highly useful for common problem-solving scenarios. Make sure to practice them to gain speed and accuracy during your interview!






Here’s a list of common tricks and patterns frequently used in solving algorithmic problems. These tricks span across data structure usage, mathematical operations, and programming techniques, and are essential to improve your efficiency and problem-solving skills.

### **1. Sliding Window Technique**
- **Usage**: This technique is used for problems involving contiguous subarrays or substrings, especially when you need to calculate something over every possible subarray of size `k`.
- **Common Problems**: Finding the maximum sum of a subarray of fixed size, longest substring with at most `k` distinct characters, etc.
- **How it Works**:
    - Maintain a window (subarray/substring) of fixed size or a dynamic window size.
    - Move the window across the array by adding the next element and removing the element left behind.
    - This helps reduce the time complexity from O(n²) to O(n).
- **Example**: Maximum sum of `k` consecutive elements in an array.
  ```java
  int maxSum(int[] arr, int k) {
      int windowSum = 0, maxSum = 0;
      for (int i = 0; i < k; i++)
          windowSum += arr[i];
      for (int i = k; i < arr.length; i++) {
          windowSum += arr[i] - arr[i - k];
          maxSum = Math.max(maxSum, windowSum);
      }
      return maxSum;
  }
  ```

### **2. Two-Pointer Technique**
- **Usage**: This is commonly used to solve problems involving searching pairs or subarrays, often applied when working with sorted arrays.
- **Common Problems**: Finding pairs in sorted arrays, three-sum, palindrome checks, container with most water.
- **How it Works**:
    - Initialize two pointers, usually at the beginning and end of an array.
    - Adjust the pointers based on certain conditions.
    - Efficiently narrows down the problem scope to reduce complexity from O(n²) to O(n).
- **Example**: Find if a sorted array has two numbers that sum up to a target.
  ```java
  boolean twoSum(int[] arr, int target) {
      int left = 0, right = arr.length - 1;
      while (left < right) {
          int sum = arr[left] + arr[right];
          if (sum == target) return true;
          else if (sum < target) left++;
          else right--;
      }
      return false;
  }
  ```

### **3. Hashing**
- **Usage**: Hash maps or hash sets are used to solve problems requiring quick lookups, especially when finding pairs, duplicates, or frequencies.
- **Common Problems**: Two-sum problem, finding duplicates, checking if an array contains elements that sum up to a value.
- **How it Works**:
    - Use a `HashMap` or `HashSet` to store elements and then check for conditions in constant time O(1).
    - Great for replacing O(n²) brute force solutions with O(n).
- **Example**: Two-sum problem using a `HashMap`:
  ```java
  boolean twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int num : nums) {
          if (map.containsKey(target - num)) return true;
          map.put(num, 1);
      }
      return false;
  }
  ```

### **4. Fast Exponentiation (Exponentiation by Squaring)**
- **Usage**: Used to calculate large powers of numbers efficiently, especially in problems involving modular arithmetic.
- **Common Problems**: Modular exponentiation, calculating large Fibonacci numbers, etc.
- **How it Works**:
    - Instead of multiplying the base `x` `n` times, recursively reduce the exponent by dividing it by 2 and squaring the base, giving a time complexity of O(log n).
- **Example**:
  ```java
  long power(long x, long n) {
      if (n == 0) return 1;
      long half = power(x, n / 2);
      if (n % 2 == 0) return half * half;
      else return half * half * x;
  }
  ```

### **5. Prefix Sum / Cumulative Sum**
- **Usage**: Allows quick calculation of subarray sums by precomputing cumulative sums.
- **Common Problems**: Range sum queries, subarrays with a given sum, difference array problems.
- **How it Works**:
    - Create a prefix sum array where each element at index `i` stores the sum of elements from the start of the array to `i`.
    - Any subarray sum from index `i` to `j` can be calculated in constant time as `prefix[j] - prefix[i - 1]`.
- **Example**: Range sum in constant time:
  ```java
  int rangeSum(int[] arr, int i, int j) {
      int[] prefixSum = new int[arr.length];
      prefixSum[0] = arr[0];
      for (int k = 1; k < arr.length; k++)
          prefixSum[k] = prefixSum[k - 1] + arr[k];
      return prefixSum[j] - (i > 0 ? prefixSum[i - 1] : 0);
  }
  ```

### **6. Greedy Algorithms**
- **Usage**: Greedy algorithms are used when making a locally optimal choice at each stage leads to a globally optimal solution.
- **Common Problems**: Activity selection, minimum number of coins, fractional knapsack, interval scheduling.
- **How it Works**:
    - Choose the best option at the current step, and assume that this choice leads to the optimal solution.
- **Example**: Activity selection problem (maximize number of activities):
  ```java
  int activitySelection(int[] start, int[] end) {
      int n = start.length, count = 1;
      int i = 0;
      for (int j = 1; j < n; j++) {
          if (start[j] >= end[i]) {
              count++;
              i = j;
          }
      }
      return count;
  }
  ```

### **7. Backtracking**
- **Usage**: Backtracking is used to solve problems where you need to explore all possible solutions, but abandon partial solutions that are not feasible.
- **Common Problems**: N-Queens, solving mazes, subset sum, generating all permutations or combinations.
- **How it Works**:
    - Try building a solution step by step, and recursively explore all options.
    - If a partial solution cannot possibly lead to a valid solution, backtrack and try a different path.
- **Example**: N-Queens problem.
  ```java
  void solveNQueens(int[][] board, int col) {
      if (col == board.length) printSolution(board);
      for (int i = 0; i < board.length; i++) {
          if (isSafe(board, i, col)) {
              board[i][col] = 1;
              solveNQueens(board, col + 1);
              board[i][col] = 0;
          }
      }
  }
  ```

### **8. Dynamic Programming (DP)**
- **Usage**: DP is used to solve problems that can be broken down into overlapping subproblems, where the solution to a problem depends on the solution to subproblems.
- **Common Problems**: Fibonacci, longest increasing subsequence, knapsack problem, coin change problem.
- **How it Works**:
    - Break down the problem into smaller subproblems and store the results of the subproblems to avoid recalculating them.
    - It transforms exponential-time problems into polynomial time.
- **Example**: Fibonacci sequence using DP:
  ```java
  int fibonacci(int n) {
      int[] dp = new int[n + 1];
      dp[0] = 0; dp[1] = 1;
      for (int i = 2; i <= n; i++)
          dp[i] = dp[i - 1] + dp[i - 2];
      return dp[n];
  }
  ```

### **9. Bit Manipulation**
- **Usage**: Bit manipulation techniques are used in problems involving sets, binary representation, and optimization problems.
- **Common Problems**: Checking if a number is even/odd, finding subsets, counting set bits, XOR problems.
- **How it Works**:
    - Use bitwise operations like AND, OR, XOR, and shifts to manipulate bits efficiently.
    - Helps solve problems in constant time O(1) for tasks that involve bits.
- **Example**: Checking if a number is a power of two:
  ```java
  boolean isPowerOfTwo(int n) {
      return n > 0 && (n & (n - 1)) == 0;
  }
  ```

### **10. Union-Find (Disjoint Set)**
- **Usage**: Union-Find is used to keep track of elements that are partitioned into disjoint sets. It’s widely used in graph-related problems.
- **Common Problems**: Cycle detection in graphs, connected components, Kruskal's MST algorithm.
- **How it Works**:
    - Use two main operations: `find` (to find the representative of a set) and `union` (to merge two sets).
    - Optimization techniques include "path compression" and "union by