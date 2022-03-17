package prueba1;

int prueba1 = 0;

public class PruebaJava {
	int a;
	int b;
	int c;

	public PruebaJava(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int calcularMayor() {
		if (c > b && c > a) {
			return c;
		} else if (b > c && b > a) {
			return b;
		} else {
			return a;
		}
	}
}
