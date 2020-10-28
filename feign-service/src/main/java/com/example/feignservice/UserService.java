package com.example.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// fallback = UserFallbackService.class
@FeignClient(value = "user-service", fallback = UserFallbackService.class)
public interface UserService {

    @PostMapping("/user/insert")
    Result insert(@RequestBody User user);

    @GetMapping("/user/{id}")
    Result<User> getUser(@PathVariable Long id);

    @GetMapping("/user/listUsersByIds")
    Result<List<User>> listUsersByIds(@RequestParam List<Long> ids);

    @GetMapping("/user/getByUsername")
    Result<User> getByUsername(@RequestParam String username);

    @PostMapping("/user/update")
    Result update(@RequestBody User user);

    @PostMapping("/user/delete/{id}")
    Result delete(@PathVariable Long id);

}
