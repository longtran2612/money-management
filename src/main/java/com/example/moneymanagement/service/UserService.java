package com.example.moneymanagement.service;

import com.example.moneymanagement.base.BaseService;
import com.example.moneymanagement.domain.User;
import com.example.moneymanagement.dto.request.user.CreateUserRequest;
import com.example.moneymanagement.repository.UserRepository;
import com.example.moneymanagement.utils.MappingUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 3:43 PM 05-Mar-23
 * Long Tran
 */
@Service
@RequiredArgsConstructor
public class UserService extends BaseService {

    private final UserRepository userRepository;

    public User create(CreateUserRequest request ) {
        var user = MappingUtils.mapObject(request, User.class);
        user.setId(sequenceValueService.getSequence(User.class));
        return userRepository.save(user);
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }


}
