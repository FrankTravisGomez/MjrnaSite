package com.codeup.site.models;

import jakarta.persistence.*;

import java.security.Timestamp;
@Entity
@Table(name="users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "discord_name")
    private String discordName;

    @Column(name = "vr_chat_name")
    private String vrChatName;

    @Column(name = "email_verified", nullable = false)
    private boolean emailVerified;

    @Column(name = "receive_updates", nullable = false)
    private boolean receiveUpdates;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "reset_token")
    private String resetToken;

    @Column(name = "reset_token_expiry")
    private Timestamp resetTokenExpiry;

    @Column(name = "is_admin", nullable = false)
    private boolean isAdmin;

    public User() {

    }

    public User(String firstName, String lastName, String email, String discordName, String vrChatName, boolean emailVerified,
                boolean receiveUpdates, String passwordHash, String resetToken, Timestamp resetTokenExpiry, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.discordName = discordName;
        this.vrChatName = vrChatName;
        this.emailVerified = emailVerified;
        this.receiveUpdates = receiveUpdates;
        this.passwordHash = passwordHash;
        this.resetToken = resetToken;
        this.resetTokenExpiry = resetTokenExpiry;
        this.isAdmin = isAdmin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiscordName() {
        return discordName;
    }

    public void setDiscordName(String discordName) {
        this.discordName = discordName;
    }

    public String getVrChatName() {
        return vrChatName;
    }

    public void setVrChatName(String vrChatName) {
        this.vrChatName = vrChatName;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public boolean isReceiveUpdates() {
        return receiveUpdates;
    }

    public void setReceiveUpdates(boolean receiveUpdates) {
        this.receiveUpdates = receiveUpdates;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public Timestamp getResetTokenExpiry() {
        return resetTokenExpiry;
    }

    public void setResetTokenExpiry(Timestamp resetTokenExpiry) {
        this.resetTokenExpiry = resetTokenExpiry;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
