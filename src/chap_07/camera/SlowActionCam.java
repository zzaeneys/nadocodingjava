package chap_07.camera;

public class SlowActionCam {
    public String name;
    public String lens = "광각렌즈";
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    public final void makeVideo() {
        System.out.println(this.name + " : "
                + this.lens + "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 제작합니다.");
    }

}
