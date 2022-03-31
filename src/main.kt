fun main(){
    var humanbeing = Human("Ashly", 20,54 )
    humanbeing.eat(5)
    println(humanbeing.weight)
    humanbeing.speak("French")
    humanbeing.birthday()
    println(humanbeing.age)
    var walala = Person("Ashly", "Ochwada","ashlywochwada@gmail.com","0758862979","ochwada23034")
    println(walala.email)
    println(walala.password)
}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
class Human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight: Int){
        weight+=foodWeight
      println("I am eating $foodWeight kgs of food")
    }
    //speak(speech: String) :Prints the string passed toit
    fun speak(speech: String) {
        println(speech)
    }
    //Increments the human’s age by 1 point
    fun birthday() {
       age++
    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes
data class Person(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){}
