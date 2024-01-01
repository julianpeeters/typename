package typename.types

import typename.NameOf

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