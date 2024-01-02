package typename

export types.complex.array.given
export types.complex.either.given
export types.complex.function.given
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

    object function:
      given [T, R] (using T: NameOf[T], R: NameOf[R]): NameOf[Function1[T, R]] =
        new NameOf[Function1[T, R]]:
          def name: String = s"${T.name} => ${R.name}"
          def parent: Option[String] = None
      given [T1, T2, R] (using T1: NameOf[T1], T2: NameOf[T2], R: NameOf[R]): NameOf[Function2[T1, T2, R]] =
        new NameOf[Function2[T1, T2, R]]:
          def name: String = s"(${T1.name}, ${T2.name}) => ${R.name}"
          def parent: Option[String] = None
      given [T1, T2, T3, R] (using T1: NameOf[T1], T2: NameOf[T2], T3: NameOf[T3],  R: NameOf[R]): NameOf[Function3[T1, T2, T3, R]] =
        new NameOf[Function3[T1, T2, T3, R]]:
          def name: String = s"(${T1.name}, ${T2.name}, ${T3.name}) => ${R.name}"
          def parent: Option[String] = None  
      given [T1, T2, T3, T4, R] (using T1: NameOf[T1], T2: NameOf[T2], T3: NameOf[T3], T4: NameOf[T4],  R: NameOf[R]): NameOf[Function4[T1, T2, T3, T4, R]] =
        new NameOf[Function4[T1, T2, T3, T4, R]]:
          def name: String = s"(${T1.name}, ${T2.name}, ${T3.name}, ${T4.name}) => ${R.name}"
          def parent: Option[String] = None
      given [T1, T2, T3, T4, T5, R] (using T1: NameOf[T1], T2: NameOf[T2], T3: NameOf[T3], T4: NameOf[T4], T5: NameOf[T5], R: NameOf[R]): NameOf[Function5[T1, T2, T3, T4, T5, R]] =
        new NameOf[Function5[T1, T2, T3, T4, T5, R]]:
          def name: String = s"(${T1.name}, ${T2.name}, ${T3.name}, ${T4.name}, ${T5.name}) => ${R.name}"
          def parent: Option[String] = None   
      given [T1, T2, T3, T4, T5, T6, R] (using T1: NameOf[T1], T2: NameOf[T2], T3: NameOf[T3], T4: NameOf[T4], T5: NameOf[T5], T6: NameOf[T6], R: NameOf[R]): NameOf[Function6[T1, T2, T3, T4, T5, T6, R]] =
        new NameOf[Function6[T1, T2, T3, T4, T5, T6, R]]:
          def name: String = s"(${T1.name}, ${T2.name}, ${T3.name}, ${T4.name}, ${T5.name}, ${T6.name}) => ${R.name}"
          def parent: Option[String] = None
      given [T1, T2, T3, T4, T5, T6, T7, R] (using T1: NameOf[T1], T2: NameOf[T2], T3: NameOf[T3], T4: NameOf[T4], T5: NameOf[T5], T6: NameOf[T6], T7: NameOf[T7], R: NameOf[R]): NameOf[Function7[T1, T2, T3, T4, T5, T6, T7, R]] =
        new NameOf[Function7[T1, T2, T3, T4, T5, T6, T7, R]]:
          def name: String = s"(${T1.name}, ${T2.name}, ${T3.name}, ${T4.name}, ${T5.name}, ${T6.name}, ${T7.name}) => ${R.name}"
          def parent: Option[String] = None
      given [T1, T2, T3, T4, T5, T6, T7, T8, R] (using T1: NameOf[T1], T2: NameOf[T2], T3: NameOf[T3], T4: NameOf[T4], T5: NameOf[T5], T6: NameOf[T6], T7: NameOf[T7], T8: NameOf[T8], R: NameOf[R]): NameOf[Function8[T1, T2, T3, T4, T5, T6, T7, T8, R]] =
        new NameOf[Function8[T1, T2, T3, T4, T5, T6, T7, T8, R]]:
          def name: String = s"(${T1.name}, ${T2.name}, ${T3.name}, ${T4.name}, ${T5.name}, ${T6.name}, ${T7.name}, ${T8.name}) => ${R.name}"
          def parent: Option[String] = None
      given [T1, T2, T3, T4, T5, T6, T7, T8, T9, R] (using T1: NameOf[T1], T2: NameOf[T2], T3: NameOf[T3], T4: NameOf[T4], T5: NameOf[T5], T6: NameOf[T6], T7: NameOf[T7], T8: NameOf[T8], T9: NameOf[T9], R: NameOf[R]): NameOf[Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]] =
        new NameOf[Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]]:
          def name: String = s"(${T1.name}, ${T2.name}, ${T3.name}, ${T4.name}, ${T5.name}, ${T6.name}, ${T7.name}, ${T8.name}, ${T9.name}) => ${R.name}"
          def parent: Option[String] = None    

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
