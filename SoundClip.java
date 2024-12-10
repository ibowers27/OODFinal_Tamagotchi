public interface SoundClip {
    void loadClip(String soundName, String filePath);
    void playClip(String soundName);
    void stopClip(String soundName);
    void setVolume(float volume);
}