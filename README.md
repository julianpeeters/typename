# typename
Get names for common types using typeclasses instead of reflection.

### Add the dependency:
 - libarary for Scala 3 (JS, JVM, and Native platforms)
 
```scala
"com.julianpeeters" %% "typename" % "0.1.0"
```

### Example:

```scala
import typename.{NameOf, given}

val str: String = summon[NameOf[Some[Int]]].name
// str: String = "Some[Int]"
```