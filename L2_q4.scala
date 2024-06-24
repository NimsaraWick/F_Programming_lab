def revenue(price:Double,attendee:Double):Double = {
    return price * attendee;
}

def cost(attendee:Double):Double = {
        return 500 + attendee * 3;    
}

def profit(attendee:Double,price:Int):Double={
    return revenue(price,attendee) - cost(attendee);
}

def attendees(price:Double):Double = {
    return 120 + (15-price) / 5*20;
}

def main(args: Array[String]): Unit = {
    printf(s"profit (ticket price=Rs.5) : ${profit(attendees(5),5)}\n");
    printf(s"profit (ticket price=Rs.10) : ${profit(attendees(10),10)}\n");
    printf(s"profit (ticket price=Rs.15) : ${profit(attendees(15),15)}\n");
    printf(s"profit (ticket price=Rs.20) : ${profit(attendees(20),20)}\n");
    printf(s"profit (ticket price=Rs.25) : ${profit(attendees(25),25)}\n");
    printf(s"profit (ticket price=Rs.30) : ${profit(attendees(30),30)}\n");
    printf(s"profit (ticket price=Rs.35) : ${profit(attendees(35),35)}\n");
}