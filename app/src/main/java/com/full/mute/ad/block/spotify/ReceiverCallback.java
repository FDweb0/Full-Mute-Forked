package com.full.mute.ad.block.spotify;

public interface ReceiverCallback {
    // Declaration of the callback template function for the interface
    void metadataChanged(Song song); // when metadata has changed!

    void playbackStateChanged(boolean isPlaying, int playbackPos, Song song); // when playback state has changed!
}
