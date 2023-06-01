package br.edu.ifto.sistemahotelaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SistemaHotelariaApplication {
    private static ConfigurableApplicationContext ctx;

    /**
     * Inicia o servidor de aplicação.
     * @param args argumentos de linha de comando.
     *             Passe shutdown, stop, close ou kill para fechar o servidor depois da inicialização
     *             (para propósitos de testes).
     */
    public static void main(String[] args) {
        final boolean shutdown = (args.length > 0 && ("shutdown".equalsIgnoreCase(args[0]) || "stop".equalsIgnoreCase(args[0]) | "close".equalsIgnoreCase(args[0]) || "kill".equalsIgnoreCase(args[0])));
        ctx = SpringApplication.run(SistemaHotelariaApplication.class, args);
        if(shutdown) {
            System.out.printf("%n%n# Recebida solicitação do usuário, via linha de comando, para desligar o servidor.%n");
            new Thread(SistemaHotelariaApplication::shutdown).start();
        }
    }

    private static void shutdown() {
        System.out.printf("# Desligando o servidor por requisição do usuário via linha de comando.%n%n");
        ctx.close();
    }
}
