/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author FA
 */
public class UserMessageInput implements MessageInput {

    private String userName;
    private String userMessage;

    public UserMessageInput(String userName) {
        this.userName = userName;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null || userName.length() == 0) {
            throw new UnsupportedOperationException("User Name CAN NOT be empty!!!");
        }
        this.userName = userName;
    }

    public String getMessage() {
        return userMessage;
    }

    public void setMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    @Override
    public void getMessageInput() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Hello " + userName + " Please enter your message");
        userMessage = scn.nextLine();
//        uncomment this part to see user input
//        System.out.println(userName + ": " + userMessage);  

    }

}
