```groovy
def myMethod(a, b) {
  a = a ?: 0 // Assign 0 if 'a' is null
  b = b ?: 0 // Assign 0 if 'b' is null
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2) // Output: 5
println myMethod(2, 5) // Output: 5
println myMethod(null, 5) // Output: 5
println myMethod(5, null) // Output: 5
println myMethod(null, null) // Output: 0
```