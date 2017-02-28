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
public class Startup {

   

    public static void main(String[] args) {

        
        MessageInput input = new UserMessageInput("ferit");
        MessageOutput output = new GuiRandomMessageOutput();
        
       
        MessageInputOutputService service = new MessageInputOutputService(input,output);
        //input method
        service.getMessage();
        //Gui-random-output method
        service.displayMessage();
        
    
      
    }

}
