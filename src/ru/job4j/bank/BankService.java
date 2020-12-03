package ru.job4j.bank;
//3. Банковские переводы [#363068]
import java.lang.reflect.Array;
import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        //users.put(user, new ArrayList<Account>());
        if (!user.getPassport().equals(users.get(user.getPassport()))) {
            users.put(user, new ArrayList<Account>());

        } else {
            System.out.println("This user was created");
        }


    }

    public void addAccount(String passport, Account account) {
        User pasport = findByPassport(passport);
        for (Map.Entry entry : users.entrySet()) {
            if (pasport.equals(entry.getKey())) {
                entry.setValue(account);
            }
        }

    }
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
               return user;
            }

        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        int count = 0;
        for (Map.Entry entry : users.entrySet()) {
            if (entry.getKey().equals(user)) {
               return (Account) entry.getValue();
            }
        }
        return null;

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        double dest = 0D;
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        if (srcUser == null || destUser == null) {
            return rsl;
        }
        for (List<Account> accounts : users.values()) {
            if (accounts.contains(srcRequisite)){
                for (Account a : accounts) {
                    a.setBalance(a.getBalance() - amount);

                }
            } else if (accounts.contains(destRequisite)) {
                for (Account b : accounts) {
                    b.setBalance(b.getBalance() + amount);
                    rsl = true;
                }
            }

        }




        return rsl;
    }

}
