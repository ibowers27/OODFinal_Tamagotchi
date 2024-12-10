public class SoundClipPlayerTest {
    public static void main(String[] args) {
        SoundClipPlayer player = new SoundClipPlayer("resources");

        try {
            player.loadClip("eat", "eating-sound-effect-36186.wav");
            System.out.println("Load test: PASSED");
        } catch (Exception e) {
            System.out.println("Load test: FAILED - " + e.getMessage());
        }

        try {
            player.playClip("eat");
            System.out.println("Play test: PASSED");
        } catch (Exception e) {
            System.out.println("Play test: FAILED - " + e.getMessage());
        }
    }
}
