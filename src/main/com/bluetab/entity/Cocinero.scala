package main.com.bluetab.entity

class Cocinero {

  def cortar (alimento: Alimento) : Unit = {
    print("Yo cocinero estoy ")
    alimento.cortarAlimento
  }

  def pelar (alimento: Alimento): Unit = {
    print("Yo cocinero estoy ")
    alimento.pelarAlimento
  }


}
