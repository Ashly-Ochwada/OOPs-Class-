fun main(){
    var humanbeing = Human("Ashly", 20,54 )
    humanbeing.eat(5)
    humanbeing.speak("French")
    humanbeing.birthday()
    var walala = Person("Ashly", "Ochwada","ashlywochwada@gmail.com","0758862979","ochwada23034")
    println(walala.email)
    println(walala.password)
}
class Human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight: Int){
        weight+=foodWeight
      println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech: String) {
        println(speech)
    }
    //Increments the human’s age by 1 point
    fun birthday() {
        println(age+1)
    }
}
data class Person(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){}
