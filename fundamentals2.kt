import java.util.Hashtable
fun main(){
    // arraylists 
    var arraylist = arrayListOf<Any>()
    arraylist.add(1)
    arraylist.add("Hello")
    arraylist.add(true)
    println(arraylist)
    var arraylist2 = arrayListOf<Int>()
    arraylist2.add(1)
    arraylist2.add(2)
    arraylist2.add(3)
    arraylist.addAll(arraylist2)
    println(arraylist)

    //hashmap and hashtables
    var keyValues = HashMap<String,Int>()
    keyValues.put("one",1)
    keyValues.put("two",2)
    println("hashmap"+keyValues)

    val hashTables = Hashtable<String, Int>()
    hashTables["one"] = 1
    hashTables["only two"] = 2
    hashTables.remove("one")
    println("hash tables"+hashTables)



}