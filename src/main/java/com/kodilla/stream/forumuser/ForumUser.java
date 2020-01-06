package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {

    private int id;
    private String name;
    private UserSex sex;
    private LocalDate birthDate;
    private int postAmount;

    public ForumUser(int id, String name, UserSex sex, LocalDate birthDate, int postAmount) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postAmount = postAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserSex getSex() {
        return sex;
    }

    public void setSex(UserSex sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getPostAmount() {
        return postAmount;
    }

    public void setPostAmount(int postAmount) {
        this.postAmount = postAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postAmount=" + postAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id &&
                postAmount == forumUser.postAmount &&
                Objects.equals(name, forumUser.name) &&
                sex == forumUser.sex &&
                Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, birthDate, postAmount);
    }
}
