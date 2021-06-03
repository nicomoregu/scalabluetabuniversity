package main.com.bluetab.entity

class Papa extends Alimento {
  override def pelarAlimento: Unit = {
    println("pelando papa")
  }

  override def cortarAlimento: Unit = {
    println("cortando papa")
  }
}
