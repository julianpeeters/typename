package typename

export types.complex.array.given
export types.complex.either.given
export types.complex.list.given
export types.complex.option.given
export types.complex.tuple.given
export types.primitive.boolean.given
export types.primitive.byte.given
export types.primitive.char.given
export types.primitive.int.given
export types.primitive.long.given
export types.primitive.nothing.given
export types.primitive.string.given
export types.primitive.unit.given

object types:
  
  object primitive:

    object boolean:
      given NameOf[Boolean] =
        new NameOf[Boolean]:
          def name: String = "Boolean"
          def parent: Option[String] = None

    object byte:
      given NameOf[Byte] =
        new NameOf[Byte]:
          def name: String = "Byte"
          def parent: Option[String] = None

    object char:
      given NameOf[Char] =
        new NameOf[Char]:
          def name: String = "Char"
          def parent: Option[String] = None

    object int:
      given NameOf[Int] =
        new NameOf[Int]:
          def name: String = "Int"
          def parent: Option[String] = None

    object long:
      given NameOf[Long] =
        new NameOf[Long]:
          def name: String = "Long"
          def parent: Option[String] = None

    object nothing:
      given NameOf[Nothing] =
        new NameOf[Nothing]:
          def name: String = "Nothing"
          def parent: Option[String] = None

    object string:
      given NameOf[String] =
        new NameOf[String]:
          def name: String = "String"
          def parent: Option[String] = None

    object unit:
      given NameOf[Unit] =
        new NameOf[Unit]:
          def name: String = "Unit"
          def parent: Option[String] = None

  object complex:

    object array:
      given [T] (using T: NameOf[T]): NameOf[Array[T]] =
        new NameOf[Array[T]]:
          def name: String = s"Array[${T.name}]"
          def parent: Option[String] = None

    object either:
      given [L, R] (using L: NameOf[L], R: NameOf[R]): NameOf[Either[L, R]] =
        new NameOf[Either[L, R]]:
          def name: String = s"Either[${L.name}, ${R.name}]"
          def parent: Option[String] = None
 
      given [L, R] (using L: NameOf[L], R: NameOf[R]): NameOf[Left[L, R]] =
        new NameOf[Left[L, R]]:
          def name: String = s"Left[${L.name}, ${R.name}]"
          def parent: Option[String] = Some(s"Either[${L.name}, ${R.name}]")
      given [L, R] (using L: NameOf[L], R: NameOf[R]): NameOf[Right[L, R]] =
        new NameOf[Right[L, R]]:
          def name: String = s"Right[${L.name}, ${R.name}]"
          def parent: Option[String] = Some(s"Either[${L.name}, ${R.name}]")

    object list:
      given [T] (using T: NameOf[T]): NameOf[List[T]] =
        new NameOf[List[T]]:
          def name: String = s"List[${T.name}]"
          def parent: Option[String] = None
      given [T] (using T: NameOf[T]): NameOf[::[T]] =
        new NameOf[::[T]]:
          def name: String = s"::[${T.name}]"
          def parent: Option[String] = None
      given NameOf[Nil.type] =
        new NameOf[Nil.type]:
          def name: String = s"Nil.type"
          def parent: Option[String] = None

    object option:
      given [T] (using T: NameOf[T]): NameOf[Some[T]] =
        new NameOf[Some[T]]:
          def name: String = s"Some[${T.name}]"
          def parent: Option[String] = Some(s"Option[${T.name}]")
      given NameOf[None.type] =
        new NameOf[None.type]:
          def name: String = "None.type"
          def parent: Option[String] = Some("Option[Nothing]")

    object tuple:
      given [_1, _2] (using _1: NameOf[_1], _2: NameOf[_2]): NameOf[Tuple2[_1, _2]] =
        new NameOf[Tuple2[_1, _2]]:
          def name: String = s"Tuple2[${_1.name}, ${_2.name}]"
          def parent: Option[String] = None
