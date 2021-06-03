package main.com.bluetab.exercise

class Logic {

  val toUpperString = (x: String) => x.toUpperCase
  val dic = Map("Bogota" -> "Bog", "Cali" ->  "Cali", "Lima" -> "Li", "Madrid" -> "Mad", "NewYork" -> "NY")

  def getUpperCities(csv: List[Array[String]]) : List[String] = {
    csv.map(_(0)).map(toUpperString(_))
  }

  def convertCities(csv: List[Array[String]]) : List[String] = {
    csv.map(_(0)).map(dic(_))
  }

  def getTotalWomen(csv: List[Array[String]]) : Int = {
    csv.map(_(1).toInt).reduce(_ + _)
  }

}
