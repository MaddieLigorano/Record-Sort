package record;
import java.util.*;
public class RecordingSort {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String songName;
        String artistName;
        
        String tempInt;
        
        Recording []record;
        record = new Recording[5];
        for(int x = 0; x<5; x++)
            record[x] = new Recording();
       
        for(int g = 0; g<5; g++)
        {
            songName = sc.nextLine();
            artistName = sc.nextLine();
            tempInt = sc.nextLine();
           
            Integer number = Integer.valueOf(tempInt);
             
            record[g].setSong(songName);
            record[g].setArtist(artistName);
            record[g].setPlayTime(number);
        }
        System.out.println("Pick what you want sorted. S for song, A for artist, and T for playing time");
        String picker;//holds the selection
        picker = sc.nextLine();
        if(0 == picker.compareToIgnoreCase("S"))
        sortBySong(record);
        if(0 == picker.compareToIgnoreCase("A"))
        sortByArtist(record);
        if(0 == picker.compareToIgnoreCase("T"))
        sortByTime(record);
    }

    public static void sortByArtist(Recording[] array) {
        int compare;
        Recording names[]= new Recording[5];
        for(int y = 0; y<5; y++)
        {
            names[y] = new Recording();
        }
        String temp1 = "";
        String temp2 = " ";
        names = loader(array);
        for(int x = 0; x<4; x++)
        {
            for(int d = 0; d<4; d++)
            {
                temp1 = names[d].getArtist();
                temp2 = names[d+1].getArtist();
                compare = temp1.compareTo(temp2);
                if(compare>0)//checking to see temp1 is bigger then temp2
                {
                    names[d].setArtist(temp2);
                    names[d+1].setArtist(temp1);
                }
            }
        }
        System.out.println("Sorted Artist name");
        for(int u = 0; u<5; u++)
        System.out.print(names[u].getArtist()+" ");

        System.out.print("\n");
    }

    public static void sortBySong(Recording[] array) {
        
        int compare;
        Recording names[]= new Recording[5];
        for(int y = 0; y<5; y++)
        {
            names[y] = new Recording();
        }
        String temp1 = "";
        String temp2 = " ";
        names = loader(array);
        for(int x = 0; x<4; x++)
        {
            for(int d = 0; d<4; d++)
            {
                temp1 = names[d].getSong();
                temp2 = names[d+1].getSong();
                compare = temp1.compareTo(temp2);
                if(compare>0)//checking to see temp1 is bigger then temp2
                {
                    names[d].setSong(temp2);
                    names[d+1].setSong(temp1);
                }
            }
        }
        System.out.println("Sorted song");
        for(int u = 0; u<5; u++)
        System.out.print(names[u].getSong()+" ");
        
        System.out.print("\n");
    }

    public static void sortByTime(Recording[] array) {
        Recording names[]= new Recording[5];
        for(int y = 0; y<5; y++)
        {
            names[y] = new Recording();
        }
        int temp1;
        int temp2;
        names = loader(array);
        System.out.println(names[0].getPlayTime());
        for(int x = 0; x<4; x++)
        {
            for(int d = 0; d<4; d++)
            {
                temp1 = names[d].getPlayTime();
                temp2 = names[d+1].getPlayTime();
                
                if(temp1>temp2)//checking to see temp1 is bigger then temp2
                {
                    names[d].setPlayTime(temp2);
                    names[d+1].setPlayTime(temp1);
                }
            }
        }
        System.out.println("sorted play time");
        for(int u = 0; u<5; u++)
        System.out.print(names[u].getPlayTime()+" ");
        
        System.out.print("\n");
    }
    public static Recording[] loader(Recording[] array)//loader for temp array search
    {   
        String song;
        String name;
        int saleNum;
        Recording []devils;
        devils = new Recording[5];
         for(int g = 0; g<5; g++)
        {
            song = array[g].getSong();
            name = array[g].getArtist();
            saleNum = array[g].getPlayTime();
            devils[g] = new Recording(song, name, saleNum);
        }
            return devils;

    }
}
