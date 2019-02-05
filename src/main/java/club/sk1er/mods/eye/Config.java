package club.sk1er.mods.eye;

public class Config {

    private int interval = 20;
    private int duration = 20;
    private int corner = 1;
    private boolean enabled = true;
    private boolean chat = true;
    private boolean pingWhenDone = true;
    private boolean pingWhenReady = true;

    public boolean isPingWhenDone() {
        return pingWhenDone;
    }

    public void setPingWhenDone(boolean pingWhenDone) {
        this.pingWhenDone = pingWhenDone;
    }

    public boolean isPingWhenReady() {
        return pingWhenReady;
    }

    public void setPingWhenReady(boolean pingWhenReady) {
        this.pingWhenReady = pingWhenReady;
    }

    public boolean isChat() {
        return chat;
    }

    public void setChat(boolean chat) {
        this.chat = chat;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCorner() {
        return corner;
    }

    public void setCorner(int corner) {
        this.corner = corner;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
