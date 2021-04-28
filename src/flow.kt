fun main() {
numbers()
    people("joy","nyambura","rose")
    party(20)
    party(3)
    party(8)
    sport()
}
fun numbers(){
    for (j in 1..100){
        if(j%2!=0){
            println(j)
        }
    }
}
fun people(a:String,b:String,c:String):Array<String>{
    var names= arrayOf(a,b,c)
    for(name in names)
        if(name.length>5){
            println(name)
        }
    return names
}
fun party(age:Int){
    when (age){
        in 1..5->println("guest get a glass of milk")
        in 6..15->println("guest get a  bottle of fanta orange")
        else->println("guest get a bottle of coca cola")
    }
}
fun sport(){
    for (k in 1..100)
        if (k %3==0){
            println("Fizz")
        }else if(k % 5==0){
            println("Buzz")
        }
    else if(k%3==0 && k%5==0){
        println("FizzBuzz")
        }
    else if(k%3!==0 && k%5!==0){
        println(k)
        }
}