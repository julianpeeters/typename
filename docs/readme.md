# typename
Get names for common types using typeclasses instead of reflection.

### Add the dependency:
 - libarary for Scala @SCALA@ (JS, JVM, and Native platforms)
 
```scala
"com.julianpeeters" %% "typename" % "@VERSION@"
```

### Example:

```scala mdoc
import typename.{NameOf, given}

val str: String = summon[NameOf[Some[Int]]].name
```

### Supported types:

<details><summary>click to expand</summary>

##### Primitive:
 - `Boolean`
 - `Byte`
 - `Char`
 - `Int`
 - `Long`
 - `Nothing`
 - `String`
 - `Unit`

##### Complex:
 - `Array`
 - `Either`
 - `List`
 - `Option`
 - `Tuple`

</details>