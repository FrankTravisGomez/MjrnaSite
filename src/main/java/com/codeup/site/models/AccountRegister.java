package com.codeup.site.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.security.Timestamp;
public class AccountRegister {


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
}
