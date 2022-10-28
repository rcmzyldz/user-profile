package com.todo.userprofile.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class User {

    Long id;
    String username;
    String email;
    String password;

}
