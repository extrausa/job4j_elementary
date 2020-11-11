package ru.job4j.ex;
//0.5. Иерархия исключений и множественный catch. [#363102]
public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User name = null;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUserName())) {
                name = users[i];
                break;
            } else {
                throw new UserNotFoundException("Not found");
            }

        }

        return name;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user == null) {
            throw new UserInvalidException("User login invalid");
        }

        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
