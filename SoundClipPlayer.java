import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SoundClipPlayer implements SoundClip {
    // for storing all sound clips with their names for simple retrieval
    private final Map<String, Clip> clips = new HashMap<>();
    // base path for sound file storage + constructor to set
    private final String soundBasePath;

    public SoundClipPlayer(String soundBasePath) {
        this.soundBasePath = soundBasePath;
    }
    @Override
    public void loadClip(String soundName, String filePath) {
        try {
            // create full path for file retrieval
            String fullPath = soundBasePath + File.separator + filePath;
            System.out.println("attempting load from " + fullPath);
            // fetch input stream from the file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    new File(fullPath).getAbsoluteFile()
            );
            // create, open input stream & store clip in the map
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clips.put(soundName, clip);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e)  {
            // catch and print errors regarding file input, file location and other input invalidity
            System.err.println("Error loading sound clip " + soundName + " " + e.getMessage());
        }
    }

    @Override
    public void playClip(String soundName) {
        // find clip in the hashmap
        Clip clip = clips.get(soundName);
        if (clip != null) {
            // thread to ensure audio can play alongside display without issue
            new Thread(() -> {
                // restart clip & play
                clip.setFramePosition(0);
                clip.start();
            }).start();
        } else {
            System.err.println("Sound clip " + soundName + " not found.");
        }
    }
    @Override
    public void stopClip(String soundName) {
        // find clip in the hashmap
        Clip clip = clips.get(soundName);
        if (clip != null) {
            // stop clip & restart for replay purposes
            clip.stop();
            clip.setFramePosition(0);
        }
    }

    @Override
    public void setVolume(float volume) {
        // ensure volume isn't below 0 or above 1
        volume = Math.max(0.0f, Math.min(1.0f, volume));
        // iterate through all loaded clips
        for (Clip clip : clips.values()) {
            // get volume control for the clip using MASTER_GAIN, allows adjustment of volume
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            // convert volume to decibels for the setValue method
            float dB = (float) (Math.log(volume) / Math.log(10) * 20);
            volumeControl.setValue(volume);
        }
    }
}