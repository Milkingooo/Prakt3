import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    //ex1
    val myAge = 17
    val isTeenager: Boolean = myAge > 13 && myAge < 19

    //ex2
    val theirAge = 30
    val bothTeenagers: Boolean = isTeenager && theirAge > 13 && theirAge < 19

    //Ex3
    val reader = "Максик"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    //ex4
    val readerBeforeAuthor = reader < author

    //ex5
    val myAge2 = 17
    if(myAge2 > 13 && myAge2 < 19) println("Подросток") else println("Не подросток")

    //ex6
    val answer = if (myAge2 > 13 && myAge2 < 19) "Подросток" else "Не подросток"
    println(answer)

    //ex7
    var counter = 0
    while(counter < 10){
        println("counter равен $counter")
        counter++
    }

    //ex8
    counter = 0
    var roll: Int = 0

    do {

        roll = Random.nextInt(6)
        counter++
    }
    while (roll != 0)

    println("После $counter бросков, roll равен $roll")

    //ex9
    val range = 1..10
    for (i in range) println(i * i)

    //ex10
    for (i in range) println(sqrt(i.toDouble()))

    //ex11
    var sum = 0
    for (row in 1 until 8 step 2){
        for (column in 0 until 8) sum += row * column
    }

    println(sum)
}