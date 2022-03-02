fun main(args: Array<String>)
{
}

fun triangulo(): Unit {

    println("Digite o valor do lado 1 :")
    var l1 = readLine()!!.toFloat()
    println("Digite o valor do lado 2 :")
    var l2 = readLine()!!.toFloat()
    println("Digite o valor do lado 3 :")
    var l3 = readLine()!!.toFloat()

    if ((l1 == l2) && (l2 == l3))
        println("Triangulo Equilátero")
    else if ((l1 != l2) && (l1 != l3) && (l2 != l3))
        println("Triangulo Escaleno")
    else ((l1 == l2) && (l1 == l3) && (l2 == l3))
    println("Triangulo Isósceles")

//    Caso contrario não é um triangulo

}


fun bissexto(): Unit {


    println("Digite o número corrrespondente:")
    var ano = 1900

    if (ano % 4 == 0)
    else if (ano % 100 == 0)
    else (ano % 400 == 0)

    // Caso contrario não é bissexto
}


fun crime(): Unit {

    println("Telefonou para a vítima?: ")
    var resp1 = readLine()!!.toFloat()
    println("Esteve no local do crime?: ")
    var resp2 = readLine()!!.toFloat()
    println("Mora perto da vítima?: ")
    var resp3 = readLine()!!.toFloat()
    println("Devia para a vítima? ")
    var resp4 = readLine()!!.toFloat()
    println("Já trabalhou com a vítima?: ")
    var resp5 = readLine()!!.toFloat()


    if ((resp1 == resp2) || (resp1 == resp3) || (resp1 == resp4) || (resp1 == resp5))
        println("Suspeita")
    else if ((resp1!=resp2)|| (resp2!=resp3) || (resp3!=resp4) || (resp4!= resp5))
        println("Cúmplice")
    else  ((resp1==resp2) && (resp2==resp3) && (resp3==resp4) && (resp4==resp5))
        println("Assassino")

    return println("Inocente")

}


fun posto() {

    println("Tipo de combustivel? :")
    var a = readLine()!!.toFloat()
    var g = readLine()!!.toFloat()
    var combustivel = readLine()!!.toFloat()
    println("Quantos litros ? :: ")
    var litro = readLine()!!.toFloat()
    var desconto1 = readLine()!!.toFloat()
    var desconto2 = readLine()!!.toFloat()
    var desconto3 = readLine()!!.toFloat()
    var desconto4 = readLine()!!.toFloat()
    var custo = readLine()!!.toFloat()
    var gasolina = readLine()!!.toFloat()

    if ((combustivel == a) && (litro <= 20) && (custo == 3.5F))
        desconto1 = (custo * 3) / 100

    println("Desconto do Combustivel")

    // 3.5 PREÇO DO ALCOOL

      if ((combustivel== a) && (litro >= 20 ) && (custo == 4.6F))
            desconto2 = (custo * 5) / 100

    println("Desconto de Combustivel")

    // 4.6 PREÇO Do ALCOOL

             if  ((combustivel == g ) && (litro<=20 ) && (custo==5.3F))
                  desconto3 = (custo * 4)/100

    else ((combustivel == g) && (litro>=20) && (custo==5.6F))
        desconto4 = (custo * 6) / 100
}


