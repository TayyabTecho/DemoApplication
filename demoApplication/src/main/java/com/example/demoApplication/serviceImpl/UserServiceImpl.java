//package com.example.demoApplication.serviceImpl;
//
//import com.example.demoApplication.model.User;
//import com.example.demoApplication.repository.UserRepository;
//import com.example.demoApplication.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserServiceImpl extends UserService {
//@Autowired
//    public UserRepository repository;
//
////    public void createUser(User user) {
////repository.save(user);
////    }
//    public void createUser(User request){
//        User entity=new User();
//        entity.setUserName(request.getUserName());
//        entity.setEmail(request.getEmail());
//    entity.setPhoneNumber(request.getPhoneNumber());
//    repository.save(entity);
//    }
//
//    public List<User> findAll() {
//        return repository.findAll();
//    }
//
//    public User updateById(Long userId, User changeduser) {
//        User dbUser;
//        dbUser = repository.findById(userId).orElseThrow(() -> new RuntimeException("id not found"));
//        if (changeduser.getEmail() != null) {
//            dbUser.setEmail(changeduser.getEmail());
//        }
//        if (changeduser.getUserName() != null) {
//            dbUser.setUserName(changeduser.getUserName());
//        }
//        if (changeduser.getPhoneNumber() != null) {
//            dbUser.setPhoneNumber(changeduser.getPhoneNumber());
//        }
//        return repository.save(dbUser);
//    }
////    dbUser.setEmail("f");
////    User updateUser=repository.save(dbUser);
////    return updateUser;
////    }
//
//    public User findById(Long userId) {
//   return repository.findById(userId).orElseThrow(()->new RuntimeException("user not found"));
//    }
//
//    public void deleteById(Long userId) {
//    }
//}
