package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors {

	Scissors vs(Scissors otherScissors) {
		return this;
	}

	Scissors vs(Paper paper) {
		return this;
	}

	Rock vs(Rock rock) {
		return rock;
	}
}
