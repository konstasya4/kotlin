fun main(args: Array<String>) {
    val dog = Dog("Хаски", "Корм", "Вольер")
    val cat = Cat("Черный", "Говядина", "Квартира")
    val hourse = Hourse("Бурая", "Морковь", "Стойло")
    val veterinarian = Veterinarian()
    val arr = listOf(dog, cat, hourse)
    for (animal in arr) {
        veterinarian.treatAnimal(animal)
    }
}
open class Animal(var food: String, var location: String) {
    open fun makeNoise() {
        print("Животное спит!")
    }

    open fun eat() {
        print("Животное ест $food")
    }

    fun sleep() {
        print("Животное спит")
    }
}

class Dog(var breed: String, food: String, location: String): Animal(food, location) {
    override fun makeNoise() {
        print("$breed лает!")
    }

    override fun eat() {
        print("$breed ест $food")
    }
}
class Cat(var color: String, food: String, location: String): Animal(food, location){
    override fun makeNoise() {
        print("$color кот мурлычит!")
    }

    override fun eat() {
        print("$color кот ест $food")
    }
}


class Hourse(var color: String, food: String, location: String): Animal(food, location) {
    override fun makeNoise() {
        print("$color лошадь фырчит!")
    }

    override fun eat() {
        print("$color лошадь ест $food")
    }
}
class Veterinarian(){
    fun treatAnimal(animal: Animal){
        println("Питание: ${animal.food}, местоположение: ${animal.location}")
    }
}