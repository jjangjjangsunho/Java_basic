package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVloume();

        speaker.volumeUp();
        speaker.showVloume();

        speaker.volumeUp();
        speaker.showVloume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; // private 접근 오류
        speaker.showVloume();
    }
}
