# typename
Get names for common types using typeclasses instead of reflection.

### Add the dependency:
 - libarary for Scala 3 (JS, JVM, and Native platforms)
 
```scala
"com.julianpeeters" %% "typename" % "0.2.0"
```

### Example:

```scala
import typename.{NameOf, given}

val str: String = summon[NameOf[Some[Int]]].name
// str: String = "Some[Int]"
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
 - `Function` (1-9)
 - `List`
 - `Option`
 - `Tuple` (2-9)

</details>