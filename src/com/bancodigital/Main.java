package com.bancodigital;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Cliente gustavo = new Cliente();
//        gustavo.setNome("Gustavo");

//        Conta contaC = new ContaCorrente(gustavo);
//        contaC.depositar(100);

//        Conta contaP = new ContaPoupanca(gustavo);

//        contaC.transferir(100, contaP);

//        contaC.imprimirExtrato();
//        contaP.imprimirExtrato();

        Banco bb = new Banco();
		Cliente gustavo = new Cliente("Gustavo");
		Cliente	emilio = new Cliente("Emilio");
		Conta contaGustavo = new Conta(gustavo, "12345", "987654", new Double(500.00), new Date(2021, 00, 10));
		Conta contaEmilio = new Conta(emilio, "12345", "987123", new Double(1000.00), new Date(2021, 10, 05));



		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		cliente.add(gustavo);
		cliente.add(emilio);

		bb.setNome("Banco do Brasil");
		bb.setClientes(clientes);

		Transferencia almoco = new Transferencia();
		almoco.transferenciaMesmoBanco(contaGustavo, contaEmilio, new Double(30.00));


        Date teste = new Date(2021, 00, 10);
        int result = teste.compareTo(contaGustavo.getDataAbertura());
        if(result == 0) {
            System.out.println("Datas Iguais");
        }else {
            System.out.println(result+ " DIAS");
        }

    }


}
