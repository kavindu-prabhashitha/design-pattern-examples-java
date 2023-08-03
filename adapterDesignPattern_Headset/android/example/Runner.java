package adapterDesignPattern_Headset.android.example;

public class Runner {
    public static void main(String[] args) {
        AndroidHeadset androidHeadset = new HeadsetAdapter();
        ListenMusic lm = new ListenMusic(androidHeadset);
        lm.listenSong("Hello");

    }
}
