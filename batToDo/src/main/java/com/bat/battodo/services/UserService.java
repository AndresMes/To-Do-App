package com.bat.battodo.services;

import com.bat.battodo.dtos.request.UserDTORequest;
import com.bat.battodo.dtos.response.UserDTOResponse;

import java.util.List;

public interface UserService {

    UserDTOResponse saveUser(UserDTORequest userDTORequest);
    UserDTOResponse getUserById(Long id);
    List<UserDTOResponse> getAllUsers();
    UserDTOResponse updateUser(UserDTORequest userDTORequest);
    void deleteUserByEmail(String email);
}
