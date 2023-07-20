package com.example.android.nikosmusicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Code for SONGS
        //Find the View that shows the Songs Category
        TextView songs=(TextView) findViewById(R.id.songs);
        //Set a clicklistener on that view
        songs.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent songsIntent=new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });


        //Code for ARTISTS
        //Find the View that shows the Songs Category
        TextView artists=(TextView) findViewById(R.id.artists);
        //Set a clicklistener on that view
        artists.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent artistsIntent=new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });


        //Code for ALBUMS
        //Find the View that shows the Songs Category
        TextView albums=(TextView) findViewById(R.id.albums);
        //Set a clicklistener on that view
        albums.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent albumsIntent=new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        //Code for PLAYLISTS
        //Find the View that shows the Songs Category
        TextView playlists=(TextView) findViewById(R.id.playlists);
        //Set a clicklistener on that view
        playlists.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent playlistsIntent=new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });


    }
}
