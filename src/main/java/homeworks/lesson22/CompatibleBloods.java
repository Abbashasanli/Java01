package homeworks.lesson22;

import static homeworks.lesson22.BloodType.A;
import static homeworks.lesson22.BloodType.B;
import static homeworks.lesson22.BloodType.AB;
import static homeworks.lesson22.BloodType.O;



public enum CompatibleBloods {

    First (new BloodType[]{A}),
    Second(new BloodType[]{A,B}) ,
    Third (new BloodType[]{A,B,AB}),
    Fourth(new BloodType[]{A,B,AB,O});

    private final BloodType[]types;

    CompatibleBloods(BloodType[] types) {
        this.types = types;
    }
}
