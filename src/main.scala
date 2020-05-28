object main {

  def main(args:Array[String]):Unit = {

    val salary = new CalculateHomeSalary(40,20)

    println("*** Calculate the Home Salary ***")

    println(salary.takeHome())

    val tprice = new CalBestTicketPrice()

    println("*** Calculate the Best Ticket Price ***")

    print(tprice.profit(5),  tprice.profit(10), tprice.profit(15), tprice.profit(20))

    print(tprice.profit(25), tprice.profit(30), tprice.profit(35), tprice.profit(40))




  }









}
