package com.PerSEO.Hexagonalintentoryapp.product.application;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Category;
import com.PerSEO.Hexagonalintentoryapp.product.domain.model.User;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.ICategoryRepository;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IUserRepository;

public class UserService {

    private final IUserRepository userRepository;

    /// --- Constructor
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /// --- metods

    /**
     * Save user
     * @param user
     * @return
     */
    public User save(User user){
        return userRepository.save(user);

    }

    /**
     * Find all Users
     * @return
     */
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    /**
     * Find user by Email
     * @param email
     * @return
     */
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    /**
     * Find User by id
     * @param id
     * @return
     */
    public User findById(Integer id){
        return userRepository.findById(id);
    }

    /**
     * Delete user by id
     * @param id
     */
    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }



}
