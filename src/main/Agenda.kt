package main;

import java.util.*

fun main() {
    var nome: String;
    var email: String? = null;
    var idade: Int;

//    var input: Scanner = Scanner(System.`in`);
//    nome = input.nextLine()

    println("Adicionar novo contato.");

    print("Nome: ");
    nome = readLine().toString();

    print("Email: ")
    email = readLine().toString() ?: "Email não informado";

    print("Idade: ")
    idade = readLine().toString().toInt();

    println("Contato de $nome salvo com sucesso!");

    if (idade <= 17) {
        println("$nome é menor de idade!");
    } else if (idade in 18 .. 60) {
        println("$nome é adulto!");
    } else {
        println("$nome é idoso!");
    }

    // println("Lenght: ${nome.length}");
    // println("Equals: ${nome.equals("Cleef")}");
    // println("Reversed: ${nome.reversed()}");
    // println("Slice: ${nome.slice(1..3)}");
}