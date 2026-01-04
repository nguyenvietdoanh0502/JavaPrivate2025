package org.example.model;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String id;
    private String username;
    private String password;
}
