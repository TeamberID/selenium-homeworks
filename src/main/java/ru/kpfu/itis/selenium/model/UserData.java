package ru.kpfu.itis.selenium.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserData {
    private String login;
    private String password;
}
