object Bob {

  def isEmpty(statement: String) = statement.trim.isEmpty

  def isShout(statement: String) = {
    statement == statement.toUpperCase && statement.exists(_.isLetter)
  }

  def isQuestion(statement: String) = statement.trim.endsWith("?")

  def isForcefulQuestion(statement: String): Boolean = {
    statement == statement.toUpperCase && statement.exists(_.isLetter) && statement.trim.endsWith("?")
  }

  def response(statement: String): String = {
    val speak: String = {
      if (isEmpty(statement))
        "Fine. Be that way!"
      else if (isForcefulQuestion(statement))
        "Calm down, I know what I'm doing!"
      else if (isShout(statement))
        "Whoa, chill out!"
      else if (isQuestion(statement))
        "Sure."
      else
        "Whatever."
    }
    speak
  }
}
