package logica;

class Datos {
	// Tipos de Datos
	
	// Numerico
	byte a = 0;
	short b = 0;
	int c = 0;
	long d = 0;
	float e = 0.0;
	double f = 0.0;

	// Lógico
	boolean g = true;

	// Caracteres
	char h = 'c';
	String i = "String";

	// Objetos
	Object o = new Object(); // ESTE ES UN OBJECTO GENERICO EL PADRE DE TODOS LOS OBJETOS
	Scanner sc = new Scanner(System.in); // Se acuerdan para que sirve... pues es un objecto
	// Persona p = new Persona ("Jose", "Quevedo", 19); Ejemplo de una clase personalizada

	//Arreglos (Vectores)
	int[] vector;
	vector = new vector[10]; // Si, los vectores también son objetos
	int[][] matriz = new int[10][10];
	
	// Operadore Aritmeticos

	/**
	 * + Suma
	 * - Resta
	 * * Multiplicacion
	 * / Division 
	 * % Modulo 
	 * ++ Incremento
	 * -- Decremento
	 */
	
	// Operadores Logicos
	/**
	 * < Menor que
	 * <= Menor o igual que
	 * > Mayor que
	 * >= Mayor o igual que
	 * ! Negacion
	 * == Igual que
	 * != diferente que 
	 * && Y lógico
	 * || O lógico
	 * condicion ? trudy: false Operador Térnario
	 */
	
	// Operador de Tipos (Objetos)
	// typeof
	
	// Estructuras de control de Flujo
	boolean bool = true;

	if (bool) {

	} else if(!bool) { // Negacion

	} else {

	}

	int var = 0;

	switch (var) {
		case 1:
			// Code
			break;
		case 2:
			// Code
			break;
		case 3:
			// Code
			break;
		default:
			// Code	
	}

	// Estructuras de Repetición
	while(bool) {
		// Code
	}

	do {
		// Code
	} while(bool);

	int[] vectorEjemplo = new Vector[10];

	for (int idx = 0; idx < vectorEjemplo.lenght ; i++) { 
		// vectorEjemplo.lenght es un atributo de la clase vector que devuelve el tamaño del mismo
		vectorEjemplo[i] = idx * 2;
	}

	for (Integer entero : vectorEjemplo) {
		// For each recomendado para leer datos.
		System.out.println(entero);
	}
	
	// Estructuras para manejar errores

	try {
		// Intento hacer una operacion que puede generar una exception "que puede dar un error"
	} catch(Exception e) {
		// Si ocurre el error se crea una Exception llamada e
		System.out.println(e.getMessage()); // Imprimimos que causo el fallo
	} finally {
		//Siempre se va a ejecutar sin importar si hay o no excepcion
	}
}
