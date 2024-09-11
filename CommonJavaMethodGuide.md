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

