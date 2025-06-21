package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        ThreeWheelConstants.forwardTicksToInches = .01225;
        ThreeWheelConstants.strafeTicksToInches = .0029;
        ThreeWheelConstants.turnTicksToInches = .00723;
        ThreeWheelConstants.leftY = -8.15;
        ThreeWheelConstants.rightY = 8.15;
        ThreeWheelConstants.strafeX = +0.95;
        ThreeWheelConstants.leftEncoder_HardwareMapName = "rightFront";
        ThreeWheelConstants.rightEncoder_HardwareMapName = "leftFront";
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "leftBack";
        ThreeWheelConstants.leftEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.rightEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.strafeEncoderDirection = Encoder.FORWARD;
    }
}




