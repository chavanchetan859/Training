package Quetion2;

public class QueueSongList {

    private SongList[] songsArray;
    private int capacity;
    private int front;
    private int rear;

    public QueueSongList(int capacity) {
        this.capacity = capacity;
        this.songsArray = new SongList[capacity];
        this.front=-1;
        this.rear=-1;
    }

    boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    void enqueSong(SongList song) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % capacity;
            songsArray[rear] = song;
            System.out.println("Inserted " + song);
        }
    }

    // Removing an element
    void dequeueSong() {
        SongList removedSong;
        if (isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            removedSong = songsArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % capacity;
            }
            System.out.println(removedSong+" is removed");
        }
    }


    public void playSong(String name)
    {
        if(isEmpty()) {
            System.out.println("Playlist is empty");
        }
        else {
            for (int i = 0; i <rear; i++) {
                if (name == songsArray[i].getSong()) {
                    System.out.println(songsArray[i].getSong() + " is playing");
                    break;
                }
                else {
                    System.out.println(name + " is not found in the playlist");
                    break;
                }
            }
        }
    }
    public void allSongs()
    {
        if(isEmpty()) {
            System.out.println("Playlist is empty");
        }
        else {
                int i;
                for ( i = front; i != rear; i = (i + 1) % capacity)
                    System.out.print(songsArray[i] + " ");
                System.out.println(songsArray[i]);
        }
    }
    public void totalSongs()
    {
        if(isEmpty())
            System.out.println("Available song- 0");
        else
            System.out.println("Available song-"+(rear-front+1));
    }
}
