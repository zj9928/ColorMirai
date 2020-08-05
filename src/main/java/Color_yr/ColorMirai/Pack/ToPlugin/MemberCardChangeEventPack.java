package Color_yr.ColorMirai.Pack.ToPlugin;

public class MemberCardChangeEventPack {
    private long id;
    private long fid;
    private String old;
    private String new_;

    public MemberCardChangeEventPack(long id, long fid, String old, String new_) {
        this.fid = fid;
        this.id = id;
        this.old = old;
        this.new_ = new_;
    }

    public MemberCardChangeEventPack() {
    }

    public long getId() {
        return id;
    }

    public String getNew_() {
        return new_;
    }

    public String getOld() {
        return old;
    }

    public long getFid() {
        return fid;
    }
}