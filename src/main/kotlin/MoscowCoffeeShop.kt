package org.example

class MoscowCoffeeShop (americanoPrice:Double, cappuccinoPrice: Double, lattePrice: Double): CoffeeShop(americanoPrice,cappuccinoPrice,lattePrice)
{
    override fun makeAmericano()
    {
        americanoCount++
        println("Thx for order Americano in Moscow Coffee Shop")
    }

    override fun makeCappuccino()
    {
        cappuccinoCount++
        println("Thx for order Cappuccino in Moscow Coffee Shop")
    }

    override fun makeLatte()
    {
        latteCount++
        println("Thx for order Latte in Moscow Coffee Shop")
    }
}