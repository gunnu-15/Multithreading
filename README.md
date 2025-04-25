# Multithreading


# Volatile Variable

- Volatile variable - A variable's value may be changed by multiple threads, and it helps ensure visibility of changes to that variable across threads.
- Without volatile, one thread may cache a variable’s value and not see updates made by other threads.
- With volatile, when one thread updates the variable, the new value is immediately visible to all other threads.
- It tells the JVM not to cache the variable locally but always read it from the main memory.

- Limitations: Limitations: volatile doesn't guarantee atomicity. So operations like count++ are not safe even if count is volatile.
- For atomic operations, use synchronized or classes from java.util.concurrent.atomic

