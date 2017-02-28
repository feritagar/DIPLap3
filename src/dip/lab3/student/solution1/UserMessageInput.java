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
        this.userMessage = userName;

    }

    public final String getUserName() {
        return userName;
    }
    //open-close princible.All concrete method should be final.
    //dangerous inheritance
    public final void setUserName(String userName) {
        if (userName == null || userName.length() == 0) {
            throw new IllegalArgumentException("User Name CAN NOT be empty!!!");
        }
        this.userName = userName;
    }

    public final String getMessage() {
        return userMessage;
    }

    public final void setMessage(String userMessage) {
        if (userMessage == null || userMessage.length() == 0) {
            throw new IllegalArgumentException("no message");
        }
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
