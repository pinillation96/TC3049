public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String type, String filename) {

        if(type.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 "+filename);
        }else if(type.equalsIgnoreCase("mkv")||type.equalsIgnoreCase("mp4")){
            mediaAdapter= new MediaAdapter(type);
            mediaAdapter.play(type,filename);
        }else{
            System.out.println("Format not supported");
        }

    }
}
