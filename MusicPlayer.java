import java.util.*;
import java.util.Scanner;

public class MusicPlayer {

    static ArrayList<String> library = new ArrayList<>();
    static ArrayList<String> playlist = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n===== MUSIC PLAYER =====");

            System.out.println("1. Add Song");
            System.out.println("2. View Library");
            System.out.println("3. Create Playlist");
            System.out.println("4. View Playlist");
            System.out.println("5. Play Song");
            System.out.println("6. Pause");
            System.out.println("7. Stop");
            System.out.println("8. Skip");
            System.out.println("9. Search");
            System.out.println("10. Exit");

            System.out.print("Choice: ");

            int choice=sc.nextInt();

            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Song Name: ");

                    String song=sc.nextLine();

                    library.add(song);

                    System.out.println("Song Added");

                    break;

                case 2:

                    System.out.println("\nMusic Library:");

                    for(int i=0;i<library.size();i++){

                        System.out.println(
                                (i+1)+". "+library.get(i)
                        );

                    }

                    break;

                case 3:

                    System.out.print(
                            "Song Number:"
                    );

                    int n=sc.nextInt();

                    if(n<=library.size()){

                        playlist.add(
                                library.get(n-1)
                        );

                        System.out.println(
                                "Added To Playlist"
                        );

                    }

                    break;

                case 4:

                    System.out.println(
                            "\nPlaylist:"
                    );

                    for(String s:playlist){

                        System.out.println(
                                s
                        );

                    }

                    break;

                case 5:

                    if(!playlist.isEmpty()){

                        System.out.println(
                                "Playing: "
                                +
                                playlist.get(0)
                        );

                    }

                    else{

                        System.out.println(
                                "Playlist Empty"
                        );

                    }

                    break;

                case 6:

                    System.out.println(
                            "Paused"
                    );

                    break;

                case 7:

                    System.out.println(
                            "Stopped"
                    );

                    break;

                case 8:

                    System.out.println(
                            "Skipped"
                    );

                    break;

                case 9:

                    System.out.print(
                            "Search Song: "
                    );

                    String search=
                            sc.nextLine();

                    if(
                            library.contains(search)
                    ){

                        System.out.println(
                                "Found"
                        );

                    }

                    else{

                        System.out.println(
                                "Not Found"
                        );

                    }

                    break;

                case 10:

                    System.exit(0);

            }

        }

    }

}
