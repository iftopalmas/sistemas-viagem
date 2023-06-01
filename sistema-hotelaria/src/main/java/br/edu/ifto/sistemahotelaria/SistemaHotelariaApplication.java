package br.edu.ifto.sistemahotelaria;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SistemaHotelariaApplication {
    public static ConfigurableApplicationContext ctx;
    private static boolean shutdown = false;

    /**
     * Inicia o servidor de aplicação.
     * @param args argumentos de linha de comando.
     *             Passe shutdown, stop ou kill para fechar o servidor depois da inicialização
     *             (para propósitos de testes).
     */
    public static void main(String[] args) {
        shutdown = (args.length > 0 && (args[0].equalsIgnoreCase("shutdown") || args[0].equalsIgnoreCase("stop") || args[0].equalsIgnoreCase("kill")));
        ctx = SpringApplication.run(SistemaHotelariaApplication.class, args);
        if(shutdown) {
            System.out.printf("%n%n# Recebida solicitação do usuário, via linha de comando, para desligar o servidor.%n");
            new Thread(SistemaHotelariaApplication::shutdown).start();
        }
    }

    @SneakyThrows
    public static void shutdown() {
        Thread.sleep(2000);
        System.out.printf("# Desligando o servidor por requisição do usuário via linha de comando.%n%n");
        ctx.close();
    }
}
