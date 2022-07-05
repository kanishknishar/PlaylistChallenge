# Playlist Challenge

For this challenge, we were tasked to simulate the playing songs from a playlist (made with a LinkedList.) An additional condition was making sure that only songs that are stored in an an album can be added to the playlist.
     
I have created three classes for the playlist: Song, Album (holding an ArrayList of songs) and Playlist (containing a LinkedList of Song objects.) My Main class is the 'UI' so to speak which holds the list of options that exist for a user and adhering to single responsibility principle, I have created methods within Main that call methods from the Playlist class. The Main methods are responsible for printing of all data whereas the playlist class only return values.
     
The user can do play songs from the playlist, add songs to the playlist and arrange the playlist by track length among other things.
