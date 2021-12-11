package main;

import java.util.*

data class Contato(
    var nome: String,
    var email: String?,
    var idade: Int?
);

fun main() {
    var c = Contato("", null, 0);
    var listaContatos = mutableListOf<Contato>();
    var opc: Int? = null;

    while(opc != 0) {
        println(">>> Menu");
        println(">>> 1-Cadastrar");
        println(">>> 2-Listar");
        println(">>> 3-Remover");
        println(">>> 0-Sair");

        print(">>> ")
        opc = readLine()?.toInt();

        when(opc) {
            1 -> {
                var cdt: Int? = 1

                while(cdt != 0) {
                    println(">>> Adicionar novo contato.");

                    print(">>> Nome: ");
                    c.nome = readLine().toString();

                    print(">>> Email: ");
                    c.email = readLine().toString() ?: "Email não informado";

                    print(">>> Idade: ");
                    c.idade = readLine()?.toInt();

                    var c = Contato(c.nome, c.email, c.idade);
                    listaContatos.add(c);

                    println(">>> Contato de ${c.nome} salvo com sucesso!");

                    when (c.idade) {
                        in 1..17 -> println(">>> ${c.nome} é menor de idade!");
                        in 18..60 -> {
                            println(">>> ${c.nome} é adulto.");
                            println(">>> ${c.nome} já pode ser preso!");
                        }
                        else -> println(">>> ${c.nome} é idoso!");
                    }

                    println(">>> Deseja continuar adicionando contatos? 1-Sim | 0-Não");
                    cdt = readLine()?.toInt();
                }
            }
            2 -> {
                println(">>> Lista de contatos.");
                for (lc in listaContatos)  {
                    println(">>> Nome: ${lc.nome} | Email: ${lc.email} | Idade: ${lc.idade}");
                }
            }
            3 -> {
                print(">>> Informe o contato que deseja remover: ");
                var idx: Int? = readLine()?.toInt();
                if (idx != null) {
                    listaContatos.removeAt(idx);
                } else {
                    println(">>> Contato não encontrado");
                }
            }
            0 -> {
                println(">>> Saindo...");
                break;
            }
            else -> println(">>> Opção inválida!");
        }
    }
}

    //    var input: Scanner = Scanner(System.`in`);
    //    nome = input.nextLine()

    // for (i in 1..5) {
    //     if (i%2==0) {
    //         println("$i é par!")
    //         continue;
    //     } else {
    //         println("$i é ímpar!")
    //     }
    // }

    // println("Lenght: ${nome.length}");
    // println("Equals: ${nome.equals("Cleef")}");
    // println("Reversed: ${nome.reversed()}");
    // println("Slice: ${nome.slice(1..3)}");

    // if (c.idade <= 17) {
    //     println("${c.nome} é menor de idade!");
    // } else if (idade in 18 .. 60) {
    //     println("${c.nome} é adulto!");
    // } else {
    //     println("${c.nome} é idoso!");
    // }


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