// basic functions
fun greeter(name:String,age:Int):String{
    val response:String = "hello my name is "+name+" and my age "+age
    return response
}

//single line function
fun sumVariables(x:Int,y:Int) = x+y

// default variables
fun favoriteAnimal(animalName:String = "Lion") = println("your favorite Animal is "+animalName) 

fun main(){

    // val const varriable
    val name:String = "burak"
    // var mut varriable
    var age:Int = 20


    println(greeter(name,age))


    var favoriteAnimal:String="Tiger"
    favoriteAnimal()

    println("sum variables "+sumVariables(5,10))

    var myNumbers = listOf(1,2,3,5,6,7)
    var myChangeableNumbers = mutableListOf(1,2,3,4,6,7,8,9,10)
    myChangeableNumbers.remove(0)
    myChangeableNumbers.removeAt(1)
    myChangeableNumbers.add(0,111)
    myChangeableNumbers[0] = 222
    for(i in myChangeableNumbers){
        println(i)
    }

    if(name == "burak"){
        println("my name is burak")
    }else{
        println("my name is not burak")
    }
    when(age){
        19 -> println("your age 19")
        20 -> println("your age 20")
        else -> println("your age is not 19 or 20")
    }


}