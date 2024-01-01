package typename

trait NameOf[A]:
  def name: String
  def parent: Option[String]

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
