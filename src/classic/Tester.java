package classic;

public class Tester {

	public static void main(String[] args) {
		Music music = new Music();
		GenreMusic genremusic = new GenreMusic();
		System.out.println("--- Play List ---");

		String[] names = {"Beetoven","Handel","Vivaldi"};
		String[] songs = {"Destiny","Messiah","Four Seasons"};
		String[] genres = {"Symphony","Oratirio","Concerto"};


		for(int i=0; i<names.length;i++) { 
			for(int j=0; j<songs.length;j++) {
				if (i==j) {
					music.setSong(songs[j]);
					music.setName(names[i]);
					genremusic.setGenre(genres[i]);
					System.out.println(music.getSong()+" of "+music.getName());	
					System.out.println(music.getSong()+" of "+music.getName()+" ("+genremusic.getGenre()+")");
				}

				else {
				}
			}
		}
	}
}


	


