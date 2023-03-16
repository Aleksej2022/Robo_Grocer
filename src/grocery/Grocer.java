package grocery;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class Grocer extends JFrame {
    static int index;
    static String grocery_order;

    static int new_Length;
    static int length;
    static String new_word;
    static String myString2;
    static String item_option;
    static String item1;
    static String item2;
    static String item3;
    static String Qty1;
    static String Qty2;
    static String Qty3;

    public static void main(String[] args) throws Exception{
        Scanner object = new Scanner(System.in);
        System.out.println(ANSI_Colors.ORANGE + "Welcome to the robo grocer system where you do not have to worry about writing your grocery list again!");
        Thread.sleep(2000);
        System.out.println(ANSI_Colors.RESET + "Enter your top 3 grocery order priorities");
        item_option = "1";
        System.out.println("Item 1: -> ");
        item1 = object.nextLine();
        System.out.println("Enter the quantity for item 1");
        System.out.println("Item 1 Quantity: -> ");
        Qty1 = object.nextLine();

        //Item 1 selection
        if (item_option.equals("1")){
            System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this item");
            String image_url = object.nextLine();
            Desktop desk = Desktop.getDesktop();
            //Opening the image of the item using the image address on the user's default browser
            desk.browse(new URI(image_url));
            try {
            Thread.sleep(3000);
            System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
            Robot r = new Robot();
            System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item1.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item1.jpg");
            System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
            String path = object.nextLine();
            System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
            Thread.sleep(8000);

            //Getting the screen size of the user's monitor and screen capture the image
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image,"jpg", new File(path));
            System.out.println("The item's photo has been saved successfully!");

            } catch (AWTException | IOException e){
                e.printStackTrace();
            }

        }
        //Item 2 selection
        item_option = "2";
        System.out.println("Item 2: -> ");
        item2 = object.nextLine();
        System.out.println("Enter the quantity for item 2");
        System.out.println("Item 2 Quantity: -> ");
        Qty2 = object.nextLine();

        if (item_option.equals("2")){
            System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this item");
            String image_url = object.nextLine();
            Desktop desk = Desktop.getDesktop();
            //Opening the image of the item using the image address on the user's default browser
            desk.browse(new URI(image_url));
            try {
                Thread.sleep(3000);
                System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                Robot r = new Robot();
                System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item2.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item2.jpg");
                System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                String path = object.nextLine();
                System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                Thread.sleep(8000);

                //Getting the screen size of the user's monitor and screen capture the image
                Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage Image = r.createScreenCapture(capture);
                ImageIO.write(Image,"jpg", new File(path));
                System.out.println("The item's photo has been saved successfully!");

            } catch (AWTException | IOException e){
                e.printStackTrace();
            }

        }

        //Item 3 selection
        item_option = "3";
        System.out.println("Item 3: -> ");
        item3 = object.nextLine();
        System.out.println("Enter the quantity for item 3");
        System.out.println("Item 3 Quantity: -> ");
        Qty3 = object.nextLine();

        if (item_option.equals("3")){
            System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this item");
            String image_url = object.nextLine();
            Desktop desk = Desktop.getDesktop();
            //Opening the image of the item using the image address on the user's default browser
            desk.browse(new URI(image_url));
            try {
                Thread.sleep(3000);
                System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                Robot r = new Robot();
                System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item3.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item3.jpg");
                System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                String path = object.nextLine();
                System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                Thread.sleep(8000);

                //Getting the screen size of the user's monitor and screen capture the image
                Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage Image = r.createScreenCapture(capture);
                ImageIO.write(Image,"jpg", new File(path));
                System.out.println("The item's photo has been saved successfully!");

            } catch (AWTException | IOException e){
                e.printStackTrace();
            }

        }
        System.out.println(ANSI_Colors.BLUE_BRIGHT + "Would you like to make the change to the (first) or (second) or (third) grocery item, enter none if not?");
        String grocery_pick = object.nextLine();
        do {
             if (grocery_pick.equals("first")){
                 StringBuilder myString = new StringBuilder(item1);
                 System.out.println(ANSI_Colors.RESET + "Choose the change you would like to make\nA. Change the second or only word\nB. Change the first word");
                 String choice = object.nextLine();
                 if (choice.equals("A")){
                     System.out.println("Enter the old second word or single word of the grocery item");
                     String world_old = object.nextLine();
                     index = myString.indexOf(world_old);
                     length = world_old.length();
                     new_Length = length -1;
                     myString.delete(index, new_Length + index);
                     System.out.println("Enter the new word");
                     new_word = object.nextLine();
                     myString.replace(index,new_word.length() + 3,new_word);
                     System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new second word or single word of the grocery item is " + myString);
                     myString2 = myString.toString();
                     String title = "\t\t\t GROCERY LIST";
                     grocery_order = title + "\n" + myString2 + "\t" + Qty1 + "\n" + item2 + "\t" + Qty2 + "\n" +  item3 + "\t" + Qty3 + "\n";

                     //Replace the photo of the old grocery item with the new one

                     System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this new item");
                     String image_url = object.nextLine();
                     Desktop desk = Desktop.getDesktop();
                     //Opening the image of the item using the image address on the user's default browser
                     desk.browse(new URI(image_url));
                     try {
                         Thread.sleep(3000);
                         System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                         Robot rbb = new Robot();
                         System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item1.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item1.jpg");
                         System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                         String path = object.nextLine();
                         System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                         Thread.sleep(8000);

                         //Getting the screen size of the user's monitor and screen capture the image
                         Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                         BufferedImage Image = rbb.createScreenCapture(capture);
                         ImageIO.write(Image,"jpg", new File(path));
                         System.out.println("The item's photo has been saved successfully!");

                     } catch (AWTException | IOException e){
                         e.printStackTrace();
                     }
                 }
                 else if (choice.equals("B")){
                     System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Enter the first old word of the grocery item");
                     String world_old = object.nextLine();
                     index = myString.indexOf(world_old);
                     length = world_old.length();
                     myString.delete(index,length);
                     System.out.println("Enter the new first word for the grocery item");

                     new_word = object.nextLine();
                     myString.replace(index,1,new_word + " ");
                     System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new first word of the grocery item is " + myString);

                     myString.replace(index,new_word.length() + 3,new_word);
                     System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new second word or single word of the grocery item is " + myString);
                     myString2 = myString.toString();
                     String title = "\t\t\t GROCERY LIST";
                     grocery_order = title + "\n" + myString2 + "\t" + Qty1 + "\n" + item2 + "\t" + Qty2 + "\n" +  item3 + "\t" + Qty3 + "\n";

                     //Replace the photo of the old grocery item with the new one

                     System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this new item");
                     String image_url = object.nextLine();
                     Desktop desk = Desktop.getDesktop();
                     //Opening the image of the item using the image address on the user's default browser
                     desk.browse(new URI(image_url));
                     try {
                         Thread.sleep(3000);
                         System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                         Robot rbb = new Robot();
                         System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item1.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item1.jpg");
                         System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                         String path = object.nextLine();
                         System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                         Thread.sleep(8000);

                         //Getting the screen size of the user's monitor and screen capture the image
                         Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                         BufferedImage Image = rbb.createScreenCapture(capture);
                         ImageIO.write(Image,"jpg", new File(path));
                         System.out.println("The item's photo has been saved successfully!");

                     } catch (AWTException | IOException e){
                         e.printStackTrace();
                     }
                 }
             }
             //Include the second item pick below

            if (grocery_pick.equals("second")){
                StringBuilder myString = new StringBuilder(item2);
                System.out.println(ANSI_Colors.RESET + "Choose the change you would like to make\nA. Change the second or only word\nB. Change the first word");
                String choice = object.nextLine();
                if (choice.equals("A")){
                    System.out.println("Enter the old second word or single word of the grocery item");
                    String world_old = object.nextLine();
                    index = myString.indexOf(world_old);
                    length = world_old.length();
                    new_Length = length -1;
                    myString.delete(index, new_Length + index);
                    System.out.println("Enter the new word");
                    new_word = object.nextLine();
                    myString.replace(index,new_word.length() + 3,new_word);
                    System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new second word or single word of the grocery item is " + myString);
                    myString2 = myString.toString();
                    String title = "\t\t\t GROCERY LIST";
                    grocery_order = title + "\n" + item1 + "\t" + Qty1 + "\n" + myString2 + "\t" + Qty2 + "\n" +  item3 + "\t" + Qty3 + "\n";

                    //Replace the photo of the old grocery item with the new one

                    System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this new item");
                    String image_url = object.nextLine();
                    Desktop desk = Desktop.getDesktop();
                    //Opening the image of the item using the image address on the user's default browser
                    desk.browse(new URI(image_url));
                    try {
                        Thread.sleep(3000);
                        System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                        Robot rbb = new Robot();
                        System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item1.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item1.jpg");
                        System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                        String path = object.nextLine();
                        System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                        Thread.sleep(8000);

                        //Getting the screen size of the user's monitor and screen capture the image
                        Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                        BufferedImage Image = rbb.createScreenCapture(capture);
                        ImageIO.write(Image,"jpg", new File(path));
                        System.out.println("The item's photo has been saved successfully!");

                    } catch (AWTException | IOException e){
                        e.printStackTrace();
                    }
                }
                else if (choice.equals("B")){
                    System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Enter the first old word of the grocery item");
                    String world_old = object.nextLine();
                    index = myString.indexOf(world_old);
                    length = world_old.length();
                    myString.delete(index,length);
                    System.out.println("Enter the new first word for the grocery item");

                    new_word = object.nextLine();
                    myString.replace(index,1,new_word + " ");
                    System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new first word of the grocery item is " + myString);

                    myString.replace(index,new_word.length() + 3,new_word);
                    System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new second word or single word of the grocery item is " + myString);
                    myString2 = myString.toString();
                    String title = "\t\t\t GROCERY LIST";
                    grocery_order = title + "\n" + item1 + "\t" + Qty1 + "\n" + myString2 + "\t" + Qty2 + "\n" +  item3 + "\t" + Qty3 + "\n";

                    //Replace the photo of the old grocery item with the new one

                    System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this new item");
                    String image_url = object.nextLine();
                    Desktop desk = Desktop.getDesktop();
                    //Opening the image of the item using the image address on the user's default browser
                    desk.browse(new URI(image_url));
                    try {
                        Thread.sleep(3000);
                        System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                        Robot rbb = new Robot();
                        System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item1.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item1.jpg");
                        System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                        String path = object.nextLine();
                        System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                        Thread.sleep(8000);

                        //Getting the screen size of the user's monitor and screen capture the image
                        Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                        BufferedImage Image = rbb.createScreenCapture(capture);
                        ImageIO.write(Image,"jpg", new File(path));
                        System.out.println("The item's photo has been saved successfully!");

                    } catch (AWTException | IOException e){
                        e.printStackTrace();
                    }
                }
            }

            //Insert the third grocery pick change below

            else if (grocery_pick.equals("third")){
                StringBuilder myString = new StringBuilder(item3);
                System.out.println(ANSI_Colors.RESET + "Choose the change you would like to make\nA. Change the second or only word\nB. Change the first word");
                String choice = object.nextLine();
                if (choice.equals("A")){
                    System.out.println("Enter the old second word or single word of the grocery item");
                    String world_old = object.nextLine();
                    index = myString.indexOf(world_old);
                    length = world_old.length();
                    new_Length = length -1;
                    myString.delete(index, new_Length + index);
                    System.out.println("Enter the new word");
                    new_word = object.nextLine();
                    myString.replace(index,new_word.length() + 3,new_word);
                    System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new second word or single word of the grocery item is " + myString);
                    myString2 = myString.toString();
                    String title = "\t\t\t GROCERY LIST";
                    grocery_order = title + "\n" + item1 + "\t" + Qty1 + "\n" + item2 + "\t" + Qty2 + "\n" +  myString2 + "\t" + Qty3 + "\n";

                    //Replace the photo of the old grocery item with the new one

                    System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this new item");
                    String image_url = object.nextLine();
                    Desktop desk = Desktop.getDesktop();
                    //Opening the image of the item using the image address on the user's default browser
                    desk.browse(new URI(image_url));
                    try {
                        Thread.sleep(3000);
                        System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                        Robot rbb = new Robot();
                        System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item1.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item1.jpg");
                        System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                        String path = object.nextLine();
                        System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                        Thread.sleep(8000);

                        //Getting the screen size of the user's monitor and screen capture the image
                        Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                        BufferedImage Image = rbb.createScreenCapture(capture);
                        ImageIO.write(Image,"jpg", new File(path));
                        System.out.println("The item's photo has been saved successfully!");

                    } catch (AWTException | IOException e){
                        e.printStackTrace();
                    }
                }
                else if (choice.equals("B")){
                    System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Enter the first old word of the grocery item");
                    String world_old = object.nextLine();
                    index = myString.indexOf(world_old);
                    length = world_old.length();
                    myString.delete(index,length);
                    System.out.println("Enter the new first word for the grocery item");

                    new_word = object.nextLine();
                    myString.replace(index,1,new_word + " ");
                    System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new first word of the grocery item is " + myString);

                    myString.replace(index,new_word.length() + 3,new_word);
                    System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "The new second word or single word of the grocery item is " + myString);
                    myString2 = myString.toString();
                    String title = "\t\t\t GROCERY LIST";
                    grocery_order = title + "\n" + item1 + "\t" + Qty1 + "\n" + item2 + "\t" + Qty2 + "\n" +  myString2 + "\t" + Qty3 + "\n";

                    //Replace the photo of the old grocery item with the new one

                    System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the image address URL for this new item");
                    String image_url = object.nextLine();
                    Desktop desk = Desktop.getDesktop();
                    //Opening the image of the item using the image address on the user's default browser
                    desk.browse(new URI(image_url));
                    try {
                        Thread.sleep(3000);
                        System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT + "Please create a file on your computer called IMAGES to store your grocery item pictures");
                        Robot rbb = new Robot();
                        System.out.println("Enter the file path for where would you like to store picture\nAlso make sure to add the image name dot the extension which should be jpg(item1.jpg) \nAfter you insert the file path for storing the image here\nFor example: -> C:\\Users\\m\\Downloads\\Student Materials For This Lesson\\Images\\item1.jpg");
                        System.out.println(ANSI_Colors.RED_BOLD + "Enter the file path where would you like to store the item image in");
                        String path = object.nextLine();
                        System.out.println(ANSI_Colors.RED + "Notification: -> Please open the image of the item from your browser back up \nWait for 5 seconds on the image so the screenshot can be taken!");
                        Thread.sleep(8000);

                        //Getting the screen size of the user's monitor and screen capture the image
                        Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                        BufferedImage Image = rbb.createScreenCapture(capture);
                        ImageIO.write(Image,"jpg", new File(path));
                        System.out.println("The item's photo has been saved successfully!");

                    } catch (AWTException | IOException e){
                        e.printStackTrace();
                    }
                }
            }


            System.out.println(ANSI_Colors.BLUE_BOLD_BRIGHT + "Would you like to make a change to the (first) or (second) or (third) grocery item, enter none if not?");
            grocery_pick = object.nextLine();

        } while (grocery_pick.equals("first") || grocery_pick.equals("second") || grocery_pick.equals("third"));

        if (grocery_pick.equals("none")){
            System.out.println(ANSI_Colors.RESET + "Please make sure to save your grocery item list on notepad");
            Thread.sleep(2000);
            //open Notepad
            Runtime.getRuntime().exec("notepad.exe");
            Thread.sleep(2000);
            Robot robot = new Robot();
            for (int i = 0; i < grocery_order.length(); i++){
                if (Character.isUpperCase(grocery_order.charAt(i))){
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(Character.toUpperCase(grocery_order.charAt(i)));
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
                else {
                    robot.keyPress(Character.toUpperCase(grocery_order.charAt(i)));
                    Thread.sleep(200);
                }
            }
        }


    }
}
