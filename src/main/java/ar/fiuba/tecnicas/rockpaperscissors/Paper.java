package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper {

	Paper vs(Paper otherPaper) {
		return this;
	}

	Paper vs(Rock rock) {
		return this;
	}

	Scissors vs(Scissors scissors) {
		return scissors.vs(this);
	}
}
