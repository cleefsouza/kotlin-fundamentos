package main;

import java.util.*

fun main() {
    var nome: String;
    var email: String;
    var idade: Int;

//    var input: Scanner = Scanner(System.`in`);
//    nome = input.nextLine()

    println("Adicionar novo contato.");

    print("Nome: ");
    nome = readLine().toString();

    print("Email: ")
    email = readLine().toString();

    print("Idade: ")
    idade = readLine().toString().toInt();

    println("Contato de $nome salvo com sucesso!");
}