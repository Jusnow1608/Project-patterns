package co.devfoundry.patterns.commandtask.workshop.command;

import co.devfoundry.patterns.commandtask.workshop.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand{

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
