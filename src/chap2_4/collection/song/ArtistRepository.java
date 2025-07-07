package chap2_4.collection.song;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// 가수 객체를 자료구조로 관리하는 클래스
public class ArtistRepository {

    // 가수들을 담을 자료구조
    // key: 가수명, value: 가수 객체
    private Map<String, Artist> artistMap;

    public ArtistRepository() {
        this.artistMap = new HashMap<>();
    }

    public int count() {
        return artistMap.size();
    }

    public void addArtist(String artistName, String songName) {
        Artist artist = artistMap.get(artistName);

        if (artist == null) {
            artist = new Artist(artistName);
            artistMap.put(artistName, artist);
        }

        artist.getSongList().add(songName);
    }

    public Artist search(String artistName) {
        return artistMap.get(artistName);
    }
    public Collection<Artist> findAll() {
        return artistMap.values();
    }

}
