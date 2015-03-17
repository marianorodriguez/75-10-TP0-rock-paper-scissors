package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	Rock vs(Rock otherRock) {
		return this;
	}

	Rock vs(Scissors scissors) {
		return this;
	}

	Paper vs(Paper paper) {
		return paper.vs(this);
	}
}
