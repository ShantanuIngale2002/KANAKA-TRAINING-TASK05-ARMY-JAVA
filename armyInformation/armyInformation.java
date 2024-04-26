package Task05Army2304.armyInformation;

public interface armyInformation {
    String organization = "Indian Army";

    void setName(String name);
    void setHeight(float height);
    void setWeight(float weight);
    void setDOB(String camp);
    void updateStatus();

    String getName();
    float getHeight();
    float getWeight();
    String getDOB();
    String getOrg();
}
