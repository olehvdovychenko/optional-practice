package optional;

import optional.logic.Account;
import optional.logic.AccountNotFoundException;
import optional.logic.AccountProvider;
import optional.logic.AccountService;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


public class Optionals {

    /**
     * Створити інстанс класу Optional використовуючи параметр
     */
    public static Optional<String> optionalOfString(String text) {
        throw new NullPointerException();
    }

    /**
     * Додати передану кількість грошей на баланс Optional аккаунту.
     */
    public static void deposit(AccountProvider accountProvider, BigDecimal amount) {
        throw new NullPointerException();
    }

    /**
     * Створити інстанс класу Optional використовуючи переданий обьект класу Аккаунт
     */
    public static Optional<Account> optionalOfAccount(Account account) {
        throw new NullPointerException();
    }

    /**
     * Повернути Аккаунт, наданий AccountProvider. Якщо AccountProvider не надасть Аккаунту, то повернути defaultAccount.
     */
    public static Account getAccount(AccountProvider accountProvider, Account defaultAccount) {
        throw new NullPointerException();
    }

    /**
     * Передати Аккаунт до AccountService.processAccount() якщо Аккаунт надано. Інакше викликати AccountService.processWithNoAccount().
     */
    public static void processAccount(AccountProvider accountProvider, AccountService accountService) {
        throw new NullPointerException();
    }

    /**
     * Повернути Аккаунт, наданий AccountProvider. Якщо Аккаунт не надано, то створити default Аккаунт використовуючи конструктор.
     */
    public static Account getOrGenerateAccount(AccountProvider accountProvider) {
        throw new NullPointerException();
    }

    /**
     * Витягнути баланс Аккаунту використовуючи OptionalAPI
     */
    public static Optional<BigDecimal> retrieveBalance(AccountProvider accountProvider) {
        throw new NullPointerException();
    }

    /**
     * Повернути Аккаунт наданий AccountProvider. Якщо Аккаунт не надано, викинути exception AccountNotFoundException з довільним повідомленням.
     */
    public static Account getAccount(AccountProvider accountProvider) {
        throw new NullPointerException();
    }

    /**
     * Повернути Аккаунт з gmail поштою. Якщо аккаунт не надано, або не знайдено пошт з доменом gmail, повернути Optional.EMPTY
     */
    public static Optional<Account> retrieveAccountGmail(AccountProvider accountProvider) {
        throw new NullPointerException();
    }

    /**
     * Повернути Аккаунт використовуючи AccountProvider i fallbackProvider. Якщо перший не надасть Аккаунту,
     * тоді ми повинні звернутись до другого за аккаунтом. Якщо обидва не нададуть Аккаунту, викинути NoSuchElementException.
     */
    public static Account getAccountWithFallback(AccountProvider accountProvider, AccountProvider fallbackProvider) {
        throw new NullPointerException();
    }

    /**
     * Повернути найменьший баланс серед переданих Аккаунтів або пусте значення, якщо список пустий.
     */
    public static OptionalDouble findMinBalanceValue(List<Account> accounts) {
        throw new NullPointerException();
    }
}

