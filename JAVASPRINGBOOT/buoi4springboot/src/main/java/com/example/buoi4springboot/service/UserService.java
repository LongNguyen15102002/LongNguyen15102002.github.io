package com.example.buoi4springboot.service;

import com.example.buoi4springboot.dto.UserDto;
import com.example.buoi4springboot.exception.BadRequestException;
import com.example.buoi4springboot.exception.NotFoundException;
import com.example.buoi4springboot.model.User;
import com.example.buoi4springboot.repository.UserRepository;
import com.example.buoi4springboot.request.UpsertUserRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {
    private List<User> users;
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return users;
    }
    public UserDto findById(Integer id){
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Id này không tồn tại: " + id));
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getAddress(),
                user.getAvatar()
        );
    }
    public UserDto findByName(String name){
        User user = userRepository.findByName(name).orElseThrow(() -> new NotFoundException("Tên người dùng này không tồn tại: " + name));
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getAddress(),
                user.getAvatar()
        );
    }

    public User createUser(UpsertUserRequest request){
        Random random = new Random();
        int id = random.nextInt(20);

        User user = new User(
                id,
                request.getName(),
                request.getEmail(),
                request.getPhone(),
                request.getAddress(),
                request.getAvatar(),
                request.getPassword()
        );
        users.add(user);
        return user;
    }

    public User updateUserById(int id, UpsertUserRequest request){
        for (User user: users){
            if(user.getId() == id) {
                user.setName(request.getName());
                user.setPhone(request.getPhone());
                user.setAddress(request.getAddress());
                return user;
            }
        }
        throw new NotFoundException("Id này không tồn tại: " + id);
    }

    public void deleteUserById(int id){
        for (User user: users){
            if (user.getId() == id){
                users.remove(user);
            }
        }
    }

    public void updateUserAvatarById(int id, UpsertUserRequest request){
        for (User user: users){
            if(user.getId() == id){
                user.setAvatar(request.getAvatar());
            }
        }
    }

    public void changeUserPasswordById(int id, UpsertUserRequest request, String newPassword){
        for (User user: users){
            if(user.getId() == id){
                if(user.getPassword() != request.getPassword()){
                    throw new BadRequestException("Mật khẩu cũ nhập không đúng");
                } else if (newPassword == user.getPassword()) {
                    throw new BadRequestException("Mật khẩu đã tồn tại");
                }
            }
        }
    }

    public String forgotUserPassword(int id, String newPassword, UpsertUserRequest request){
        for (User user: users){
            if(user.getId() == id){
                user.setPassword(request.getPassword());
            }
        }
        return "Mật khẩu mới của id " + id + "là: " + newPassword;
    }
}
