package co.devfoundry.patterns.commandtask;

import co.devfoundry.patterns.commandtask.workshop.MusicPlayer;
import co.devfoundry.patterns.commandtask.workshop.MusicPlayerRemote;
import co.devfoundry.patterns.commandtask.workshop.command.PlayFirstTrack;
import co.devfoundry.patterns.commandtask.workshop.command.PlayNextTrack;
import co.devfoundry.patterns.commandtask.workshop.command.PlayRandomTrack;

public class Main {
    public static void main(String [] args)
    {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
