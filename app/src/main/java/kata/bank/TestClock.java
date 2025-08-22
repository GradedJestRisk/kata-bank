package kata.bank;

import java.time.LocalDateTime;

public class TestClock implements Clock{

    private LocalDateTime time;
    public TestClock(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public LocalDateTime getTime() {
        return time;
    }
}
