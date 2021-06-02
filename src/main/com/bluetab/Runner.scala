package main.com.bluetab

import main.com.bluetab.exercise.{Logic, Reader}

object Runner {

  val reader = new Reader
  val logic = new Logic

  def main(args: Array[String]): Unit = {
    println("Hello world")

    val ciudadesCsv = reader.readCsvColumn("src/test/resources/ciudades.csv", true)
    for (row <- ciudadesCsv){
      var line = ""
      for (i <- row){
        line = line + i.toString + " "
      }
      println(line.trim)
    }

    val cities = logic.getUpperCities(ciudadesCsv)
    cities.foreach(println(_))

    val convertCities = logic.convertCities(ciudadesCsv)
    convertCities.foreach(println(_))

    val totalWomen = logic.getTotalWomen(ciudadesCsv)
    println(s"el total de mujeres es: $totalWomen")

  }

}
