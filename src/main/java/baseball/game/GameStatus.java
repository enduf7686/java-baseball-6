package baseball.game;

public enum GameStatus {

    PLAYING,
    END;

    public static GameStatus setGameStatus(int restartNumber) {
        if (restartNumber == 1) {
            return PLAYING;
        }

        return END;
    }
}
