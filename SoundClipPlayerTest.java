public class SoundClipPlayerTest {
    public static void main(String[] args) {
        // sound files are in ....github/oodfinal_tamagotchi/out/resources
        SoundClipPlayer player = new SoundClipPlayer("out/resources");

        try {
            player.loadClip("eat", "eating-sound-effect-36186.wav");
            player.loadClip("sleep", "kb_sleepingcat_short-36741.wav");
            player.loadClip("play", "boing-spring-mouth-harp-04-20-13-4-103346.wav");
            player.loadClip("heal", "health-pickup-6860.wav");
            System.out.println("Load test: PASSED");
        } catch (Exception e) {
            System.out.println("Load test: FAILED - " + e.getMessage());
        }

        try {
            // when playing clip, sleep thread for as long as you desire the clip to play
            player.playClip("eat");
            Thread.sleep(1000);
            player.playClip("sleep");
            Thread.sleep(3000);
            player.playClip("play");
            Thread.sleep(2000);
            player.playClip("heal");
            Thread.sleep(2000);
            System.out.println("Play test: PASSED");
        } catch (Exception e) {
            System.out.println("Play test: FAILED - " + e.getMessage());
        }
    }
}
