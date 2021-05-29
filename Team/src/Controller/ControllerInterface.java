package Controller;

import Controller.AudioPlayer.AudioPlayer;
import Model.Paddle.Paddle;

public class ControllerInterface {

    AudioPlayer audioPlayer = new AudioPlayer();

    public void playBackgroundMusic(){
        audioPlayer.playBackgroundMusic();
    }

    public void stopBackgroundMusic(){
        audioPlayer.stopBackgroundMusic();
    }

    public void setUpGame(){

    }

}
