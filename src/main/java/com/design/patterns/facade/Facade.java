package com.design.patterns.facade;

/*
* Facade design pattern provides a simplified interface that makes the system easier to use.
* It defines a higher level interface that makes the subsystem easier to use
* */
public class Facade {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade1 = new MultimediaFacade();
        multimediaFacade1.playMedia("city_boys.mp3", MediaType.AUDIO);
        multimediaFacade1.stopMedia(MediaType.AUDIO);

        MultimediaFacade multimediaFacade2 = new MultimediaFacade();
        multimediaFacade2.playMedia("bad_boys2", MediaType.VIDEO);
        multimediaFacade2.stopMedia(MediaType.VIDEO);
    }
}

// Facade class
class MultimediaFacade {
    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    // facade methods to simplify interactions

    public void playMedia(String file, MediaType mediaType) {
        if (mediaType == MediaType.AUDIO) {
            audioPlayer.playAudio(file);
        } else if (mediaType == MediaType.VIDEO) {
            videoPlayer.playVideo(file);
        } else {
            System.out.println("Unsupported media type");
        }
    }

    public void stopMedia(MediaType mediaType) {
        if (mediaType == MediaType.AUDIO) {
            audioPlayer.stopAudio();
            System.out.println("Audio player stopped");
        } else if (mediaType == MediaType.VIDEO) {
            videoPlayer.stopVideo();
            System.out.println("Video player stopped");;
        } else {
            System.out.println("Unsupported media type");
        }
    }
}

class AudioPlayer {
    public void playAudio(String file) {
        System.out.println("Playing audio file: " + file);
    }

    public void stopAudio() {
        System.out.println("Stopping audio file.");
    }
}

class VideoPlayer {
    public void playVideo(String file) {
        System.out.println("Playing video file " + file);
    }

    public void stopVideo() {
        System.out.println("Stopping video file");
    }
}

enum MediaType {
    AUDIO, VIDEO
}
