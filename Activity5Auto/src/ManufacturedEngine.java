import java.util.Date;

public class ManufacturedEngine implements Engine {
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine() {
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 4;
    engineType = "Generic";
    driveTrain = "Generic";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, int engineCylinders, String engineType,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }

  @Override
  public String toString() {
    return "ManufacturedEngine{" +
        "engineManufacturer ='" + engineManufacturer + '\'' +
        ", engineManufacturedDate =" + engineManufacturedDate +
        ", engineMake ='" + engineMake + '\'' +
        ", engineModel ='" + engineModel + '\'' +
        ", engineCylinders =" + engineCylinders +
        ", engineType ='" + engineType + '\'' +
        ", driveTrain ='" + driveTrain + '\'' +
        '}';
  }
}
