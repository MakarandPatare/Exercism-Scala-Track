object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    factors.flatMap(x => x until (limit, x)).sum
  }
}
