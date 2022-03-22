public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if(type.equalsIgnoreCase("mkv")){
            advancedMediaPlayer= new MkvPlayer();
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer= new Mp4Player();
        }
    }


    @Override
    public void play(String type, String filename) {
        if(type.equalsIgnoreCase("mkv")){
            advancedMediaPlayer.playMkv(filename);
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
