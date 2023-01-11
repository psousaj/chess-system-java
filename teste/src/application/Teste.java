package application;

import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;

public class Teste {

	public static void main(String[] args) {
		PrintStream ps;
		File file;
		try {
			file = new File(new URI("file:/home/jpfilho/Documentos/perfil.jpg"));
			ps = new PrintStream(System.out);
			ps.print(file);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
