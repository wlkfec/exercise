package com.example.userservice;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class UserService {

    private static final Map<Long, User> users = Maps.newHashMap();

    static {
        users.put(1L, new User(1L, "jay", "123456"));
    }

    public void insert(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(Long id) {
        return users.get(id);
    }

    public List<User> listUsersByIds(List<Long> ids) {
        List<User> userList = Lists.newArrayList();
        for (Map.Entry<Long, User> entry : users.entrySet()) {
            if (ids.contains(entry.getKey())) {
                userList.add(entry.getValue());
            }
        }
        return userList;
    }

    public User getByUsername(String username) {
        for (Map.Entry<Long, User> entry : users.entrySet()) {
            if (username.equals(entry.getValue().getUsername())) {
                return entry.getValue();
            }
        }
        return new User();
    }

    public void update(User user) {
        for (Map.Entry<Long, User> entry : users.entrySet()) {
            if (entry.getKey().equals(user.getId())) {
                entry.getValue().setUsername(user.getUsername());
                entry.getValue().setPassword(user.getPassword());
                break;
            }
        }
    }

    public void delete(Long id) {
        users.remove(id);
    }
}
