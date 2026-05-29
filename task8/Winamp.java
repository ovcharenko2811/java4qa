package task8;

public class Winamp {

    static void main() {
        Playlist playlist = new Playlist("Детская музыка");
        playlist.addTrack("Три кота");
        playlist.addTrack("Кукутики");
        playlist.addTrack("Малышарики");
        playlist.updateTrack(1, "Hard Rock Hallelujah");
        playlist.deleteTrack(0);
        playlist.getTrackByIndex(0);
        System.out.println(); //просто отступил для разделения вывода логов и объекта
        System.out.println(playlist);
    }
}
