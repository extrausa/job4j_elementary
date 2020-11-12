package ru.job4j.ex;
//0.5. Иерархия исключений и множественный catch. [#363102]
public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User name = null;

        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUserName())) {
                name = users[i];
                break;
            }
        }
        if (name == null) {
            throw new UserNotFoundException("Not found user");
        }
        return name;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User login invalid");
        }
        if (user.getUserName().length() < 3) {
            throw new UserInvalidException("Name < 3 characters");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Nikolay Arsentev", false)
        };
        //User user = findUser(users, "Pettr Arsentev");
        try {
            User user = findUser(users, "Petr Arsentev");
            User user2 = findUser(users, "Nikolay Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
            if (validate(user2)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch(UserNotFoundException e) {
            e.printStackTrace();
        }



    }
}
