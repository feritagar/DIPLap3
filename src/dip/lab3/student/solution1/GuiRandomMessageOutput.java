/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author FA
 */
public class GuiRandomMessageOutput implements MessageOutput {

    @Override
    public void displayMessageOutput() {
        //Different Languages - Greeting List 
        List<String> greetingList = new ArrayList<>();
        greetingList.add("Hello!");
        greetingList.add("Merhaba!");
        greetingList.add("Hola");
        greetingList.add("Kon'nichiwa!");
        greetingList.add("Ni hao!");

        // random number generator
        Random rand = new Random();

        //generate random number of Array List size.
        //So adding or removing doesn't effect code
        //If array list is empty, program doesn't crash.
        if (greetingList.size() > 0) {
            int number = rand.nextInt(greetingList.size());

            String message = greetingList.get(number);
            //random message Gui output 
            JOptionPane.showMessageDialog(null,message);
        }

    }
}
