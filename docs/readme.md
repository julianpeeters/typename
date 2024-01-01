# typename
Get names for common types, using typeclasses instead of reflection.

### Add the dependency:
 - libarary for Scala @SCALA@ (JS, JVM, and Native platforms)
 
```scala
"com.julianpeeters" %% "typename" % "@VERSION@"
```

### Example:

```scala mdoc
import typename.{NameOf, given}

val name: String = summon[NameOf[Some[Int]]].name
```