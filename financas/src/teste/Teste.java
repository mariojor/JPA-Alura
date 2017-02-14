package teste;

import javax.persistence.EntityManager;

import util.JPAUtil;
import entidades.Conta;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Mario");
		conta.setBanco("banco do brasil");
		conta.setNumero("123456");
		conta.setAgencia("4001");
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(conta);
		manager.getTransaction().commit();
		manager.close();
	}
}
