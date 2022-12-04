/*fun main() { // Остаток от деления
    val num1: Int = 20
    val num2: Int = 17
    val num3 = num1 % num2
    if (num3 > 0)
    {
        println("Получилось значение большее чем ноль!")
    }
}*/
/*fun main() { // Простое условие
    val age: Int = readLine()!!.toInt();
    if (age > 18)
    {
        println("Вам уже всё можно")
    }
    else if (age == 18)
    {
        println("Ура, Вам 18 лет!")
    }
    else if (age < 18 && age > 0)
    {
        println("Вы еще слишком молоды")
    }
}*/
/*fun main() { //Небольшой калькулятор
    val num1: Int = readLine()!!.toInt();
    val num2: Int = readLine()!!.toInt();
    println("У вас есть числа: $num1 и $num2")
    println(" 1.Добавить\n 2.Отнять\n 0.Ничего\n")
    val operation: Int = readLine()!!.toInt();
    if (operation == 1)
    {
        println(num1 + num2)
    }
    else if (operation == 2)
    {
        println(num1 - num2)
    }
    else if (operation == 0)
    {
        println("Ничего не изменилось")
    }
    else println("Такой операции нет!")
}*/
/*fun main() { // Определение дня недели
    val num: Int = readLine()!!.toInt();
    when(num)
    {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Error")
    }
}*/
/*fun main() { // Среднее число
    val num1: Int = readLine()!!.toInt();
    val num2: Int = readLine()!!.toInt();
    val num3: Int = readLine()!!.toInt();
    if (num1 != num2 && num2 != num3 && num1 != num3)
    {
    val min: Int = Math.min(Math.min(num1,num2),num3)
    val max: Int = Math.max(Math.max(num1,num2),num3)
    val mid: Int = num1 + num2 + num3 - (max + min)
    println(mid)
    }
    else println("Error")
}*/
/*fun main() { // Подсчёт прибыли
    println("Введите потери:")
    val num1: Int = readLine()!!.toInt();
    println("Введите прибыль:")
    val num2: Int = readLine()!!.toInt();
    var sum = 0
    if (num1 > num2)
    {
        sum = num1 - num2;
        println("Ваши убытки составили: $sum")
    }
    else if(num2 > num1)
    {
        sum = num2 - num1;
        println("Ваша прибыль составила: $sum")
    }
    else println("Вы ничего не потеряли и ничего не заработали")
}*/
fun main() { // Проверка переменных
    val num1: Int = readLine()!!.toInt();
    val num2: Int = readLine()!!.toInt();
    if (num1 % 2 == 0 && num2 % 2 == 0)
    {
        print(true)
    }
    else print(false)
}