package com.aplose.digihello.service;

import com.aplose.digihello.model.UserInfo;
import com.aplose.digihello.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public UserInfo findByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }

    public UserInfo saveUser(UserInfo user) {
        return userInfoRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userInfoRepository.deleteById(userId);
    }
}
