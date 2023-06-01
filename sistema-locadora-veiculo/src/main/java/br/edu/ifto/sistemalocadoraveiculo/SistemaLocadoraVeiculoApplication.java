package br.edu.ifto.sistemalocadoraveiculo;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SistemaLocadoraVeiculoApplication {
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
        ctx = SpringApplication.run(SistemaLocadoraVeiculoApplication.class, args);
        if(shutdown) {
            System.out.printf("%n%n# Recebida solicitação do usuário, via linha de comando, para desligar o servidor.%n");
            new Thread(SistemaLocadoraVeiculoApplication::shutdown).start();
        }
    }


    @SneakyThrows
    public static void shutdown() {
        Thread.sleep(2000);
        System.out.printf("# Desligando o servidor por requisição do usuário via linha de comando.%n%n");
        ctx.close();
    }
}
