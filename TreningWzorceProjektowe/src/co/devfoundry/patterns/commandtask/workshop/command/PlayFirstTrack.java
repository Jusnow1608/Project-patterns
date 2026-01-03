package co.devfoundry.patterns.commandtask.workshop.command;

import co.devfoundry.patterns.commandtask.workshop.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand{

    private MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
     musicPlayer.playFirstTrack();
    }
}
