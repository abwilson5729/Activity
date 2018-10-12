

public class VehicleFrame implements Chassis{

  private String vehicleFrameType;

  @Override
  public void setChassisType(String vehicleChassis) {

  }

  public Chassis getChassisType() {
    return null;
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }


}
