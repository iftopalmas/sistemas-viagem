package br.edu.ifto.sistemaagenciaviagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SistemaAgenciaViagemApplication {
    private static ConfigurableApplicationContext ctx;

    /**
     * Inicia o servidor de aplicação.
     * @param args argumentos de linha de comando.
     *             Passe shutdown, stop ou kill para fechar o servidor depois da inicialização
     *             (para propósitos de testes).
     */
    public static void main(String[] args) {
        final boolean shutdown = (args.length > 0 && (args[0].equalsIgnoreCase("shutdown") || args[0].equalsIgnoreCase("stop") || args[0].equalsIgnoreCase("kill")));
        ctx = SpringApplication.run(SistemaAgenciaViagemApplication.class, args);
        if(shutdown) {
            System.out.printf("%n%n# Recebida solicitação do usuário, via linha de comando, para desligar o servidor.%n");
            new Thread(SistemaAgenciaViagemApplication::shutdown).start();
        }
    }

    private static void shutdown() {
        System.out.printf("# Desligando o servidor por requisição do usuário via linha de comando.%n%n");
        ctx.close();
    }
}
