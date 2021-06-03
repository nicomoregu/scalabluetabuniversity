package main.com.bluetab.exercise

class Reader {

  def readCsvColumn(path: String, header: Boolean = false, separator: String = ",") : List[Array[String]] = {
    val linesToDrop = header match {
      case true => 1
      case false => 0
    }
    val bufferedSource = scala.io.Source.fromFile(path)
    val csv = bufferedSource.getLines.drop(linesToDrop).map(_.split(separator).map(_.trim)).toList
    bufferedSource.close
    csv
  }

}
