package ru.job4j.bank;
//3. Банковские переводы [#363068]
//6. Тестовое задание из модуля коллекции Lite переделать на Stream API. [#362891]
import java.lang.reflect.Array;
import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
       User user = findByPassport(passport);
       if (user != null) {
           List<Account> list = users.get(user);
           if (!list.contains(account)) {
               list.add(account);
           }
       }
    }

    public User findByPassport(String passport) {
//        for (User user : users.keySet()) {
//            if (user.getPassport().equals(passport)) {
//               return user;
//            }
//
//        }
//        return null;
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
       if (user != null) {
//            List<Account> ac = users.get(user);
//            for (int i = 0; i < ac.size() ; i++) {
//                 if (ac.get(i).getRequisite().equals(requisite)) {
//                    return ac.get(i);
//                 }
//            }
           return  users.get(user)
                   .stream()
                   .filter(account -> account.getRequisite().equals(requisite))
                   .findFirst()
                   .orElse(null);
       }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport,srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
