package typename

import munit.FunSuite

class NameOfSuite extends FunSuite:

  test("Some[A]"):
    val a: Some[Int] = Some(1)
    def f[A](a: A)(using N: NameOf[A]): NameOf[A] = N
    val obtained: String = f(a).name
    val expected: String = "Some[Int]"
    assertEquals(obtained, expected)