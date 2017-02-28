/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author FA
 */
public class MessageInputOutputService {

    //for any inputMessage Service
    private MessageInput inputMessage;
    //for any outputMessage Service
    private MessageOutput outputMessage;

    //constructor
    public MessageInputOutputService(MessageInput inputMessage, MessageOutput outputMessage) {
        this.inputMessage = inputMessage;
        this.outputMessage = outputMessage;
    }

    // delegate work to low level MessageInput class
    public void getMessage() {
        inputMessage.getMessageInput();
    }

    // delegate work to low level MessageOutput class
    public void displayMessage() {
        outputMessage.displayMessageOutput();
    }

    //inputMessage getter setter methods
    public MessageInput getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(MessageInput inputMessage) {
        this.inputMessage = inputMessage;
    }

    //outputMessage getter setter methods
    public MessageOutput getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(MessageOutput outputMessage) {
        this.outputMessage = outputMessage;
    }

}
