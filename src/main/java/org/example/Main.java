package org.example;

import lombok.Data;


import module.WrongLoginException;
import module.WrongPasswordException;

import java.util.Scanner;

import static module.CheckerEnter.check;

@Data
public class Main {
    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите логин: ");
            String login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();
            System.out.print("Введите пароль еще раз : ");
            String confirm_password = scanner.nextLine();


        try{
             check ( login, password, confirm_password);
            System.out.println("Login and password are valid.");
        }catch(  WrongLoginException e){
            System.out.println("Wrong login: " + e.getMessage());
        }catch(  WrongPasswordException e){
            System.out.println("Wrong password: " + e.getMessage());
        }
    }
}