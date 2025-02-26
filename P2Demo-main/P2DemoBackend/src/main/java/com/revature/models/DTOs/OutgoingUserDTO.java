package com.revature.models.DTOs;

//This is a Data Transfer Object (DTO)
//They are often used to model data that is being sent between client and server

import com.revature.models.User;

//In this case, we want to send User info without including that raw password
//Yes, we could have just made a different constructor in the User class
    //Check the videogame DTOs for more interesting uses of DTOs
public class OutgoingUserDTO {

    private int userId;
    private String username;
    private String role;

    //boilerplate----------------------


    public OutgoingUserDTO() {
    }

    public OutgoingUserDTO(int userId, String username, String role) {
        this.userId = userId;
        this.username = username;
        this.role = role;
    }

    //see this in use in get all users in UserService
    //way cleaner way to format a User into a DTO
    public OutgoingUserDTO(User u) {
        this.userId = u.getUserId();
        this.username = u.getUsername();
        this.role = u.getRole();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "OutgoingUserDTO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
