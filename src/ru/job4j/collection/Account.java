package ru.job4j.collection;

import java.util.Objects;

public class Account {
    private String passport;
    private String userName;
    private String deposit;

    public Account(String passport, String userName, String deposite) {
        this.passport = passport;
        this.userName = userName;
        this.deposit = deposite;
    }

    @Override
    public String toString() {
        return "Account{" +
                "passport='" + passport + '\'' +
                ", username='" + userName + '\'' +
                ", deposit='" + deposit + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return Objects.equals(passport, account.passport);
    }
}
