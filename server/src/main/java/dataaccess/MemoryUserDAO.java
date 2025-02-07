package dataaccess;

import model.UserData;

import java.util.HashMap;

public class MemoryUserDAO implements UserDAO {
    HashMap<String, UserData> userDB = new HashMap<>();

    @Override
    public void clear() {
        userDB.clear();
    }

    @Override
    public void createUser(UserData user) {
        userDB.put(user.username(), user);
    }

    @Override
    public model.UserData getUser(String username) {
        return userDB.get(username);
    }

    public int getDBSize() {
        return userDB.size();
    }
}
