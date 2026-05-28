# Dynamic Programming Striver

This repository contains Java solutions for classic dynamic programming problems.

## Included problems

- `01_fibonacci_number.java` - Fibonacci number using DP/space-optimized iterative approach.
- `02_climbing_stairs.java` - Climbing stairs problem using DP/space-optimized iterative approach.

## Notes

- Each file defines a `Solution` class with a single public method:
  - `01_fibonacci_number.java` → `public int fib(int n)`
  - `02_climbing_stairs.java` → `public int climbStairs(int n)`
- These files do not include a `main` method.

## How to run

To test these solutions, create a separate Java file with a `main` method, for example `Main.java`:

```java
public class Main {
    public static void main(String[] args) {
        Solution fibSolution = new Solution();
        System.out.println(fibSolution.fib(10));

        Solution climbSolution = new Solution();
        System.out.println(climbSolution.climbStairs(5));
    }
}
```

Then compile and run:

```bash
javac Main.java 01_fibonacci_number.java 02_climbing_stairs.java
java Main
```

## Recommendation

If you want to expand this repository, add a dedicated `Main` driver or rename classes to match each problem more clearly. This will make the project easier to run and extend.
