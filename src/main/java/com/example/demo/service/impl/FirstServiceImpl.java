package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.FirstService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FirstServiceImpl implements FirstService {

    private final UserRepository userRepository;


    public FirstServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Override
//    public Map<String, Object> getFirstData() {
//        Map<String, Object> firstDate = new HashMap<>();
//
//        firstDate.put("labe1", "check1");
//        firstDate.put("labe2", "check2");
//        firstDate.put("labe3", "check3");
//
//        return firstDate;
//    }

    @Override
    public List<User> firstTest() {
//        User user = new User();
//
//        user.name = "test";
//        user.email = "test@test.comx";
//        user.password = "pw123";
//        user.created_at = LocalDateTime.now();
//        user.updated_at = LocalDateTime.now();
//
//        this.userRepository.save(user);

        List<User> userList = this.userRepository.findAll();

        return this.userRepository.findAll();

    }
}

