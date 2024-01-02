package typename

trait NameOf[A]:
  def name: String
  def parent: Option[String]