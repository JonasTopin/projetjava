package view;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    public Sound(){
        File Clap = new File("../Music/Bomberman.wav");
        PlaySound(Clap);
        
    }
    static void PlaySound(File Sound){

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

        }catch(Exception e){

        }
    }
}