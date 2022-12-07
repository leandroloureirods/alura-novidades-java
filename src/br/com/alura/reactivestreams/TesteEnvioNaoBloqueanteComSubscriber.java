package br.com.alura.reactivestreams;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import br.com.alura.reactivestreams.model.NotaFiscal;

public class TesteEnvioNaoBloqueanteComSubscriber {

	public static void main(String[] args) {
		NotaFiscal primeiraNotaFiscal = new NotaFiscal("João", 11.11, LocalDate.now());
		NotaFiscal segundaNotaFiscal = new NotaFiscal("Renata", 22.22, LocalDate.now());
		NotaFiscal terceiraNotaFiscal = new NotaFiscal("Paulo", 33.33, LocalDate.now());
		
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
		NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();
		
		publisher.subscribe(subscriber);		
		publisher.submit(primeiraNotaFiscal);
		publisher.submit(segundaNotaFiscal);
		publisher.submit(terceiraNotaFiscal);
		System.out.println("Você irá receber a nota fiscal no seu e-mail");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();
		publisher.close();
	}
}