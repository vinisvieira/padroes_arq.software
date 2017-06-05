package vinicius.lindemberg.composite.composite;

import java.util.ArrayList;

public class PaleteDeRefri extends Refrigerante {

	private ArrayList<Refrigerante> paleteDeRefri;

	public PaleteDeRefri() {

		paleteDeRefri = new ArrayList<Refrigerante>();
	}

	@Override
	public void criarRefri(Refrigerante gradeDeRefri) {
		paleteDeRefri.add(gradeDeRefri);
	}

	@Override
	public void tirarRefriDeLinha(Refrigerante gradeDeRefri) {
		paleteDeRefri.remove(gradeDeRefri);
	}

	@Override
	public void refrigerantes() {
		for (Refrigerante refrigerante : paleteDeRefri) {
			refrigerante.refrigerantes();
		}

	}
}