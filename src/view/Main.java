package view;

import javax.swing.JOptionPane;

import model.PilhaInt;

public class Main {
	public static void main(String[] args) {
		PilhaInt PilhaA = new PilhaInt();
		PilhaInt PilhaB = new PilhaInt();

		PilhaA = inicializaPilha(PilhaA);

		int tamanhoPilha = PilhaA.size();
		int[] vet = new int[tamanhoPilha];

		for (int i = 0; i < tamanhoPilha; i++) {
			if (PilhaA.top() % 2 == 0) {
				vet[i] = PilhaA.pop();
			} else {
				PilhaB.push(PilhaA.pop());
			}
		}

		for (int i = 0; i < PilhaA.size(); i++) {
			if (vet[i] != 0) {
				PilhaA.push(vet[i]);
			}
		}
	}

	private static PilhaInt inicializaPilha(PilhaInt p) {
		p.push(5);
		p.push(26);
		p.push(1);
		p.push(17);
		p.push(20);
		p.push(22);
		p.push(25);
		p.push(11);
		p.push(39);
		p.push(5);
		p.push(15);
		p.push(38);
		p.push(26);
		p.push(14);

		return p;
	}

}
