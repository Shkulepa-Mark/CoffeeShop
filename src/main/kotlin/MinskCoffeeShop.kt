package org.example

class MinskCoffeeShop(americanoPrice:Double, cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice,cappuccinoPrice,lattePrice), Biscuits
{
    override fun makeAmericano()
    {
        americanoCount++
       println("Thx for order Americano in Minsk Coffee Shop")
    }

    override fun makeCappuccino()
    {
        cappuccinoCount++
        println("Thx for order Cappuccino in Minsk Coffee Shop")
    }

    override fun makeLatte()
    {
        latteCount++
        println("Thx for order Latte in Minsk Coffee Shop")
    }

    override fun sellBiscuits()
    {
        println("Take your biscuits")
    }

}