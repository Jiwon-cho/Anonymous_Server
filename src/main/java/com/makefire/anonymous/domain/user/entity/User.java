package com.makefire.anonymous.domain.user.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *packageName : com.makefire.anonymous
 * fileName : User
 * author : 최푸름
 * date : 22-01-14
 * description : 유저 엔티티
 * =================================
 * DATE     AUTHOR   NOTE
 * 22-01-15 최푸름
 * ---------------------------------
 */




@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;





}