package swu.xl.mvctest;

public class NumModel {
    private int num = 0;

    public void add(ControllerActivity controllerActivity){
        num++;
        controllerActivity.updateUI(num+"");
    }

}
