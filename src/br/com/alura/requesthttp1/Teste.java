package br.com.alura.requesthttp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class Teste {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		URL url = new URL("https://www.casadocodigo.com.br");
		URLConnection uc = url.openConnection();

		BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));

		String line = "";

		while (br.readLine() != null) {
			if (br.readLine() != null) {
				line = line.concat(br.readLine()).concat(System.lineSeparator());
			}
		}
		System.out.println(line);
	}

}