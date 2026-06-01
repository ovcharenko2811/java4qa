package task8;

import java.util.ArrayList;

public class Playlist {
    String playlistName;
    ArrayList<String> trackList;

    // Конструктор
    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.trackList = new ArrayList<>();
        System.out.println("Создан плейлист:  \"" + playlistName + "\"");
    }
//1. добавление песни в плейлист
//2. удаление песни по индексу
//3. обновление песни по индексу
//4. получение песни по индексу
    public void addTrack(String track){
        trackList.add(track);
        System.out.println("Добавлена песня:  \"" + track + "\"");
    }

    public void deleteTrack(int trackIndex){
        if (trackIndex >= 0 && trackIndex < trackList.size()){
        String track = trackList.get(trackIndex);
        trackList.remove(trackIndex);
        System.out.println("Удалена песня: \"" + track + "\"");
        } else {
            System.out.println("Неверный индекс: " + trackIndex);
        }
    }

    public void updateTrack(int trackIndex, String track){
        if (trackIndex >= 0 && trackIndex < trackList.size()) {
            String trackOld = trackList.get(trackIndex);
            trackList.set(trackIndex, track);
            System.out.println("Обновлена песня " + "\"" + trackOld + "\"" + " с номером " + trackIndex + " на \"" + track + "\"");
        } else {
            System.out.println("Неверный индекс: " + trackIndex);
        }
    }

    public void getTrackByIndex(int trackIndex){
        if (trackIndex >= 0 && trackIndex < trackList.size()) {
            String track = trackList.get(trackIndex);
            System.out.println("Получена песня:  \"" + track + "\"");
        } else  {
            System.out.println("Неверный индекс: " + trackIndex);
        }
    }

    @Override
    public String toString() {
        return "Название плейлиста: " + playlistName + '\n' +
                "Список треков: " + trackList;
    }
}
