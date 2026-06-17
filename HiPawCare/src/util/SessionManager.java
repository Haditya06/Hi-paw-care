/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Dit
 */
public class SessionManager {
    private static SessionManager instance;
    private String username;
    private String role;
    private SessionManager() {
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }

        return instance;
    }

    public void login(String username,String role) {
        this.username = username;
        this.role = role;
    }

    public void logout() {
        username = null;
        role = null;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
