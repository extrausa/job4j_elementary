package ru.job4j.bank;
//3. Банковские переводы [#363068]
import java.lang.reflect.Array;
import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
       User pass = findByPassport(passport);
       if (pass != null) {
           for (List ac : users.values()) {
               if (!ac.equals(account)){
                   ac.add(account);
                   users.put(pass, ac);
               }
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
       if (user != null) {
           for (User us : users.keySet()) {
               List<Account> ac = users.get(us);
               for (int i = 0; i < ac.size() ; i++) {
                   if (ac.get(i).getRequisite().equals(requisite)) {
                       return ac.get(i);
                   }
               }
           }
       }

        return null;

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
       User srcUser = findByPassport(srcPassport);
       User destUser = findByPassport(destPassport);
       if (srcUser != null && destUser != null) {
           for (User us : users.keySet()) {
               List<Account> ac = users.get(us);
               for (int i = 0; i < ac.size(); i++) {
                   if (ac.get(i).getRequisite().equals(srcRequisite)) {
                       if(ac.get(i).getBalance() > amount){
                           double srcBalance = ac.get(i).getBalance();
                           ac.get(i).setBalance(srcBalance - amount);
                       }
                   }
                   if (ac.get(i).getRequisite().equals(destRequisite)){
                       double destBalance = ac.get(i).getBalance();
                       ac.get(i).setBalance(destBalance + amount);
                       rsl = true;
                       break;
                   }
               }
           }
       }
        return rsl;
    }

}
