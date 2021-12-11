package main;

import java.util.*

fun main() {
    var nome: String;
    var email: String? = null;
    var idade: Int;
    var i: Int;

//    var input: Scanner = Scanner(System.`in`);
//    nome = input.nextLine()

do {

    println("Adicionar novo contato.");

    print("Nome: ");
    nome = readLine().toString();

    print("Email: ")
    email = readLine().toString() ?: "Email não informado";

    print("Idade: ")
    idade = readLine().toInt();

    println("Contato de $nome salvo com sucesso!");

    // if (idade <= 17) {
    //     println("$nome é menor de idade!");
    // } else if (idade in 18 .. 60) {
    //     println("$nome é adulto!");
    // } else {
    //     println("$nome é idoso!");
    // }

    when(idade) {
        in 1..17 -> println("$nome é menor de idade!");
        in 18..60 -> {
            println("$nome é adulto.");
            println("$nome já pode ser preso!")
        }
        else ->println("$nome é idoso!");
    }

    for (i in 1..5) {
        if (i%2==0) {
            println("$i é par!")
            continue;
        } else {
            println("$i é ímpar!")
        }
    }

    // println("Lenght: ${nome.length}");
    // println("Equals: ${nome.equals("Cleef")}");
    // println("Reversed: ${nome.reversed()}");
    // println("Slice: ${nome.slice(1..3)}");

        println("Deseja continuar adicionando contatos? 1-Sim | 0-Não")
        i = readLine().toInt();
    } while (i==0) {
        println("Saindo...")
    }

    // (a + 20 x b),(a + 20 x b + 21 x b), ... , (a + 20 x b + 21 x b + ... + 2n-1 x b)
    // var t: Int = 1;
    // var s: String = "5 3 5"
    // for(i in 1..t)
    // {
    //     val (a, b, n) = s.split(" ").map { it.toInt() }
		
    //     // code        
    //     var x: Int = 1;
    //     var res: Int = a+(x*b);
    //     var str: String = res.toString()
        
    //     for (j in 1..n-1) {
    //         x *= 2;
    //         res += (x*b)
    //     	str += " ${res.toString()}"
    //     }
        
    //     println(str)
    // }
}