package sentencias;

import java.util.Scanner;

public class Plantilla {

	public static void main(String[] args) {
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		//p6();
		//p7();
		//p8();
		//p9();
		//p10();
		//p11();
		//p12();
		p13();
		//p14();
		//p15();
		//p16();
		//p17();
		//p18();
		//p19();
		//p20();
		//p21();
		//p22();
		
	}

	public static void p1() {
		Scanner pepe = new Scanner(System.in);
		//La clase Scanner permite escribir en la consola.
		System.out.print("Introducir numero: ");
		int num = pepe.nextInt(); // Lee lo que se escribio en consola.
		if (num > 10) 
			System.out.println("Demasiado alto");
		else
			System.out.println("Demasiado bajo");
		
	}
	public static void p2() {
		Scanner pepe = new Scanner(System.in);
		System.out.print("Introducir dia de semana: ");
		String dia = pepe.next();
		switch(dia) {
		 	case "lunes":
		 	case "martes":
		 	case "miercoles":
		 	case "jueves":
		 	case "viernes":
		 		System.out.println("A trabajar toca!!");
		 		break;
		 	case "sabado":
		 	case "domingo":
		 		System.out.println("A descansar!!");
		 		break;
		
		}
	}

	public static void p3() {
		Scanner pepe = new Scanner(System.in);
		System.out.print("¿Cuanto dinero tenemos?: ");
		int num = pepe.nextInt();
		if(num < 5)
			System.out.println("Nos vamos al parque");
		else if( num < 10)
			System.out.println("Nos vamos al videoclub");
		else 
			System.out.println("Nos vamos al cine");
	}
	public static void p4() {
		Scanner reader = new Scanner(System.in);
		int i=0, numero;
		int suma = 0;
		do {
			System.out.print("Introduce cantidad " + i + ": " );
			numero = reader.nextInt();
			suma = suma + numero;
			if (suma > 100) {
				System.out.println("Te has pasado!");
				break;
			}
			else 
				System.out.println("Resultado de la suma " + suma);
			i++;
		} while (suma<100 && i<5);
		if (i == 5)
			System.out.println("Secuencia correcta.");
		else
			System.out.println("Secuencia incorrecta.");
		
	}	
	public static void p5() {
Scanner reader = new Scanner(System.in);
		
		int i=0, numero;
		int suma = 0;
		do {
			System.out.print("Introduce cantidad " + i + ": " );
			numero = reader.nextInt();
			suma = suma + numero;
			if (suma > 100) {
				System.out.println("Te has pasado!");
				break;
			}
			else 
				System.out.println("Resultado de la suma " + suma);
			i++;
		} while (suma<100 && i<5);
		if (i == 5)
			System.out.println("Secuencia correcta.");
		else
			System.out.println("Secuencia incorrecta.");
		if(suma % 2 == 0) System.out.println(suma + "es multiplo de 2");
		if(suma % 3 == 0) System.out.println(suma + "es multiplo de 3");
		if(suma % 5 == 0) System.out.println(suma + "es multiplo de 5");
	}
	public static void p6() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Selecciona una opcion de [1-5]: ");
		int opcion = reader.nextInt();
		switch (opcion) {
		case 1: System.out.println("Has escogido la opcion 1");  
			break;
		case 2: System.out.println("Has escogido la opcion 2");
			break;
		case 3: System.out.println("Has escogido la opcion 3");
			break;
		case 4: System.out.println("Has escogido la opcion 4");
			break;
		case 5: System.out.println("Has escogido la opcion 5");
			break;
		default: System.out.println("No has elegido una opcion correcta");
		
		}
	}
	public static void p7() {}
	public static void p8() {
		int num = 0;
		while(num < 100) {
			num++;
			System.out.println(num);
		}
		
	}
	public static void p9() {
		int num = 37;
		for (int i=0; i<=10; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
	}
	public static void p10() {
		 for(int i=3; i<100; i++){
			 if (i%2 == 0)
				 System.out.println(i);
			 }
	}
	public static void p11() {}
	public static void p12() {
		for(int i=0; i<5000; i++) {
			System.out.println(i);
			if (i == 25)
				break;
		}
	}
	public static void p13() {
		int num = 3;
		while(num < 296) {
			num++;
			if(num%5 == 0) continue;
			System.out.println(num);
			
		}
	}
	public static void p14() {
		
	}
	public static void p15() {}
	public static void p16() {}
	public static void p17() {}
	public static void p18() {}
	public static void p19() {}
	public static void p20() {}
	public static void p21() {}
	public static void p22() {}
	public static void p23() {}
	public static void p24() {}
	public static void p25() {}
	public static void p26() {}
	public static void p27() {}
	public static void p28() {}
	public static void p29() {}
	public static void p30() {}
	public static void p31() {}
	public static void p32() {}
	public static void p33() {}
	public static void p34() {}
	public static void p35() {}
	public static void p36() {}
	public static void p37() {}
	public static void p38() {}
	public static void p39() {}
	public static void p40() {}
	public static void p41() {}
	public static void p42() {}
	public static void p43() {}
	public static void p44() {}
	public static void p45() {}
	public static void p46() {}
	public static void p47() {}
	public static void p48() {}
	public static void p49() {}
	public static void p50() {}
	public static void p51() {}
}

