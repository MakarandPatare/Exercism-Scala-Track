object Bob {
  def response(statement: String): String = {
      statement match {
        case s if s.endsWith("?") && s.contentEquals(s.toUpperCase()) && "[a-zA-Z]".r.findFirstMatchIn(s).nonEmpty => "Calm down, I know what I'm doing!"
        case s if s.trim.endsWith("?") => "Sure."
        case s if s.contentEquals(s.toUpperCase()) && "[a-zA-Z]".r.findFirstMatchIn(s).nonEmpty => "Whoa, chill out!"
        case s if s.trim.isEmpty => "Fine. Be that way!"
        case _ => "Whatever."
      }
  }
}
