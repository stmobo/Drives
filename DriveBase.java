public abstract class DriveBase {

    public float clip(float x) {
        if (x > 1) {
            return 1;
        } else if (x < -1) {
            return -1;
        } else {
            return x;
        }
    }

}
