package co.devfoundry.patterns.commandtask.workshop;

import co.devfoundry.patterns.command.workshop.command.Command;
import co.devfoundry.patterns.commandtask.workshop.command.MusicPlayerCommand;

public class MusicPlayerRemote {
    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton() {
        musicPlayerCommand.play();
        }

    }

