import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
        Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Akun " + account.getName() + " berhasil dihapus!");
                iterator.remove();
                return;
            }
        }
        System.out.println("Akun dengan nomor akun " + accountNumber + " tidak ditemukan.");
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}
