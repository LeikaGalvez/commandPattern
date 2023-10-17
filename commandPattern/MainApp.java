package commandPattern;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Lights lights = new Lights();
        MusicPlayer musicPlayer = new MusicPlayer();
        RemoteControl remoteControl = new RemoteControl();

        TurnOnLights turnOnLights = new TurnOnLights(lights);
        TurnOffLights turnOffLights = new TurnOffLights(lights);
        IncreaseBrightness increaseBrightness = new IncreaseBrightness(lights);
        DecreaseBrightness decreaseBrightness = new DecreaseBrightness(lights);

        StartPlaylist startPlaylist = new StartPlaylist(musicPlayer);
        StopPlaylist stopPlaylist = new StopPlaylist(musicPlayer);
        IncreaseVolume increaseVolume = new IncreaseVolume(musicPlayer);
        DecreaseVolume decreaseVolume = new DecreaseVolume(musicPlayer);

        Scanner sc = new Scanner(System.in);
        int device=0;

        while (device!=3) {
            device=0;
            System.out.print("\nWelcome home!\n1.) Lights\n2.) Music Player\n3.) Exit\nChoose a device: ");
            device = sc.nextInt();
            System.out.println();

            if (device == 1){
                int func=0;
                while (func !=5){
                    System.out.print("1.) Turn On\n2.) Turn Off\n3.) Increase Brightness\n4.) Decrease Brightness" +
                            "\n5.) Exit\nChoose function: ");
                    func = sc.nextInt();
                    System.out.println();

                    if(func == 1) {
                        remoteControl.setCommand(turnOnLights);
                        remoteControl.clickButton();
                    } else if (func == 2) {
                        remoteControl.setCommand(turnOffLights);
                        remoteControl.clickButton();
                    } else if (func == 3) {
                        remoteControl.setCommand(increaseBrightness);
                        remoteControl.clickButton();
                    } else if (func == 4) {
                        remoteControl.setCommand(decreaseBrightness);
                        remoteControl.clickButton();
                    } else if (func == 5) {
                        System.out.println("Going back to home...");
                        break;
                    } else {
                        System.out.println("Please choose another function:");
                    }
                }
            } else if (device == 2) {
                int func=0;
                while (func!=5){
                    System.out.print("1.) Start playlist\n2.) Stop playlist\n3.) Increase Volume\n4.) Decrease Volume" +
                            "\n5.) Exit\nChoose function: ");
                    func = sc.nextInt();
                    System.out.println();

                    if(func == 1) {
                        remoteControl.setCommand(turnOnLights);
                        remoteControl.clickButton();
                    } else if (func == 2) {
                        remoteControl.setCommand(turnOffLights);
                        remoteControl.clickButton();
                    } else if (func == 3) {
                        remoteControl.setCommand(increaseBrightness);
                        remoteControl.clickButton();
                    } else if (func == 4) {
                        remoteControl.setCommand(decreaseBrightness);
                        remoteControl.clickButton();
                    } else if (func == 5) {
                        System.out.println("Going back to home...");
                        break;
                    } else {
                        System.out.println("Please choose another function:");
                    }
                }
            } else if (device==3) {
                System.out.println("Exiting app...");
            } else {
                System.out.println("Please choose another device.");
            }
        }
    }

}
