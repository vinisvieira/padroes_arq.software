package vinicius.lindemberg.composite.composite;

import java.util.ArrayList;

public class GradeDeRefri extends Refrigerante {

	private ArrayList<Refrigerante> gradeDeRefri;

	public GradeDeRefri() {

		gradeDeRefri = new ArrayList<Refrigerante>();

	}

	@Override
	public void criarRefri(Refrigerante refrigerante) {
		gradeDeRefri.add(refrigerante);
	}

	@Override
	public void tirarRefriDeLinha(Refrigerante refrigerante) {
		gradeDeRefri.remove(refrigerante);
	}

	@Override
	public String verificarValidade(int refrigerante) {
		return gradeDeRefri.get(refrigerante).getDataValidade();
	}

	@Override
	public void refrigerantes() {
		for (Refrigerante refrigerante : gradeDeRefri) {
			refrigerante.refrigerantes();
		}

	}

}