package br.edu.academico.esperanca.projetoBDPOO;

public class Main {
	
	public static void main(String[] args) {
		DAO<Pessoa> dao = new DAO<Pessoa>();
		Pessoa p = new Pessoa();
		p.setCpf(22);
		p.setNome("HugoFF");
		dao.save(p);
		Pessoa p2 = new Pessoa();
		p2.setCpf(23);
		p2.setNome("Hugo");
		dao.save(p2);
		Pessoa find = dao.find(Pessoa.class, 22);
		System.out.println(find.getNome());
	}

}
