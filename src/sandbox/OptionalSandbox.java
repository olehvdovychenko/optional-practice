package sandbox;

import optional.logic.AccountNotFoundException;

import java.util.Optional;

public class OptionalSandbox {

    public static void main(String[] args) {
        //Створення
        Optional<Client> clientOptional = Optional.of(new Client("1","2"));
        Optional<Client> clientOptional2 = Optional.ofNullable(null);
        Optional<Client> clientOptional3 = Optional.empty();

        //Перевірка
        //System.out.println(clientOptional3.isPresent());
        //clientOptional3.ifPresent((client -> System.out.println(client.getName())));

        System.out.println(clientOptional3.orElse(new Client("Default","Client")));
        System.out.println(clientOptional3.orElseThrow(() -> new AccountNotFoundException("Our Client not found")));
    }
}
