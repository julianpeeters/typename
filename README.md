# typename
Get names for common types, using typeclasses instead of reflection.

### Add the dependency:
 - libarary for Scala 3 (JS, JVM, and Native platforms)
 
```scala
"com.julianpeeters" %% "typename" % "0.0.0"
```

### Example:

```scala
import typename.{NameOf, given}

val name: String = summon[NameOf[Some[Int]]].name
// name: String = "Some[Int]"
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