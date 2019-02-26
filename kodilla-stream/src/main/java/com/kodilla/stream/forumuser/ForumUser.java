package com.kodilla.stream.forumuser;

import java.time.LocalDate;


public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final int numberOfUserPosts;
    private final LocalDate birthDate;


    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfUserPosts() {
        return numberOfUserPosts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public ForumUser(final int userId, final String username, final char sex, final int numberOfUserPosts,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.numberOfUserPosts = numberOfUserPosts;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", numberOfUserPosts=" + numberOfUserPosts +
                ", birthDate=" + birthDate +
                '}';

    }
}