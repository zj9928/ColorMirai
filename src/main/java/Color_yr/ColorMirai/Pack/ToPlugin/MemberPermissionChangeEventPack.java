package Color_yr.ColorMirai.Pack.ToPlugin;

/*
41 [机器人]成员权限改变（事件）
id：群号
fid：执行人QQ号
old：旧的状态
new_：新的状态
 */
public class MemberPermissionChangeEventPack {
    private long id;
    private long fid;
    private String old;
    private String new_;

    public MemberPermissionChangeEventPack(long id, long fid, String old, String new_) {
        this.fid = fid;
        this.id = id;
        this.old = old;
        this.new_ = new_;
    }

    public MemberPermissionChangeEventPack() {
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getNew_() {
        return new_;
    }

    public void setNew_(String new_) {
        this.new_ = new_;
    }
}
