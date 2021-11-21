package io.zipcoder;


public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int forward = startIndex;
        int backward = startIndex;
        int forwards = 0;
        int backwards = 0;

        while(!playList[forward].equals(selection) && !playList[backward].equals(selection)){
            if(backward == 0){
                backward = playList.length - 1;
            }
            else{
                backward--;
            }
            backwards++;
            if(forward == playList.length - 1){
                forward = 0;
            }
            else{
                forward++;
            }
            forwards++;
        }
        return Math.min(forwards,backwards);
    }
}
